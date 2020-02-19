package main.controllers;

import main.builders.AnswerRequestBuilder;
import main.builders.AnswerTokenBuilder;
import main.builders.NotificationTokenBuilder;
import main.model.*;
import main.services.ArtPieceService;
import main.services.NotificationService;
import main.services.UserLoggingService;
import main.services.UserService;
import main.utils.NotificationTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.misc.Request;

import javax.rmi.PortableRemoteObject;
import java.util.Arrays;

@RestController
@RequestMapping(value="/notifications")
public class NotificationController {

    @Autowired
    NotificationService notifications;

    @Autowired
    ArtPieceService artPieces;

    @Autowired
    UserService users;

    @Autowired
    UserLoggingService usersLogs;

    @RequestMapping(value="", method=RequestMethod.POST)
    public void bid(@RequestBody NotificationTokenBuilder bidToken) {
        // This method must check if the sender is registered in the platform and if it's logged
        // Check if the art piece exists
        // Check if the art piece belongs to the author
        UserToken token = bidToken.getToken();
        UserLogging userLogging = usersLogs.findById(token.getId());

        Preconditions.checkFound(users.findById(userLogging.getId()));
        Preconditions.isUserLogged(userLogging!=null);

        Notification bid = bidToken.getNotification();
        Preconditions.isTheRightUser(userLogging.getId().equals(bid.getSender()));

        int id = bid.getArtPieceId();
        ArtPiece artPiece = artPieces.findById(id);
        Preconditions.checkFound(artPiece);
        Notification notification = new Notification(
                bid.getId(), bid.getSender(), bid.getReceiver(), bid.getArtPieceId(), bid.getArtPieceName(), bid.getCoverImage(),
                NotificationTypes.BID, bid.getValue(), bid.getMessage()
        );
        artPieces.incrementBids(artPiece);
        notifications.addNotification(notification);
    }

    @RequestMapping(value="/answer", method=RequestMethod.POST)
    public void answer(@RequestBody AnswerTokenBuilder answerToken) {
        UserToken token = answerToken.getToken();
        UserLogging userLogging = usersLogs.findById(token.getId());
        Preconditions.checkFound(users.findById(userLogging.getId()));
        Preconditions.isUserLogged(userLogging!=null);
        AnswerRequestBuilder answer = answerToken.getAnswer();
        Notification n = answer.getNotification();

        Preconditions.isTheRightUser(userLogging.getId().equals(n.getSender()));

        Notification request = notifications.findById(answer.getRequestId());
        ArtPiece artPiece = artPieces.findById(n.getArtPieceId());
        Preconditions.checkFound(artPiece);
        Preconditions.checkFound(request);
        Notification notification = new Notification(
            n.getId(), n.getSender(), n.getReceiver(), n.getArtPieceId(), n.getArtPieceName(), n.getCoverImage(),
            NotificationTypes.ANSWER, n.getValue(), n.isAccepted()
        );

        if(notification.isAccepted()) {
            artPieces.markToWaitTransaction(artPiece, request.getSender());
        }

        notifications.markAsSubmitted(request);
        notifications.addNotification(notification);
    }

    @RequestMapping(value="/byReceiver/{id:.+}", method=RequestMethod.GET)
    public Notification [] findByReceiver(@PathVariable String id) {
        Preconditions.checkFound(users.findById(id));
        Preconditions.isUserLogged(usersLogs.findById(id)!=null);
        Notification [] collection = notifications.findByReceiver(id);
        Arrays.sort(collection);
        return collection;
    }

    @RequestMapping(value="/{id}/{userId:.+}", method=RequestMethod.GET)
    public Notification findById(@PathVariable int id, @PathVariable String userId) {
        Preconditions.checkFound(users.findById(userId));
        Preconditions.isUserLogged(usersLogs.findById(userId)!=null);
        System.out.println(notifications.findById(id).getId());
        Notification notification = notifications.findById(id);
        Preconditions.checkFound(notification);
        Preconditions.isTheRightUser(notification.getReceiver().equals(userId));
        return notification;
    }

    @RequestMapping(value="/{id}/{userId:.+}", method=RequestMethod.PUT)
    public Notification seeNotification(@PathVariable int id, @PathVariable String userId) {
        Notification notification = notifications.findById(id);
        Preconditions.checkFound(users.findById(userId));
        Preconditions.isUserLogged(usersLogs.findById(userId)!=null);
        Preconditions.checkFound(notification);
        Preconditions.isTheRightUser(notification.getReceiver().equals(userId));
        notifications.seeNotification(notification);
        return notification;
    }

    @RequestMapping(value="/confirmation", method=RequestMethod.POST)
    public void confirmTransaction(@RequestBody NotificationTokenBuilder notificationToken) {
        UserToken token = notificationToken.getToken();
        UserLogging userLogging = usersLogs.findById(token.getId());

        //Preconditions.isUserLogged(userLogging!=null);
        //Preconditions.isUserAnArtist(userLogging.isArtist());

        Notification notification = notificationToken.getNotification();
        //Preconditions.isTheRightUser(userLogging.getId().equals(notification.getReceiver()));

        ArtPiece artPiece = artPieces.findById(notification.getArtPieceId());
        Preconditions.checkFound(artPiece);
        Preconditions.validArtPiece(artPiece.valid());

        Notification n = new Notification(
                notification.getId(), notification.getSender(), notification.getReceiver(), notification.getArtPieceId(),
                notification.getArtPieceName(), notification.getCoverImage(),
                NotificationTypes.CONFIRMATION, true
        );
        artPieces.sell(artPiece);
        notifications.addNotification(n);
    }
}

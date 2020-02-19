package main.model;


import main.utils.NotificationTypes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Notification implements Comparable<Notification>{

    @Id
    @GeneratedValue
    private int id;
    private String sender;
    private String receiver;
    private int artPieceId;
    private String artPieceName;
    private String coverImage;
    private long notificationTime;
    private boolean seen;
    private String type;
    private double value;
    private String message;
    private boolean submitted;
    private boolean accepted;
    private boolean confirmation;


    public Notification() {}

    public Notification(int id, String sender, String receiver, int artPieceId, String artPieceName, String coverImage, String type) {
        super();
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.artPieceId = artPieceId;
        this.artPieceName = artPieceName;
        this.coverImage = coverImage;
        this.type = type;
        this.notificationTime = System.currentTimeMillis();
        this.seen = false;
    }

    // Bid notification
    public Notification(int id, String sender, String receiver, int artPieceId, String artPieceName, String coverImage,
                         String type, double value, String message) {
        this(id, sender, receiver, artPieceId, artPieceName, coverImage, type);
        this.message = message;
        this.value = value;
        this.submitted = false;
    }

    //Answer Notification
    public Notification(int id, String sender, String receiver, int artPieceId, String artPieceName, String coverImage, String type,
                        double value, boolean accepted) {
        this(id, sender, receiver, artPieceId, artPieceName, coverImage, type);
        this.value = value;
        this.submitted = false;
        this.accepted = accepted;
    }

    // Confirmation Notification
    public Notification(int id, String sender, String receiver, int artPieceId, String artPieceName, String coverImage, String type,
                        boolean confirmation) {
        this(id, sender, receiver, artPieceId, artPieceName, coverImage, type);
        this.confirmation = confirmation;
    }


    public int getId() {
        return id;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public int getArtPieceId() {
        return artPieceId;
    }

    public String getArtPieceName() {
        return artPieceName;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public long getNotificationTime() {
        return notificationTime;
    }

    public boolean isSubmitted() {
        return submitted;
    }

    public boolean isSeen() {
        return seen;
    }

    public String getType() {
        return type;
    }

    public double getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }

    public boolean isAccepted() {
        return accepted;
    }

    // Setters
    public void seeNotification() {
        this.seen = true;
    }

    public void markAsSubmitted() {
        this.submitted = true;
    }

    // Comparator
    public int compareTo(Notification n) {
        if(this.notificationTime > n.notificationTime)
            return -1;
        else if(this.notificationTime < n.notificationTime)
            return 1;
        return 0;
    }


    /*
    public String getType() {
        return type;
    }

    public double getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSubmitted() {
        return submitted;
    }

    public boolean isAccepted() {
        return accepted;
    }

    */
}

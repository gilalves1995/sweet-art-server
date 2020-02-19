package main.controllers;

import main.builders.ArtPieceBuilder;
import main.builders.GeneralBuilder;
import main.model.*;
import main.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(value="/artPieces")
public class ArtPieceController {

    @Autowired
    ArtPieceService artPieces;

    @Autowired
    KeywordService keywords;

    @Autowired
    ImageService images;

    @Autowired
    UserService users;

    @Autowired
    UserLoggingService usersLogs;

    @RequestMapping(value="", method=RequestMethod.GET)
    public ArtPiece [] getAll() {

        return artPieces.findAll();
    }

    @RequestMapping(value="", method=RequestMethod.POST)
    public ArtPiece createArtPiece(@RequestBody GeneralBuilder obj) {

        UserToken token = obj.getToken();
        UserLogging userLogging = usersLogs.findById(token.getId());
        
        Preconditions.isUserLogged(userLogging!=null);
        Preconditions.isUserAnArtist(userLogging.isArtist());

        ArtPieceBuilder artPieceBuilder = obj.getArtPiece();
        ArtPiece artPiece = artPieceBuilder.getArtPiece();

        Preconditions.validArtPiece(artPiece.valid());

        artPieces.create(artPiece);
        addImageSet(artPiece.getId(), artPieceBuilder.getImages());
        addKeywordSet(artPiece.getId(), artPieceBuilder.getKeywords());

        return artPiece;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.POST)
    public void deleteArtPiece(@PathVariable int id, @RequestBody UserToken token) {

        UserLogging userLogging = usersLogs.findById(token.getId());

        Preconditions.isUserLogged(userLogging!=null);
        Preconditions.isUserAnArtist(userLogging.isArtist());

        ArtPiece toDelete = artPieces.findById(id);

        Preconditions.checkFound(toDelete);

        keywords.removeByArtPieceId(id);
        images.removeByArtPieceId(id);
        artPieces.remove(id);
    }

    @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
    public ArtPiece updateArtPiece(@PathVariable int id, @RequestBody GeneralBuilder obj) {

        UserToken token = obj.getToken();
        UserLogging userLogging = usersLogs.findById(token.getId());

        Preconditions.isUserLogged(userLogging!=null);
        Preconditions.isUserAnArtist(userLogging.isArtist());

        ArtPieceBuilder artPieceBuilder = obj.getArtPiece();
        ArtPiece artPiece = artPieceBuilder.getArtPiece();

        Preconditions.checkFound(artPieces.findById(id));
        Preconditions.validArtPiece(artPiece.valid());

        artPieces.update(artPiece);
        updateImageSet(artPiece.getId(), artPieceBuilder.getImages());
        updateKeywordSet(artPiece.getId(), artPieceBuilder.getKeywords());

        return artPiece;
    }

    @RequestMapping(value="/byKeyword/{keyword}", method=RequestMethod.GET)
    public ArtPiece [] artPiecesByKeyword(@PathVariable String keyword) {
        Keyword [] found = keywords.findByKeyword(keyword);
        List <Integer> idList = new ArrayList<>(found.length);
        for(int i = 0; i < found.length; i++)
            idList.add(found[i].getArtPieceId());
        return artPieces.mapByIds(idList);
    }

    @RequestMapping(value="/byAuthor/{id:.+}", method=RequestMethod.GET)
    public ArtPiece [] artPiecesByAuthor(@PathVariable String id) {
        Preconditions.checkFound(users.findById(id));
        ArtPiece [] found = artPieces.findByAuthor(id);
        return found;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ArtPieceBuilder getDetails(@PathVariable int id) {
        ArtPiece artPiece = artPieces.findById(id);
        Preconditions.checkFound(artPiece);
        Keyword [] keywords = this.keywords.findByArtPieceId(id);
        Image [] images = this.images.findByArtPieceId(id);

        List<String> keywordList = new ArrayList<>(keywords.length);
        List<String> imageList = new ArrayList<>(images.length);
        for(int i = 0; i < keywords.length; i++)
            keywordList.add(keywords[i].getKeyword());
        for(int j = 0; j < images.length; j++)
            imageList.add(images[j].getUrl());

        return new ArtPieceBuilder(artPiece, keywordList.toArray(new String[keywordList.size()]), imageList.toArray(new String[imageList.size()]));
    }

    @RequestMapping(value="/ownership/{id}/{userId:.+}", method=RequestMethod.PUT)
    public void makeOwnershipPublic(@PathVariable int id, @PathVariable String userId) {
        Preconditions.checkFound(users.findById(userId));
        Preconditions.isUserLogged(usersLogs.findById(userId)!=null);
        ArtPiece artPiece = artPieces.findById(id);
        Preconditions.checkFound(artPiece);
        artPieces.makeOwnershipPublic(artPiece);
    }

    @RequestMapping(value="/byCurrentOwner/{id:.+}", method=RequestMethod.GET)
    public ArtPiece [] findByCurrentOwner(@PathVariable String id) {
        System.out.println("Current Owner: " + id);
        Preconditions.checkFound(users.findById(id));
        Preconditions.isUserLogged(usersLogs.findById(id)!=null);
        return artPieces.findByCurrentOwner(id);
    }

    // Private methods

    // Adds a keyword set to a specific art piece
    private void addKeywordSet(int id, String [] keywords) {
        Set<String> set = new HashSet<>(Arrays.asList(keywords));
        List <Keyword> l = new ArrayList<>(set.size());
        for(String k: set)
            l.add(new Keyword(k, id));
        this.keywords.addKeywordSet(l);
    }

    // Adds an image set to a specific art piece
    private void addImageSet(int id, String [] urls) {
        Set<String> set = new HashSet<>(Arrays.asList(urls));
        List<Image> l = new ArrayList<>(set.size());
        for(String url: set)
            l.add(new Image(url, id));
        images.addImageSet(l);
    }

    // Updates a keyword set of a specific art piece
    private void updateKeywordSet(int id, String [] keywords) {
        Set<String> newSet = new HashSet<>(Arrays.asList(keywords));
        Set<String> current = new HashSet<>();
        List <Keyword> tmp = Arrays.asList(this.keywords.findByArtPieceId(id));
        for(Keyword k: tmp)
            current.add(k.getKeyword());
        if(!newSet.equals(current))
            this.keywords.updateKeywordSet(id, newSet);
    }

    // Updates a keyword set of a specific art piece
    private void updateImageSet(int id, String [] urls) {
        Set<String> newSet = new HashSet<>(Arrays.asList(urls));
        Set<String> current = new HashSet<>();
        List <Image> tmp = Arrays.asList(images.findByArtPieceId(id));
        for(Image img: tmp)
            current.add(img.getUrl());
        if(!newSet.equals(current))
            images.updateImageSet(id, newSet);
    }
}

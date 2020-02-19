package main.controllers;

import main.model.Keyword;
import main.services.ArtPieceService;
import main.services.KeywordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.*;

@RestController
@RequestMapping(value="/keywords")
public class KeywordController {

    @Autowired
    KeywordService keywords;

    @Autowired
    ArtPieceService artPieces;

    /*
    // Called when an art piece is added
    @RequestMapping(value="/{id}", method=RequestMethod.POST)
    public void addKeywordSet(@PathVariable int id, @RequestBody String [] keywords) {
        Preconditions.checkFound(artPieces.findById(id));
        // Remove duplicates on the keyword array
        Set <String> set = new HashSet<>(Arrays.asList(keywords));
        List<Keyword> list = new ArrayList<>(set.size());
        Iterator<String> it = set.iterator();
        while(it.hasNext())
            list.add(new Keyword(it.next(), id));
        this.keywords.addKeywordSet(list);
    }
    */

    @RequestMapping(value="", method=RequestMethod.GET)
    public Keyword [] getAll() {
        return keywords.getAll();
    }

    @RequestMapping(value="/{artPieceId}", method=RequestMethod.GET)
    public Keyword [] filterById(@PathVariable int artPieceId) {
        Preconditions.checkFound(artPieces.findById(artPieceId));
        return keywords.findByArtPieceId(artPieceId);
    }

    /*
    // Called when deleting an art piece
    @RequestMapping(value="/{artPieceId}", method=RequestMethod.DELETE)
    public void removeByArtPieceId(@PathVariable int artPieceId) {
        Preconditions.checkFound(artPieces.findById(artPieceId));
        keywords.removeByArtPieceId(artPieceId);
    }
    */

    /*
    // Called when updating an art piece
    @RequestMapping(value="/{artPieceId}", method=RequestMethod.PUT)
    public void updateKeywordSet(@PathVariable int artPieceId, @RequestBody String [] keywords) {
        Preconditions.checkFound(artPieces.findById(artPieceId));
        // Gets current set of keywords
        Set<String> newSet = new HashSet<>(Arrays.asList(keywords));
        Set <String> currentSet = new HashSet<>();
        List <Keyword> tmp = Arrays.asList(this.keywords.findByArtPieceId(artPieceId));
        for(Keyword k: tmp)
            currentSet.add(k.getKeyword());
        if(!newSet.equals(currentSet))
            this.keywords.updateKeywordSet(artPieceId, newSet);
    }
    */

}

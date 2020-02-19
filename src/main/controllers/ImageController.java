package main.controllers;

import main.model.Image;
import main.services.ArtPieceService;
import main.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.misc.Request;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/images")
public class ImageController {

    @Autowired
    ImageService images;

    @Autowired
    ArtPieceService artPieces;

    @RequestMapping(value="", method= RequestMethod.GET)
    public Image [] getAll() {
        return images.findAll();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Image [] findByArtPieceId(@PathVariable int id) {
        Preconditions.checkFound(artPieces.findById(id));
        return images.findByArtPieceId(id);
    }
}

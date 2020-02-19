package main.services;

import main.model.Image;

public interface ImageService {

    // Adds a set of images to the database
    void addImageSet(Iterable <Image> imageSet);

    // Gets all the images in the database
    Image [] findAll();

    // Gets all the images of a specific art piece
    Image [] findByArtPieceId(int artPieceId);

    // Removes an image set
    void removeByArtPieceId(int id);

    // Updates the image set associated with a specific art piece
    void updateImageSet(int id, Iterable<String> images);

}

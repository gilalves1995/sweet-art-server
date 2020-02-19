package main.services;

import main.model.ArtPiece;

import java.util.List;

public interface ArtPieceService {

    // Finds all art pieces in database
    ArtPiece [] findAll();

    // Creates a new art piece
    void create(ArtPiece artPiece);

    // Removes the art piece with the given id
    void remove(int id);

    // Updates a given art piece
    void update(ArtPiece a);

    // Increments the number of a given art piece
    void incrementBids(ArtPiece a);

    // Finds the art piece with the given id
    ArtPiece findById(int id);

    // Finds all the art pieces that map the given list of ids
    ArtPiece [] mapByIds(List<Integer> idList);

    // Finds all the art pieces made by a specific author
    ArtPiece [] findByAuthor(String author);


    void markToWaitTransaction(ArtPiece a, String newOwner);

    void makeOwnershipPublic(ArtPiece a);

    void sell(ArtPiece a);

    ArtPiece [] findByCurrentOwner(String currentOwner);

}

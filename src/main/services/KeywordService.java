package main.services;

import main.model.Keyword;

public interface KeywordService {

    // Adds a set of keywords to the database
    void addKeywordSet(Iterable<Keyword> keywords);

    // Retrieves every keyword in database
    Keyword [] getAll();

    // Returns the keywords associated with the given id
    Keyword [] findByArtPieceId(int id);

    // Retrieves every keyword with the label keyword
    Keyword [] findByKeyword(String keyword);

    // Removes all the keywords of a specified art piece
    void removeByArtPieceId(int id);

    // Updates the keyword set
    void updateKeywordSet(int artPieceId, Iterable<String> keywords);
}

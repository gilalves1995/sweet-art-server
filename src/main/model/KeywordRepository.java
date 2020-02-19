package main.model;

import org.springframework.data.repository.CrudRepository;

public interface KeywordRepository extends CrudRepository<Keyword, String> {

    Iterable <Keyword> findByArtPieceId(int id);

    Iterable <Keyword> findByKeyword(String keyword);

    /*
    //Keyword [] findByArtPieceId(int id);

    Keyword [] findByKeyword(String keyword);

    Iterable<Keyword> findByArtPieceId(int id);
    */

}

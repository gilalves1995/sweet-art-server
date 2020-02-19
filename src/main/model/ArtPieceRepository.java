package main.model;

import org.springframework.data.repository.CrudRepository;

public interface ArtPieceRepository extends CrudRepository<ArtPiece, Integer>{

    ArtPiece [] findByName(String name);

    Iterable<ArtPiece> findByAuthor(String author);

    Iterable<ArtPiece> findByCurrentOwner(String currentOwner);



}

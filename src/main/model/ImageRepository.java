package main.model;

import org.springframework.data.repository.CrudRepository;

public interface ImageRepository extends CrudRepository<Image, Integer> {

    // Finds all the images associated with the given id
    Iterable <Image> findByArtPieceId(int artPieceId);
}

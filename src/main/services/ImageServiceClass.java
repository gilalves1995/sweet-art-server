package main.services;

import main.model.Image;
import main.model.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ImageServiceClass implements ImageService {

    @Autowired
    ImageRepository repository;

    @Override
    public void addImageSet(Iterable <Image> imageSet) {
        repository.save(imageSet);
    }

    @Override
    public Image [] findAll() {
        List<Image> l = (List)repository.findAll();
        return l.toArray(new Image[l.size()]);
    }

    @Override
    public Image [] findByArtPieceId(int artPieceId) {
        List<Image> images = (List) repository.findByArtPieceId(artPieceId);
        return images.toArray(new Image [images.size()]);
    }

    @Override
    public void removeByArtPieceId(int id) {
        List <Image> keywords = (List)repository.findByArtPieceId(id);
        repository.delete(keywords);
    }

    @Override
    public void updateImageSet(int id, Iterable <String> images) {
        Set<Image> set = new HashSet<>();
        for(String url: images)
            set.add(new Image(url, id));
        List <Image> toDelete = (List)repository.findByArtPieceId(id);
        repository.delete(toDelete);
        repository.save(set);
    }
}

package main.services;

import main.model.Keyword;
import main.model.KeywordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class KeywordServiceClass implements KeywordService {

    @Autowired
    KeywordRepository repository;

    @Override
    public void addKeywordSet(Iterable <Keyword> keywords) {
        repository.save(keywords);
    }

    @Override
    public Keyword [] getAll() {
        List<Keyword> list = new ArrayList<>();
        for(Keyword item: repository.findAll()) {
            list.add(item);
        }
        return list.toArray(new Keyword[list.size()]);
    }

    @Override
    public Keyword [] findByArtPieceId(int id) {
        List <Keyword> keywords = (List)repository.findByArtPieceId(id);
        return keywords.toArray(new Keyword[keywords.size()]);
    }

    @Override
    public Keyword [] findByKeyword(String keyword) {
        List<Keyword> keywords = (List)repository.findByKeyword(keyword);
        return keywords.toArray(new Keyword[keywords.size()]);
    }

    // To be called when an art piece is removed
    @Override
    public void removeByArtPieceId(int id) {
        List <Keyword> keywords = (List)repository.findByArtPieceId(id);
        repository.delete(keywords);
    }


    // Called only when an art piece is updated
    @Override
    public void updateKeywordSet(int artPieceId, Iterable <String> keywords) {
        Set<Keyword> set = new HashSet<>();
        for(String keyword: keywords)
            set.add(new Keyword(keyword, artPieceId));
        List<Keyword> toDelete = (List)repository.findByArtPieceId(artPieceId);
        repository.delete(toDelete);
        repository.save(set);
    }


}

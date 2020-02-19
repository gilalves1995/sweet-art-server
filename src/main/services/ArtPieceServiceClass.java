package main.services;

import main.model.ArtPieceRepository;
import main.model.Keyword;
import main.model.KeywordRepository;
import org.springframework.beans.factory.annotation.Autowired;

import main.model.ArtPiece;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ArtPieceServiceClass implements ArtPieceService {

    @Autowired
    ArtPieceRepository repository;

    @Override
    public ArtPiece [] findAll() {
        List<ArtPiece> list = new ArrayList<>();
        for(ArtPiece item: repository.findAll()) {
            list.add(item);
        }
        return list.toArray(new ArtPiece[list.size()]);
    }

    @Override
    public void create(ArtPiece artPiece) {
        repository.save(artPiece);
    }

    @Override
    public void remove(int id) {
        repository.delete(id);
    }

    @Override
    public void update(ArtPiece a) {
        ArtPiece artPiece = repository.findOne(a.getId());
        artPiece.setName(a.getName());
        artPiece.setYear(a.getYear());
        artPiece.setPrice(a.getPrice());
        artPiece.setTechnicalSpecs(a.getTechnicalSpecs());
        artPiece.setCurrentOwner(a.getCurrentOwner());
        artPiece.setStatus(a.getStatus());
        artPiece.setCoverImage(a.getCoverImage());
        //artPiece.setPublicOwner(a.isPublicOwner());
        //artPiece.setBiddingTimes(a.getBiddingTimes());
        repository.save(artPiece);
    }

    @Override
    public void incrementBids(ArtPiece a) {
        ArtPiece artPiece = repository.findOne(a.getId());
        artPiece.incrementBids();
        repository.save(a);
    }

    @Override
    public ArtPiece findById(int id) {
        return repository.findOne(id);
    }

    @Override
    public ArtPiece [] mapByIds(List <Integer> idList) {
         List <ArtPiece> found = (List) repository.findAll(idList);
         return found.toArray(new ArtPiece[found.size()]);
    }

    @Override
    public ArtPiece [] findByAuthor(String username) {
        List<ArtPiece> found = (List) repository.findByAuthor(username);
        return found.toArray(new ArtPiece[found.size()]);
    }

    @Override
    public void markToWaitTransaction(ArtPiece a, String newOwner) {
        ArtPiece artPiece = repository.findOne(a.getId());
        artPiece.markToWaitTransaction();
        artPiece.setCurrentOwner(newOwner);
        repository.save(artPiece);
    }

    @Override
    public void makeOwnershipPublic(ArtPiece a) {
        ArtPiece artPiece = repository.findOne(a.getId());
        artPiece.setPublicOwner(true);
        repository.save(artPiece);
    }

    @Override
    public void sell(ArtPiece a) {
        ArtPiece artPiece = repository.findOne(a.getId());
        artPiece.markAsSold();
        repository.save(artPiece);
    }

    @Override
    public ArtPiece [] findByCurrentOwner(String currentOwner) {
        List <ArtPiece> list = (List) repository.findByCurrentOwner(currentOwner);
        return list.toArray(new ArtPiece[list.size()]);
    }
}

package main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Keyword {

    @Id
    @GeneratedValue
    private int id;

    private String keyword;
    private int artPieceId;

    public Keyword() {}

    public Keyword(String keyword, int artPieceId) {
        this.keyword = keyword;
        this.artPieceId = artPieceId;
    }

    public int getId() {
        return id;
    }

    public String getKeyword() {
        return keyword;
    }

    public int getArtPieceId() {
        return artPieceId;
    }


}

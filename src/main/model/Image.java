package main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Image {

    @Id
    @GeneratedValue
    private int id;

    private String url;
    private int artPieceId;

    public Image() {}

    public Image(String url, int artPieceId) {
        this.url = url;
        this.artPieceId = artPieceId;
    }

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public int getArtPieceId() {
        return artPieceId;
    }


}

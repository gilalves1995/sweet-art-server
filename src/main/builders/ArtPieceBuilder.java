package main.builders;

import main.model.ArtPiece;
import main.model.UserToken;

public class ArtPieceBuilder {

    private ArtPiece artPiece;
    private String [] keywords;
    private String [] images;

    public ArtPieceBuilder() {}

    public ArtPieceBuilder(ArtPiece artPiece, String [] keywords, String [] images) {
            this.artPiece = artPiece;
            this.keywords = keywords;
            this.images = images;
        }

    public ArtPiece getArtPiece() {
        return artPiece;
    }

    public void setArtPiece(ArtPiece artPiece) {
        this.artPiece = artPiece;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

}

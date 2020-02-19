package main.primarykeys;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class KeywordPK implements Serializable {

    private String keyword;
    private int artPieceId;

    public KeywordPK() {}

    public KeywordPK(String keyword, int artPieceId) {
        this.keyword = keyword;
        this.artPieceId = artPieceId;
    }

    public String getKeyword() {
        return keyword;
    }

    public int getArtPieceId() {
        return artPieceId;
    }
}

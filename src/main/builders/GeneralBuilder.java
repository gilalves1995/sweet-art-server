package main.builders;

import main.model.ArtPiece;
import main.model.UserToken;

public class GeneralBuilder {

    private ArtPieceBuilder artPiece;
    private UserToken token;

    public GeneralBuilder() {}

    public GeneralBuilder(ArtPieceBuilder artPiece, UserToken token) {

        this.artPiece = artPiece;
        this.token = token;
    }

    public ArtPieceBuilder getArtPiece() {
        return artPiece;
    }

    public void setArtPiece(ArtPieceBuilder artPiece) {
        this.artPiece = artPiece;
    }

    public UserToken getToken() {
        return token;
    }

    public void setToken(UserToken token) {
        this.token = token;
    }
}

package dev.lpa;

public class PlayingCard {

    private String suit;
    private String face;
    private int internalHash;

    public PlayingCard(String suit, String face, int internalHash) {
        this.suit = suit;
        this.face = face;
        this.internalHash = internalHash;
    }
}

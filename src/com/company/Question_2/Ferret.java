package com.company.Question_2;

public class Ferret extends Pet {

    private boolean likesToPlay;

    public Ferret(boolean likesToPlay) {
        this.likesToPlay = likesToPlay;
    }

    public boolean isLikesToPlay() {
        return likesToPlay;
    }

    public void setLikesToPlay(boolean likesToPlay) {
        this.likesToPlay = likesToPlay;
    }
}

package com.phorest.codingtask.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Component;

@Component
public class Jackpot {
    private final int INITIAL_JACKPOT = 15;
    private final int MINIMUM_JACKPOT = 0;
    private int currentJackpot = INITIAL_JACKPOT;

    public int getCurrentJackpot() {
        return currentJackpot;
    }

    public void setCurrentJackpot(int currentJackpot) {
        this.currentJackpot = currentJackpot >= MINIMUM_JACKPOT
                ? currentJackpot
                : INITIAL_JACKPOT;
    }

    @JsonIgnore
    public int getInitialJackpot() {
        return INITIAL_JACKPOT;
    }
}

package com.phorest.codingtask.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class JackpotTest {
    @Test
    public void jackpotValidForUpdate() {
        var jackpot = new Jackpot();
        jackpot.setCurrentJackpot(3);

        assertEquals(3, jackpot.getCurrentJackpot());
    }

    @Test
    public void jackpotLowerThanMinimumJackpotAllowed() {
        var jackpot = new Jackpot();
        jackpot.setCurrentJackpot(-1);

        assertEquals(15, jackpot.getCurrentJackpot());
    }

    @Test
    public void jackpotIsEmpty() {
        var jackpot = new Jackpot();
        jackpot.setCurrentJackpot(0);

        assertEquals(0, jackpot.getCurrentJackpot());
    }
}
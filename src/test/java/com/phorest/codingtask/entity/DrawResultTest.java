package com.phorest.codingtask.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DrawResultTest {
    @Test
    public void containsAllDrawResultsConstants() {
        var values = DrawResult.values();

        assertEquals(3, values.length);
    }

    @Test
    public void getCorrectValueForDrawResultSearchingByName() {
        var drawResult = DrawResult.valueOf(DrawResult.TRY_AGAIN.name());

        assertEquals("Try again", drawResult.getMessage());
    }

    @Test
    public void getCorrectValuesForDrawResultConstants() {
        assertEquals("You won", DrawResult.WIN.getMessage());
        assertEquals("Try again", DrawResult.TRY_AGAIN.getMessage());
        assertEquals("You lost", DrawResult.LOSS.getMessage());
    }

}
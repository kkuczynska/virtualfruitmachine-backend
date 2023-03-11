package com.phorest.codingtask.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ColorTest {
    @Test
    public void containsAllColorConstants() {
        var values = Color.values();

        assertEquals(4, values.length);
    }

    @Test
    public void getCorrectValueForColorSearchingByName() {
        var color = Color.valueOf(Color.YELLOW.name());

        assertEquals("#FFFF00", color.getHex());
    }

    @Test
    public void getNonNullColors() {
        var randomColor = Color.getRandomColor();

        assertNotNull(randomColor);
    }

    @Test
    public void getCorrectValuesForColorConstants() {
        assertEquals("#000000", Color.BLACK.getHex());
        assertEquals("#FFFFFF", Color.WHITE.getHex());
        assertEquals("#00FF00", Color.GREEN.getHex());
        assertEquals("#FFFF00", Color.YELLOW.getHex());
    }
}
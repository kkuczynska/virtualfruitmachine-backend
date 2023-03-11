package com.phorest.codingtask.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DrawTest {
    @Test
    public void getCorrectHexValuesForColorConstantsInDraw() {
        var slots = new Slots()
                .setSlot1(Color.BLACK)
                .setSlot2(Color.YELLOW)
                .setSlot3(Color.WHITE)
                .setSlot4(Color.BLACK);
        var draw = new Draw(slots);

        assertEquals("#000000", draw.getSlots().getSlot1().getHex());
        assertEquals("#FFFF00", draw.getSlots().getSlot2().getHex());
        assertEquals("#FFFFFF", draw.getSlots().getSlot3().getHex());
        assertEquals("#000000", draw.getSlots().getSlot4().getHex());
    }
}
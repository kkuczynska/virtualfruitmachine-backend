package com.phorest.codingtask.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SlotsTest {
    @Test
    public void getCorrectHexValuesForColorConstantsInSlots() {
        var slots = new Slots()
                .setSlot1(Color.BLACK)
                .setSlot2(Color.BLACK)
                .setSlot3(Color.GREEN)
                .setSlot4(Color.YELLOW);

        assertEquals("#000000", slots.getSlot1().getHex());
        assertEquals("#000000", slots.getSlot2().getHex());
        assertEquals("#00FF00", slots.getSlot3().getHex());
        assertEquals("#FFFF00", slots.getSlot4().getHex());
    }
}
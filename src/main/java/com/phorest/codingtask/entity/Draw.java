package com.phorest.codingtask.entity;

public class Draw {
    private final Slots slots;
    private String userMessage;

    public Draw(Slots slots, String userMessage) {
        this.slots = slots;
        this.userMessage = userMessage;
    }

    public Slots getSlots() {
        return slots;
    }

    public String getUserMessage() {
        return userMessage;
    }
}

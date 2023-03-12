package com.phorest.codingtask.entity;

public enum DrawResult {
    WIN("You won"),
    LOSS("You lost"),
    TRY_AGAIN("Try again");

    private String message;

    DrawResult(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

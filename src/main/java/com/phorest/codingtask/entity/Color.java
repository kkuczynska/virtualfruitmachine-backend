package com.phorest.codingtask.entity;

import java.util.Random;

public enum Color {
    BLACK("#000000"),
    WHITE("#FFFFFF"),
    GREEN("#00FF00"),
    YELLOW("#FFFF00");

    private final String hex;

    Color(String hex) {
        this.hex = hex;
    }

    public static Color getRandomColor() {
        Color[] colors = values();

        return colors[new Random().nextInt(colors.length)];
    }

    public String getHex() {
        return hex;
    }
}

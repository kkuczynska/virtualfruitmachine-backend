package com.phorest.codingtask.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.phorest.codingtask.serializer.ColorSerializer;

import java.util.stream.Stream;

public class Slots {
    @JsonSerialize(using = ColorSerializer.class)
    private Color slot1;
    @JsonSerialize(using = ColorSerializer.class)
    private Color slot2;
    @JsonSerialize(using = ColorSerializer.class)
    private Color slot3;
    @JsonSerialize(using = ColorSerializer.class)
    private Color slot4;

    public Color getSlot1() {
        return slot1;
    }

    public Color getSlot2() {
        return slot2;
    }

    public Color getSlot3() {
        return slot3;
    }

    public Color getSlot4() {
        return slot4;
    }

    public Slots setSlot1(Color color) {
        this.slot1 = color;

        return this;
    }

    public Slots setSlot2(Color color) {
        this.slot2 = color;

        return this;
    }

    public Slots setSlot3(Color color) {
        this.slot3 = color;

        return this;
    }

    public Slots setSlot4(Color color) {
        this.slot4 = color;

        return this;
    }

    @JsonIgnore
    public boolean allHaveSameColor() {
        return Stream.of(getSlot1(), getSlot2(), getSlot3(), getSlot4())
                .distinct()
                .count() == 1;
    }
}

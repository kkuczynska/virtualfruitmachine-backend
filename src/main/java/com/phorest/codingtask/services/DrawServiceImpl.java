package com.phorest.codingtask.services;

import com.phorest.codingtask.entity.Color;
import com.phorest.codingtask.entity.Draw;
import com.phorest.codingtask.entity.Slots;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrawServiceImpl implements DrawService {
    @Autowired
    ColorService colorService;
    Slots slots;

    @Override
    public Draw draw() {
        getSlotsColors();

        return new Draw(slots);
    }

    private void getSlotsColors() {
        slots = new Slots()
                .setSlot1(getRandomColor())
                .setSlot2(getRandomColor())
                .setSlot3(getRandomColor())
                .setSlot4(getRandomColor()
                );
    }

    private Color getRandomColor() {
        return colorService.getRandomColor();
    }
}

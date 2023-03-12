package com.phorest.codingtask.services;

import com.phorest.codingtask.entity.Color;
import com.phorest.codingtask.entity.Draw;
import com.phorest.codingtask.entity.DrawResult;
import com.phorest.codingtask.entity.Slots;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrawServiceImpl implements DrawService {
    @Autowired
    ColorService colorService;
    Slots slots;
    @Autowired
    DrawResultService drawResultService;
    @Autowired
    JackpotService jackpotService;

    @Override
    public Draw draw() {
        getSlotsColors();
        calculateDrawResult();
        updateJackpot();

        return new Draw(slots, getUserMessage());
    }

    private String getUserMessage() {
        return getResult().equals(DrawResult.WIN)
                ? getResult().getMessage() + " " + getCurrentJackpot()
                : getResult().getMessage();
    }

    private int getCurrentJackpot() {
        return jackpotService.getJackpot().getCurrentJackpot();
    }

    private void getSlotsColors() {
        slots = new Slots()
                .setSlot1(getRandomColor())
                .setSlot2(getRandomColor())
                .setSlot3(getRandomColor())
                .setSlot4(getRandomColor()
                );
    }

    private void calculateDrawResult() {
        drawResultService.calculateDrawResultFor(slots, getCurrentJackpot());
    }

    private void updateJackpot() {
        if (getResult().equals(DrawResult.TRY_AGAIN))
            jackpotService.updateJackpot();
    }

    private Color getRandomColor() {
        return colorService.getRandomColor();
    }

    private DrawResult getResult() {
        return drawResultService.getResult();
    }
}

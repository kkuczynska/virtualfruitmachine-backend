package com.phorest.codingtask.services;

import com.phorest.codingtask.entity.DrawResult;
import com.phorest.codingtask.entity.Slots;
import org.springframework.stereotype.Service;

@Service
public class DrawResultServiceImpl implements DrawResultService {
    private DrawResult drawResult;

    @Override
    public void calculateDrawResultFor(Slots slots, int currentJackpot) {
        drawResult = slots.allHaveSameColor() && currentJackpot > 0
                ? DrawResult.WIN
                : currentJackpot == 0
                ? DrawResult.LOSS
                : DrawResult.TRY_AGAIN;
    }

    @Override
    public DrawResult getResult() {
        return drawResult;
    }
}

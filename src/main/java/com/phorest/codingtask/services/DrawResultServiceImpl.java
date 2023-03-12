package com.phorest.codingtask.services;

import com.phorest.codingtask.entity.DrawResult;
import com.phorest.codingtask.entity.Slots;
import org.springframework.stereotype.Service;

@Service
public class DrawResultServiceImpl implements DrawResultService {
    private DrawResult drawResult;

    @Override
    public void calculateDrawResultFor(Slots slots) {
        drawResult = slots.allHaveSameColor()
                ? DrawResult.WIN
                : DrawResult.LOSS;
    }

    @Override
    public DrawResult getResult() {
        return drawResult;
    }
}

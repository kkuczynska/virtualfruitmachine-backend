package com.phorest.codingtask.services;

import com.phorest.codingtask.entity.Jackpot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JackpotServiceImpl implements JackpotService {
    private final int POINTS_LOST = 2;
    @Autowired
    Jackpot jackpot;

    @Override
    public void updateJackpot() {
        jackpot.setCurrentJackpot(jackpot.getCurrentJackpot() - POINTS_LOST);
    }

    @Override
    public Jackpot getJackpot() {
        return jackpot;
    }
}

package com.phorest.codingtask.services;

import com.phorest.codingtask.entity.Color;
import com.phorest.codingtask.entity.DrawResult;
import com.phorest.codingtask.entity.Slots;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DrawResultServiceImplTest {
    @Autowired
    DrawResultService drawResultService;

    @Test
    public void givenVariousColorsTheResultIsLoss() {
        var slots = new Slots()
                .setSlot1(Color.BLACK)
                .setSlot2(Color.BLACK)
                .setSlot3(Color.GREEN)
                .setSlot4(Color.YELLOW);
        drawResultService.calculateDrawResultFor(slots);

        assertEquals(DrawResult.LOSS, drawResultService.getResult());
    }

    @Test
    public void givenTheSameColorsTheResultIsWin() {
        var slots = new Slots()
                .setSlot1(Color.BLACK)
                .setSlot2(Color.BLACK)
                .setSlot3(Color.BLACK)
                .setSlot4(Color.BLACK);
        drawResultService.calculateDrawResultFor(slots);

        assertEquals(DrawResult.WIN, drawResultService.getResult());
    }
}
package com.phorest.codingtask.services;

import com.phorest.codingtask.entity.Color;
import com.phorest.codingtask.entity.DrawResult;
import com.phorest.codingtask.entity.Jackpot;
import com.phorest.codingtask.entity.Slots;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class DrawServiceImplTest {
    @Mock
    ColorService colorService;
    @Mock
    DrawResultService drawResultService;
    @Mock
    JackpotService jackpotService;
    @InjectMocks
    DrawServiceImpl drawService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void draw() {
        when(colorService.getRandomColor()).thenReturn(Color.BLACK);
        when(drawResultService.getResult()).thenReturn(DrawResult.WIN);
        when(jackpotService.getJackpot()).thenReturn(new Jackpot());

        var draw = drawService.draw();

        verify(colorService, times(4)).getRandomColor();
        verify(drawResultService).calculateDrawResultFor(any(Slots.class), anyInt());
        verify(jackpotService, never()).updateJackpot();
        assertEquals("You won 15 onions!", draw.getUserMessage());
    }
}
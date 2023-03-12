package com.phorest.codingtask.services;

import com.phorest.codingtask.entity.Jackpot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class JackpotServiceImplTest {
    @Mock
    Jackpot jackpot;
    @InjectMocks
    JackpotServiceImpl jackpotService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void updateJackpot() {
        when(jackpot.getCurrentJackpot()).thenReturn(10);

        jackpotService.updateJackpot();

        verify(jackpot, times(1)).setCurrentJackpot(8);
    }
}
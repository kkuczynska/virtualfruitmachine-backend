package com.phorest.codingtask.rest;

import com.phorest.codingtask.entity.*;
import com.phorest.codingtask.services.DrawResultService;
import com.phorest.codingtask.services.DrawService;
import com.phorest.codingtask.services.JackpotService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(VirtualFruitMachineResource.class)
class VirtualFruitMachineResourceTest {
    @MockBean
    DrawService drawService;
    @MockBean
    DrawResultService resultService;
    @MockBean
    JackpotService jackpotService;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void endpointReturnsOkStatusAndResponseHasCorrectStructure() throws Exception {
        var slots = new Slots()
                .setSlot1(Color.BLACK)
                .setSlot2(Color.BLACK)
                .setSlot3(Color.GREEN)
                .setSlot4(Color.YELLOW);
        when(drawService.draw()).thenReturn(new Draw(slots, ""));

        mockMvc.perform(get("/draw"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.slots[*].name").isNotEmpty())
                .andExpect(jsonPath("$.slots[*].hex").isNotEmpty());
    }

    @Test
    public void endpointReturnsOkStatusAdndResponseHasCorrectStructure() throws Exception {
        when(resultService.getResult()).thenReturn(DrawResult.TRY_AGAIN);

        mockMvc.perform(get("/result"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result").value("TRY_AGAIN"))
                .andExpect(jsonPath("$.message").value("Try again"));
    }

    @Test
    public void endpointReturnsOkStatusAndResponseHasCorrectStructudre() throws Exception {
        when(jackpotService.getJackpot()).thenReturn(new Jackpot());

        mockMvc.perform(get("/jackpot"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.currentJackpot").value(15));
    }
}
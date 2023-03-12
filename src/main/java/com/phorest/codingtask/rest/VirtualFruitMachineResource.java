package com.phorest.codingtask.rest;

import com.phorest.codingtask.entity.Draw;
import com.phorest.codingtask.entity.DrawResult;
import com.phorest.codingtask.entity.Jackpot;
import com.phorest.codingtask.services.DrawResultService;
import com.phorest.codingtask.services.DrawService;
import com.phorest.codingtask.services.JackpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VirtualFruitMachineResource {
    @Autowired
    DrawService drawService;
    @Autowired
    DrawResultService resultService;
    @Autowired
    JackpotService jackpotService;

    @GetMapping("/draw")
    public Draw draw() {
        return drawService.draw();
    }

    @GetMapping("/result")
    public DrawResult getResultMessage() {
        return resultService.getResult();
    }

    @GetMapping("/jackpot")
    public Jackpot getJackpot() {
        return jackpotService.getJackpot();
    }
}

package com.phorest.codingtask.services;

import com.phorest.codingtask.entity.DrawResult;
import com.phorest.codingtask.entity.Slots;

public interface DrawResultService {
    void calculateDrawResultFor(Slots slots);

    DrawResult getResult();
}

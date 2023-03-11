package com.phorest.codingtask.services;

import com.phorest.codingtask.entity.Color;
import org.springframework.stereotype.Component;

@Component
public class ColorServiceImpl implements ColorService {
    @Override
    public Color getRandomColor() {
        return Color.getRandomColor();
    }
}

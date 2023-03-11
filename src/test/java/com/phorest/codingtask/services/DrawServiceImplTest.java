package com.phorest.codingtask.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DrawServiceImplTest {
    @Autowired
    DrawService drawService;

    @Test
    public void draw() {
        assertNotNull(drawService.draw());
    }
}
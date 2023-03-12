package com.phorest.codingtask.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.phorest.codingtask.entity.DrawResult;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@JsonTest
@ExtendWith(SpringExtension.class)
class DrawResultSerializerTest {
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void serialize() throws IOException {
        var drawResult = DrawResult.WIN;
        var json = objectMapper.writeValueAsString(drawResult);

        assertEquals("{\"result\":\"WIN\",\"message\":\"You won\"}", json);
    }
}
package com.phorest.codingtask.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.phorest.codingtask.entity.Color;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@JsonTest
@ExtendWith(SpringExtension.class)
public class ColorSerializerTest {
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void serialize() throws IOException {
        var color = Color.BLACK;
        var json = objectMapper.writeValueAsString(color);

        assertEquals("{\"name\":\"BLACK\",\"hex\":\"#000000\"}", json);
    }
}

package com.phorest.codingtask.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.phorest.codingtask.entity.Color;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

@JsonComponent
public class ColorSerializer extends JsonSerializer<Color> {

    @Override
    public void serialize(Color color, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("name", color.name());
        jsonGenerator.writeStringField("hex", color.getHex());
        jsonGenerator.writeEndObject();
    }
}


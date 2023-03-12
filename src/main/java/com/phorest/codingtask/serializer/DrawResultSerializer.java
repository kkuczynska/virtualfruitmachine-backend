package com.phorest.codingtask.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.phorest.codingtask.entity.DrawResult;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

@JsonComponent
public class DrawResultSerializer extends JsonSerializer<DrawResult> {
    @Override
    public void serialize(DrawResult result, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("result", result.name());
        jsonGenerator.writeStringField("message", result.getMessage());
        jsonGenerator.writeEndObject();
    }
}


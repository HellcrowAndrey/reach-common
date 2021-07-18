package com.github.reach.common.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.reach.common.exceptions.ConvertFromJsonStringException;
import com.github.reach.common.exceptions.ConvertToJsonStringException;

import java.lang.reflect.Type;

public class JasonMethod {

    public static String toJson(ObjectMapper mapper, Object data) {
        try {
            return mapper.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            throw new ConvertToJsonStringException(e.getMessage());
        }
    }

    @SuppressWarnings(value = "unchecked")
    public static <T> T fromJson(ObjectMapper mapper, String data, Class<?> clz) {
        try {
            return (T) mapper.readValue(data, clz);
        } catch (JsonProcessingException e) {
            throw new ConvertFromJsonStringException(e.getMessage());
        }
    }

    @SuppressWarnings(value = "unchecked")
    public static <T> T fromJson(ObjectMapper mapper, String data, TypeReference<?> type) {
        try {
            return (T) mapper.readValue(data, type);
        } catch (JsonProcessingException e) {
            throw new ConvertFromJsonStringException(e.getMessage());
        }
    }

}

package com.ligq.example.menu.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.DateFormat;

import static java.text.DateFormat.FULL;

/**
 * class $classname
 *
 * @author ligq
 * @description
 * @date 2018/1/29, 16:52
 */
@Configuration
public class JsonConfig {

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(DateFormat.getDateTimeInstance(FULL, FULL));
        return objectMapper;
    }
}

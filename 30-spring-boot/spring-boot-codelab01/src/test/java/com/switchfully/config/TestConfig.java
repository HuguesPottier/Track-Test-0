package com.switchfully.config;

import org.springframework.context.annotation.Bean;

public class TestConfig {

    @Bean
    public Counter counter() {
        return new Counter();
    }
}

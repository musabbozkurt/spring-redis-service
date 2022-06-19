package com.mb.springredisservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {

    @Bean
    @ConditionalOnProperty(value = "redisson.enabled", havingValue = "true")
    public RedissonWrapper redissonClient(@Value("${redisson.url}") String address) {
        return new RedissonWrapper(address);
    }

}
package com.mb.springredisservice.api;

import com.mb.springredisservice.data.entity.RedisHashData;
import com.mb.springredisservice.service.RedisHashService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class RedisController {

    private final RedisHashService redisHashService;

    /**
     * Create RedisHashData
     */
    @PostMapping("/redis-hash")
    public RedisHashData createRedisHashData() {
        log.info("Received a request to create RedisHashData. createRedisHashData.");
        return redisHashService.save(RedisHashData.builder().destination("hello_world").build());
    }
}
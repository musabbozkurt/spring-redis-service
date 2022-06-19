package com.mb.springredisservice.queue;

import com.google.gson.Gson;
import com.mb.springredisservice.data.entity.RedisHashData;
import com.mb.springredisservice.service.RedisHashService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.data.redis.core.RedisKeyExpiredEvent;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class RedisKeyExpiredEventListenerImpl {
    private final RedisHashService redisHashService;
    private final Gson gson;

    @EventListener(condition = "#event.keyspace == 'RedisHashData'")
    public void redisExpiredKeyEventForRedisHashData(RedisKeyExpiredEvent event) {
        log.info("Redis key expired event log. RedisHashData - event:{}", gson.toJson(event));
        redisHashService.delete(RedisHashData.builder().id(new String(event.getId())).build());
    }
}

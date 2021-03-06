package com.mb.springredisservice.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;
import org.springframework.data.redis.core.index.Indexed;

import javax.persistence.Id;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RedisHash(value = "RedisHashData")
public class RedisHashData {

    @Id
    @Builder.Default
    private String id = UUID.randomUUID().toString();

    @Indexed
    private String redisHashCode;

    @Indexed
    private String reference;

    private String destination;

    private int count;

    @TimeToLive
    @Builder.Default
    private long expiration = 60L;

    public RedisHashData(String redisHashCode, String reference) {
        this.redisHashCode = redisHashCode;
        this.reference = reference;
    }
}

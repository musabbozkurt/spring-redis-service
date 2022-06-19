package com.mb.springredisservice.service;

import com.mb.springredisservice.data.entity.RedisHashData;

import java.util.Optional;

public interface RedisHashService {

    RedisHashData save(RedisHashData redisHashData);

    Optional<RedisHashData> findById(String id);

    void delete(RedisHashData redisHashData);

    void deleteRedisHashDataById(String redisHashDataId);
}

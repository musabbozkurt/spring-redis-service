package com.mb.springredisservice.service.impl;

import com.mb.springredisservice.data.entity.RedisHashData;
import com.mb.springredisservice.data.repository.RedisHashDataRepository;
import com.mb.springredisservice.service.RedisHashService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class RedisHashServiceImpl implements RedisHashService {

    private final RedisHashDataRepository redisHashDataRepository;

    @Override
    public RedisHashData save(RedisHashData redisHashData) {
        return redisHashDataRepository.save(redisHashData);
    }

    @Override
    public Optional<RedisHashData> findById(String id) {
        return redisHashDataRepository.findById(id);
    }

    @Override
    public void delete(RedisHashData redisHashData) {
        redisHashDataRepository.delete(redisHashData);
    }

    @Override
    public void deleteRedisHashDataById(String redisHashDataId) {
        log.info("Deleting RedisHashData by ID: '{}'.", redisHashDataId);
        redisHashDataRepository.deleteById(redisHashDataId);
    }

}

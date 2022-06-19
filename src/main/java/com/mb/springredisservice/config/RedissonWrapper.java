package com.mb.springredisservice.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

@Getter
@NoArgsConstructor
public class RedissonWrapper {

    public RedissonClient redisson;

    public RedissonWrapper(String address) {
        Config config = new Config();
        config.useSingleServer().setAddress(address);

        redisson = Redisson.create(config);
    }

}
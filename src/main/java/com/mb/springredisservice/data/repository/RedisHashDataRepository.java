package com.mb.springredisservice.data.repository;

import com.mb.springredisservice.data.entity.RedisHashData;
import org.springframework.data.repository.CrudRepository;

public interface RedisHashDataRepository extends CrudRepository<RedisHashData, String> {

}

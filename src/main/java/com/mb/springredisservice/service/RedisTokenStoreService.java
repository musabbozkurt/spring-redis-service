package com.mb.springredisservice.service;

public interface RedisTokenStoreService {

    String getToken(String tokenId, String key);

    void storeToken(String tokenId, String key);

    void deleteToken(String tokenId, String key);
}

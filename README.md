<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary><h2 style="display: inline-block">Table of Contents</h2></summary>
  <ol>
    <li><a href="#summary">Summary</a></li>
    <li><a href="#Prerequisites">Prerequisites and Installation</a></li>
    <li><a href="#Redis">Redis Commands</a></li>
    <li><a href="#References">Reference Documentation</a></li>
    <li><a href="#Guides">Guides</a></li>
  </ol>
</details>


<!-- SUMMARY -->

### Summary

This project is created for multiple purposes;

* Usage of redis, Redisson and RedisHash
* Usage of RedisKeyExpiredEvent which help us to expire redis keys and redisHashes


<!-- Prerequisites and Installation -->

### Prerequisites

* Java 17 should be installed.
* Redis should be installed. There 2 options to install redis
   * Install with Docker 
     * [How to Install Docker](https://docs.docker.com/get-docker/)
     * After Docker is installed, run the following command in the docker-compose.yml file directory 
       to install Redis -> docker-compose up -d
   * Manual Installation 
     * [How to Install Redis](https://redis.io/docs/getting-started/)

### Redis

* The following command returns all matched data by 'keyPattern:*' pattern
    * redis-cli --scan --pattern 'keyPattern:*'

* The following command deletes all matched data by 'keyPattern:*' pattern
    * redis-cli KEYS 'keyPattern:*' | xargs redis-cli DEL

* The following command finds TYPE in redis with KEY
    * TYPE key -> TYPE xxx:hashedIdOrSomethingElse

* The following commands search by TYPE

    * for "string" TYPE : get key
    * for "hash" TYPE : hgetall key
    * for "list" TYPE : lrange key 0 -1
    * for "set" TYPE : smembers key
    * for "zset" TYPE : zrange key 0 -1 withScores

### References

For further reference, please consider the following sections:

* [Redis Commands](https://auth0.com/blog/introduction-to-redis-install-cli-commands-and-data-types/)

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.0/maven-plugin/reference/html/#build-image)
* [Spring Data Redis (Access+Driver)](https://docs.spring.io/spring-boot/docs/2.7.0/reference/htmlsingle/#data.nosql.redis)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.0/reference/htmlsingle/#data.sql.jpa-and-spring-data)

### Guides

The following guides illustrate how to use some features concretely:

* [Messaging with Redis](https://spring.io/guides/gs/messaging-redis/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

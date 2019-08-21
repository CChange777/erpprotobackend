package com.wecreate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@EnableConfigurationProperties
@EnableMongoRepositories
public class MainServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainServerApplication.class, args);
    }

}

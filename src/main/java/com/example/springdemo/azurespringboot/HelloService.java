package com.example.springdemo.azurespringboot;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class HelloService {

    public String getMessage(String name) {

        System.getenv().forEach((key, value) -> log.info("request env {}={}", key, value));

        log.info("getMessage {}", name);
        return "Hello " + name + "!";
    }
    
}

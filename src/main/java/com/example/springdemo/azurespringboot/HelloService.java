package com.example.springdemo.azurespringboot;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class HelloService {

    public String getMessage(String name) {

        System.getenv().entrySet().stream().forEach(action -> {
            log.info("env " + action.getKey() + "=" + action.getValue());
        });
        return "Hello " + name + "!";
    }
    
}

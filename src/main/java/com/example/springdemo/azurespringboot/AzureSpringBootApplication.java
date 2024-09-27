package com.example.springdemo.azurespringboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class AzureSpringBootApplication {

	public static void main(String[] args) {

		System.getenv().forEach((key, value) -> log.info("startup env {}={}", key, value));

		SpringApplication.run(AzureSpringBootApplication.class, args);
	}

}

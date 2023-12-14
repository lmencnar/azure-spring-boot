package com.example.springdemo.azurespringboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class HelloController {

    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @PostMapping(value="/hello")
    public HelloResponse helloName(@RequestBody HelloRequest request) {

        HelloResponse response = new HelloResponse();
        response.setMessage(helloService.getMessage(request.getName()));

        return response;
    }
}
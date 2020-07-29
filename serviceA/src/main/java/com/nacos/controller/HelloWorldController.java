package com.nacos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(String userName) throws InterruptedException {
        Thread.sleep(10000);
        return "hello "+ userName;
//        throw new RuntimeException("Test feign fallback exception");
    }
}

package com.nacos.controller;

import lombok.extern.log4j.Log4j2;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class HelloWorldController {
//    Logger log=Logger.getLogger(HelloWorldController.class);

    @RequestMapping("/hello")
    public String hello(String userName) throws InterruptedException {
        log.info("--------------- ServiceA : hello world!!! ");
//        Thread.sleep(10000);
//        return "hello "+ userName;
        throw new RuntimeException("ServiceA throws a exception");
    }
}

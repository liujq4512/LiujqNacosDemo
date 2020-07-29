package com.service.demob.feign.clients;

import org.springframework.stereotype.Component;

@Component
public class RemoteHystrix implements RemoteClient{

    @Override
    public String helloWorld(String userName) {


        return "Say hello by feign client is failed!!! ";
    }
}

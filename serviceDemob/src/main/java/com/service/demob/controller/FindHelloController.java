package com.service.demob.controller;

import com.service.demob.feign.clients.RemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FindHelloController {

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Autowired
    RemoteClient remoteClient;

    @RequestMapping("/findHello")
    public String findHello(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("liujq-nacos-demo-serviceA");
        String uri = serviceInstance.getUri()+ "/hello?userName=findHello";
        System.out.println(uri);
        RestTemplate restTemplate = new RestTemplate();
        return  "Find hello result: " + restTemplate.getForObject(uri, String.class);

    }

    @RequestMapping("/feignHello")
    public String feignHello(String userName){
        return remoteClient.helloWorld(userName);
    }
}

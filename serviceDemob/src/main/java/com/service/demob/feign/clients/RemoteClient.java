package com.service.demob.feign.clients;

import com.service.demob.configuration.FeignConfigure;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "liujq-nacos-demo-serviceA",fallback = RemoteHystrix.class)
//@FeignClient(name = "liujq-nacos-demo-serviceA", fallback = RemoteHystrix.class)
public interface RemoteClient {

    @RequestMapping("/hello")
    public String helloWorld(@RequestParam("userName") String userName);
}

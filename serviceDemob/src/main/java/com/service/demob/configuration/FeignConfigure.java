package com.service.demob.configuration;

import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfigure {

    @Bean
    public Request.Options options(){
        return new Request.Options(2000, 2000);
    }

    @Bean
    public Retryer retryer(){
        return new Retryer.Default(100,1000, 4);
    }
}

package com.koala.consumerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableHystrix
@EnableDiscoveryClient
@EnableFeignClients
public class Ch62ConsumerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch62ConsumerServiceApplication.class, args);
    }

}

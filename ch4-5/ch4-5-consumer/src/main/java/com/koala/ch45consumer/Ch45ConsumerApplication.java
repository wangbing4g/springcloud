package com.koala.ch45consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ch45ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch45ConsumerApplication.class, args);
    }

}

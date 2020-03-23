package com.koala.ch63eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch63EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch63EurekaApplication.class, args);
    }

}

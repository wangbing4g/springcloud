package com.koala.ch33eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch33EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch33EurekaServerApplication.class, args);
    }

}

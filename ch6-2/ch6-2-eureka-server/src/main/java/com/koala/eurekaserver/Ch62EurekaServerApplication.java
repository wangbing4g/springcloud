package com.koala.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch62EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch62EurekaServerApplication.class, args);
    }

}

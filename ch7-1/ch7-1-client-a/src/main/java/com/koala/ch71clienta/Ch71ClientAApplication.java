package com.koala.ch71clienta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch71ClientAApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch71ClientAApplication.class, args);
    }

}

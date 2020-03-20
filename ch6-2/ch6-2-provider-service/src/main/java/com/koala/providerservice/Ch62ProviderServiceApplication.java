package com.koala.providerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch62ProviderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch62ProviderServiceApplication.class, args);
    }

}

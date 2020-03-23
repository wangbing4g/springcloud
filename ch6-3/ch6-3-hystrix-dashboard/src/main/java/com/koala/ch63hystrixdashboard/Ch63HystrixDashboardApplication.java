package com.koala.ch63hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrixDashboard
public class Ch63HystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch63HystrixDashboardApplication.class, args);
    }

}

package com.discovery.springdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDiscoveryApplication.class, args);
    }

}

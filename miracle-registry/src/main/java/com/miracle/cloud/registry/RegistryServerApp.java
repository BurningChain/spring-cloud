package com.miracle.cloud.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author miracle
 * created at 2019-01-29
 */
@EnableEurekaServer
@SpringBootApplication
public class RegistryServerApp {


    public static void main(String[] args) {
        SpringApplication.run(RegistryServerApp.class, args);
    }
}

package com.miracle.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wwj
 * created at 2019-01-30 14:44
 */
@EnableEurekaClient
@SpringBootApplication
@RestController
public class CommunityServerApp {

    public static void main(String[] args) {
        SpringApplication.run(CommunityServerApp.class, args);
    }

    @GetMapping(value = "/test")
    public String test() {
        return "miracle-community-server: success";
    }
}

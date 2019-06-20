package com.data.house.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HealthWebApiEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthWebApiEurekaClientApplication.class, args);
    }

}

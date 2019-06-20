package com.data.warehouse.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HealthWebApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthWebApiGatewayApplication.class, args);
    }

}

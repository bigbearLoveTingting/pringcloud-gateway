package com.data.datahouse.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HealthWebApiEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthWebApiEurekaApplication.class, args);
    }

}

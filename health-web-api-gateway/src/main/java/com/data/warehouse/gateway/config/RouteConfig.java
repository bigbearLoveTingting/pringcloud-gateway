//package com.data.warehouse.gateway.config;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @Author: 84644
// * @Date: 2019/6/17 14:24
// * @Description:
// **/
//@Configuration
//public class RouteConfig {
//
//    @Bean("routes")
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
//        return builder.routes()
//                .route("health", r -> r.path("/api/health/**")
//                        .filters(f -> f.stripPrefix(1))
//                        .uri("lb://HEALTH-WEB-API-EUREKA-CLIENT"))
//                .build();
//    }
//}

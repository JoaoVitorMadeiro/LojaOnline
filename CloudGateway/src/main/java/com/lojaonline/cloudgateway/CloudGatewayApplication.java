package com.lojaonline.cloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayApplication.class, args);
    }

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user", r -> r.path("/user/**").uri("lb://user"))
                .route("item", r -> r.path("/item/**").uri("lb://item"))
                .route("cart", r -> r.path("/cart/**").uri("lb://cart"))
                .route("Fav", r -> r.path("/favorite/**").uri("lb://favorite"))
                .build();
    }
}

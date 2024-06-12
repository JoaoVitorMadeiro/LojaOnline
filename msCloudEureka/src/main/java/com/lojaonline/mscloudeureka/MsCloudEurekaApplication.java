package com.lojaonline.mscloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class MsCloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsCloudEurekaApplication.class, args);
    }

}

package com.example.erueka.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemoApplication {
//kanyikanla
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("部署成功");
    }


}

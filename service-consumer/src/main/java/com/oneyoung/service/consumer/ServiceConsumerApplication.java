package com.oneyoung.service.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceConsumerApplication {
    public static void main(String[] args) {

        SpringApplication.run(ServiceConsumerApplication.class,args);

    }
}

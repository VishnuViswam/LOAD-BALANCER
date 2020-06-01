package com.microservices.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Main class where spring boot application starts.
 *
 * @author Vishnu Viswambharan
 * @version 1.0
 * @since 2020-06-01
 */
@SpringBootApplication
@EnableFeignClients("com.microservices.client")
@EnableDiscoveryClient
public class MicroServiceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceClientApplication.class, args);
    }

}

package com.microservices.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * Main class where spring boot application starts.
 *
 * @author Vishnu Viswambharan
 * @version 1.0
 * @since 2020-06-01
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MicroServiceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceServerApplication.class, args);
	}

}

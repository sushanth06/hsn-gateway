package com.example.hsngateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HsnGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HsnGatewayApplication.class, args);
	}

}

package com.example.DevStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DevStoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(DevStoreApplication.class, args);
	}
}

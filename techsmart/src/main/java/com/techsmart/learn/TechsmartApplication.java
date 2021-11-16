package com.techsmart.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TechsmartApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechsmartApplication.class, args);
	}

}

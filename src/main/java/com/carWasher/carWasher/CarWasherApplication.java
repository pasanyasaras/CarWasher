package com.carWasher.carWasher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = CarWasherProperties.class)
public class CarWasherApplication {

	public static void main(String[] args) {

		SpringApplication.run(CarWasherApplication.class, args);
		System.out.println("Testing");
	}

}

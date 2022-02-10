package com.carWasher.carWasher;

import com.carWasher.carWasher.web.MyErrorController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication

@EnableConfigurationProperties(value = {CarWasherProperties.class} )

public class CarWasherApplication {

	public static void main(String[] args) {

		SpringApplication.run(CarWasherApplication.class, args);
		System.out.println("Testing");
	}

}

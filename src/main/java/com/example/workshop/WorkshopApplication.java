package com.example.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkshopApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.location", "classpath:/AppConfig.yml");

		SpringApplication.run(WorkshopApplication.class, args);

	}
}

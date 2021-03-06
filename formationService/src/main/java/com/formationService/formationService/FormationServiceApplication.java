package com.formationService.formationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableCircuitBreaker
@SpringBootApplication
public class FormationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormationServiceApplication.class, args);
	}
}

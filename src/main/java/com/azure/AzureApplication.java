package com.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class AzureApplication {

	@GetMapping("/message")
	public String message() {
		return "congrats";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(AzureApplication.class, args);
	}

}

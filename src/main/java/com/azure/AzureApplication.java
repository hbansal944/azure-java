package com.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureApplication {

	@GetMapping("/message")
	public String message() {
		return "congrats";
	}
		@GetMapping("/")
	public String messages() {
		return "started";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(AzureApplication.class, args);
	}

}

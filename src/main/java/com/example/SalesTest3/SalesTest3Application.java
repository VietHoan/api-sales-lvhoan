package com.example.SalesTest3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SalesTest3Application {

	@GetMapping()
	public String message(){
		return "Welcome you to main page";
	}

	public static void main(String[] args) {
		SpringApplication.run(SalesTest3Application.class, args);
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Proyecto1SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto1SpringApplication.class, args);
	}
	
	
	@GetMapping("/error")
	public String error() {
		return "error a la hora de poner lo que sea";
	}

}

package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class T4Application {
	@GetMapping("/msg")
	public String getMSg(){

		return "Welcome to Amdocs";
	}
	@GetMapping("/msg1")
	public String getMsg1(){

		return "Amdocs welcomes you";
	}
	public static void main(String[] args) {
		SpringApplication.run(T4Application.class, args);
	}

}

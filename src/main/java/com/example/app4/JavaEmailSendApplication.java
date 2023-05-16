package com.example.app4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaEmailSendApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaEmailSendApplication.class, args);
		System.out.println("email sender");
	}

}

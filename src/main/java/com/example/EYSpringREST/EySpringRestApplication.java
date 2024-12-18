package com.example.EYSpringREST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class EySpringRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EySpringRestApplication.class, args);
	}

}

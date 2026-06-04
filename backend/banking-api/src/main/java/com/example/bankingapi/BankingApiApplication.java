/*
 * BankingApiApplication.java
 *
 * Purpose:
 * Main entry point for the Banking REST API application.
 * Starts the Spring Boot server and initializes the application.
 *
 * Running this file launches the embedded Tomcat server
 * on localhost:8080.
 */

package com.example.bankingapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingApiApplication.class, args);
	}

}

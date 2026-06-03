# Banking API Backend - Spring Data REST + MySQL

## Overview

This branch contains the Spring Boot backend implementation for the Banking API using Spring Data REST and a local MySQL database.

The project was refactored from an in-memory `DataStore` approach to a database-backed architecture using Spring Data JPA repositories.

## Current Goal

The current focus is proving that:

- Spring Boot connects to a local MySQL database
- The database exists locally
- The `customer` table is created programmatically by Hibernate/JPA
- A POST request can insert customer data
- A GET request can fetch customer data from MySQL

## Technologies Used

- Java 17
- Spring Boot 3.5.14
- Spring Web
- Spring Data JPA
- Spring Data REST
- MySQL
- Maven
- IntelliJ IDEA
- Postman

## Project Structure

```text
src/main/java/com/example/bankingapi
├── controller
├── model
│   └── Customer.java
├── repository
│   └── CustomerRepository.java
├── service
│   └── CustomerService.java
└── BankingApiApplication.java

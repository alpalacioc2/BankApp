# Banking REST API Backend

## Overview

This project is a Banking REST API backend developed using Java Spring Boot following the MVC architecture pattern.

The application currently uses in-memory Java Lists as a temporary data store for customers and accounts. The goal of this phase is to establish working REST endpoints and backend communication before integrating persistent database storage or frontend components.

---

## Technologies Used

* Java 17
* Spring Boot
* Maven
* IntelliJ IDEA
* REST API Architecture

---

## Current Features

### Customer Endpoints

* Get all customers
* Get customer by ID
* Search customers by name
* Get premium customers based on balance threshold

### Backend Features

* MVC package structure
* JSON API responses
* In-memory mock database
* Customer/account relationship modeling
* HTTP 404 handling for missing customers

---

## Project Structure

```text
src/main/java/com/example/bankingapi
│
├── controller
├── model
├── data
├── service
└── BankingApiApplication.java
```

---

## Current API Endpoints

### Customers

```http
GET /api/customers
GET /api/customers/{id}
GET /api/customers/search?name={name}
GET /api/customers/premium
```

---

## Running the Application

1. Open the project in IntelliJ IDEA
2. Run `BankingApiApplication.java`
3. Spring Boot starts on:

```text
http://localhost:8080
```

Example endpoint:

```text
http://localhost:8080/api/customers
```

---

## Notes

* Data is currently hardcoded inside `DataStore.java`
* Restarting the application resets all data
* Database integration and frontend development will be added in future branches

# Full Stack Backend Frontend SQL Integration

## Overview

This branch represents the first complete full-stack integration of the BankApp project. The application now includes a working React frontend connected to a Spring Boot backend with MySQL database persistence.

The goal of this branch is to demonstrate end-to-end communication between the frontend user interface and backend REST API using a modern full-stack architecture.

---

## Full Stack Architecture

```text
React Frontend
        ↓
Axios HTTP Requests
        ↓
Spring Boot REST API
        ↓
Spring Data JPA / Hibernate
        ↓
MySQL Database
```

---

## Technologies Used

### Frontend

* React
* Vite
* Axios
* JavaScript
* CSS

### Backend

* Spring Boot
* Spring Data JPA
* Hibernate
* REST Controllers
* Maven

### Database

* MySQL

---

## Features Implemented

### Frontend

* React frontend environment configured with Vite
* Dynamic customer rendering
* Customer creation form
* API communication using Axios
* React state management using hooks
* Live frontend updates after database changes

### Backend

* REST API endpoints
* CustomerController implementation
* Service layer integration
* Repository layer integration
* MySQL persistence using JPA/Hibernate
* CORS configuration for frontend communication

### Database

* Customer records stored in MySQL
* CRUD-ready relational structure

---

## Current API Endpoints

### Get All Customers

```http
GET /api/customers
```

### Create Customer

```http
POST /api/customers
```

Example request body:

```json
{
  "name": "Alejandro Caro",
  "email": "alejandro@example.com"
}
```

---

## Running the Backend

Navigate to the backend project and start Spring Boot:

```bash
mvn spring-boot:run
```

Backend runs on:

```text
http://localhost:8080
```

---

## Running the Frontend

Navigate to the frontend project:

```bash
npm install
npm run dev
```

Frontend runs on:

```text
http://localhost:5173
```

---

## Frontend Structure

```text
src/
├── api/
│   └── customerApi.js
├── assets/
├── components/
├── pages/
├── App.jsx
├── App.css
├── index.css
└── main.jsx
```

---

## Full Stack Functionality

The application currently supports:

* Viewing customers from MySQL
* Adding new customers through React UI
* Persisting customer data through Spring Boot
* Dynamic frontend updates after API operations

---

## Future Improvements

Planned enhancements include:

* Update and delete customer functionality
* Authentication and authorization
* React Router navigation
* Improved UI/UX design
* Form validation
* Environment configuration files
* Deployment setup
* Unit and integration testing

---

## Status

This branch represents the first successful full-stack integration milestone for the BankApp project using React, Spring Boot, and MySQL.

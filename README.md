# BankApp

## Overview

BankApp is a Java console-based digital banking application. The program allows users to log in as either an admin or a customer and perform basic banking operations through a terminal menu.

This project is the first version of the banking system and focuses on core object-oriented programming concepts such as classes, inheritance, lists, constructors, getters, setters, method overriding, and menu-driven program flow.

---

## Features

### Admin Features

* Add new customers
* Delete customers
* Update customer information
* Add checking or savings accounts to customers
* View all customer accounts
* View all registered customers

### Customer Features

* Log in using customer credentials
* View customer dashboard
* View associated bank accounts

---

## Technologies Used

* Java
* IntelliJ IDEA
* Object-Oriented Programming
* Java Collections
* Console-based user interface

---

## Main Classes

### Main

The main application class. It starts the program, loads sample data, handles login, and controls the admin/customer menu flow.

### User

Represents login information such as username, password, and user role.

### Customer

Represents a bank customer. Each customer has an ID, name, username, password, and a list of accounts.

### Account

An abstract base class for bank accounts. It stores the account ID and balance and defines an abstract `addInterest()` method.

### CheckingAccount

A child class of `Account` that represents a checking account and applies 2% interest.

### SavingsAccount

A child class of `Account` that represents a savings account and applies 5% interest.

---

## Sample Login Credentials

### Admin

```text
Username: admin
Password: admin123
```

### Customers

```text
Username: rohit
Password: rohit123
```

```text
Username: alejandro
Password: alejandro123
```

---

## How to Run

1. Open the project in IntelliJ IDEA
2. Open `Main.java`
3. Run the `main()` method
4. Use the terminal to enter login credentials and navigate the menus

---

## Current Project Status

This branch contains the original console-based banking application.

A separate backend branch will contain the Spring Boot REST API version of the banking system. The REST API will expose customer and account data through HTTP endpoints and return JSON responses.

---

## Future Improvements

* Convert console logic into REST API endpoints
* Add persistent database storage
* Add frontend user interface
* Improve authentication and user roles
* Add transaction history
* Add deposit and withdrawal functionality

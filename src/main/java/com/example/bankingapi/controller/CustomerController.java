package com.example.bankingapi.controller;

/*
 * CustomerController.java
 *
 * Purpose:
 * Handles customer-related REST API endpoints.
 *
 * Current focus:
 * - GET all customers from MySQL database
 */

import com.example.bankingapi.model.Customer;
import com.example.bankingapi.service.CustomerService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    /*
     * GET /api/customers
     *
     * Returns all customers from the MySQL database.
     */
    @GetMapping("/api/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
package com.example.bankingapi.tests;

/*
 * CustomerServiceTest.java
 *
 * Purpose:
 * Contains unit tests for CustomerService methods.
 *
 * These tests verify that the service layer behaves correctly
 * for both successful and failing scenarios.
 */
import com.example.bankingapi.service.CustomerService;

import com.example.bankingapi.model.Customer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerServiceTest {

    /*
     * Test:
     * Verifies that getAllCustomers() returns customers successfully.
     */
    @Test
    void shouldReturnAllCustomers() {

        // Create service object
        CustomerService customerService = new CustomerService();

        // Call method being tested
        List<Customer> customers = customerService.getAllCustomers();

        // Verify list is not empty
        assertFalse(customers.isEmpty());
    }
}
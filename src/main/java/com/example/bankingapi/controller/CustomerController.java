/*
 * CustomerController.java
 *
 * Purpose:
 * Handles customer-related REST API endpoints.
 *
 * Responsibilities:
 * - Retrieve all customers
 * - Retrieve customer by ID
 * - Future customer CRUD operations
 *
 * Uses the DataStore class as the application's
 * temporary data source.
 */

package com.example.bankingapi.controller;

import com.example.bankingapi.model.Account;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;

import com.example.bankingapi.data.DataStore;
import com.example.bankingapi.model.Customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    /*
     * GET /api/customers
     *
     * Returns a list of all customers.
     */
    @GetMapping("/api/customers")
    public List<Customer> getAllCustomers() {

        return DataStore.customers;
    }

    @GetMapping("/api/customers/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable int id) {

        for (Customer customer : DataStore.customers) {

            if (customer.getId() == id) {
                return ResponseEntity.ok(customer);
            }
        }

        return ResponseEntity.notFound().build();
    }

    /*
     * GET /api/customers/search?name={name}
     *
     * Returns customers whose names match the search parameter.
     */
    @GetMapping("/api/customers/search")
    public List<Customer> getCustomerByName(@RequestParam String name) {

        // Create list to store matching customers
        List<Customer> matchingCustomers = new ArrayList<>();

        // Loop through all customers
        for (Customer customer : DataStore.customers) {

            // Check if customer name contains search text
            if (customer.getName().toLowerCase().contains(name.toLowerCase())) {

                matchingCustomers.add(customer);
            }
        }

        return matchingCustomers;
    }

    /*
     * GET /api/customers/premium
     *
     * Returns customers whose total account balance is greater than 10,000.
     */
    @GetMapping("/api/customers/premium")
    public List<Customer> getAllPremiumCustomers() {

        double premiumThreshold = 10000.00;

        List<Customer> premiumCustomers = new ArrayList<>();

        for (Customer customer : DataStore.customers) {

            double totalBalance = 0;

            for (Account account : customer.getAccounts()) {
                totalBalance += account.getBalance();
            }

            if (totalBalance > premiumThreshold) {
                premiumCustomers.add(customer);
            }
        }

        return premiumCustomers;
    }
}
package com.example.bankingapi.service;

/*
 * CustomerService.java
 *
 * Purpose:
 * Handles customer-related business logic using MySQL
 * through CustomerRepository.
 */

import com.example.bankingapi.model.Customer;
import com.example.bankingapi.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /*
     * Returns all customers from the MySQL database.
     */
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
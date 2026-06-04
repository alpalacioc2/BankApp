package com.example.bankingapi.repository;

import com.example.bankingapi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/*
 * CustomerRepository.java
 *
 * Purpose:
 * Connects the Customer entity to the MySQL database
 * using Spring Data JPA.
 *
 * Spring Data REST automatically exposes REST endpoints
 * for this repository.
 */

@RepositoryRestResource(path = "customers")
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
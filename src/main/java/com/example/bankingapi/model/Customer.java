/*
 * Customer.java
 *
 * Purpose:
 * Represents a customer in the banking system.
 *
 * Each customer contains:
 * - Customer ID
 * - Customer Name
 * - Customer Email
 * - List of associated bank accounts
 *
 * This class is used for storing customer information
 * and returning customer data through the REST API.
 */

package com.example.bankingapi.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private int id;
    private String name;
    private String email;
    private List<Account> accounts;

    public Customer() {
        accounts = new ArrayList<>();
    }

    public Customer(int id, String name, String email, List<Account> accounts) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.accounts = accounts;
    }
    //getter and setter for each
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}

/*
 * Account.java
 *
 * Purpose:
 * Represents a bank account object in the banking system.
 *
 * Each account contains:
 * - Account ID
 * - Account Number
 * - Account Type
 * - Account Balance
 *
 * This class is used as a data model for API responses
 * and in-memory storage.
 */

package com.example.bankingapi.model;

public class Account {

    private int id;
    private String accountNumber;
    private String accountType;
    private double balance;

    public Account() {
    }

    public Account(int id, String accountNumber, String accountType, double balance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

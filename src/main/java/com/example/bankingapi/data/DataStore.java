//package com.example.bankingapi.data;
//
///*
// * DataStore.java
// *
// * Purpose:
// * This class acts as a temporary in-memory database for the banking API.
// * It stores all customers and accounts using Java Lists.
// *
// * Since no real database is being used, all data is reset whenever
// * the application restarts.
// */
//
//import com.example.bankingapi.model.Account;
//import com.example.bankingapi.model.Customer;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class DataStore {
//
//    // Global list storing all customers
//    public static List<Customer> customers = new ArrayList<>();
//
//    // Global list storing all accounts
//    public static List<Account> accounts = new ArrayList<>();
//
//    /*
//     * Static block runs automatically when application starts.
//     * Used here to create initial sample data.
//     */
//    static {
//
//        // Create sample accounts
//        Account account1 = new Account(1, "1001", "Checking", 5000);
//        Account account2 = new Account(2, "1002", "Savings", 12000);
//        Account account3 = new Account(3, "1003", "Checking", 8000);
//
//        // Add accounts to global account list
//        accounts.add(account1);
//        accounts.add(account2);
//        accounts.add(account3);
//
//        // Create Customer 1
//        List<Account> customer1Accounts = new ArrayList<>();
//        customer1Accounts.add(account1);
//
//        Customer customer1 = new Customer(
//                1,
//                "John Doe",
//                "john@example.com",
//                customer1Accounts
//        );
//
//        // Create Customer 2
//        List<Account> customer2Accounts = new ArrayList<>();
//        customer2Accounts.add(account2);
//
//        Customer customer2 = new Customer(
//                2,
//                "Jane Smith",
//                "jane@example.com",
//                customer2Accounts
//        );
//
//        // Create Customer 3
//        List<Account> customer3Accounts = new ArrayList<>(); // this line creates the storage list
//        customer3Accounts.add(account3);
//
//        Customer customer3 = new Customer(
//                3,
//                "Mike Johnson",
//                "mike@example.com",
//                customer3Accounts
//        );
//
//        // Add customers to global customer list
//        customers.add(customer1);
//        customers.add(customer2);
//        customers.add(customer3);
//    }
//}
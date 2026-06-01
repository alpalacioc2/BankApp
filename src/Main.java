import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static List<Customer> customers = new ArrayList<>();
    static List<User> users = new ArrayList<>();

    // Main method: starting point of the application
    public static void main(String[] args) {
        seedData();
        welcome();
        login();
    }

    // Displays the initial welcome message
    private static void welcome() {
        System.out.println("Welcome to ABC: Digital Bank");
    }

    // Seeds default customers and login credentials for testing
    private static void seedData() {
        customers.add(new Customer(1, "Rohit", "rohit", "rohit123"));
        customers.add(new Customer(2, "Alejandro", "alejandro", "alejandro123"));

        users.add(new User("rohit", "rohit123", "customer"));
        users.add(new User("alejandro", "alejandro123", "customer"));
    }

    // Handles authentication and validates admin/customer login
    private static void login() {
        System.out.println("Please enter username and password, space separated:");
        String input = sc.nextLine();

        String[] usernamePassword = input.split(" ");

        if (usernamePassword.length != 2) {
            System.out.println("Invalid input format.");
            return;
        }

        String username = usernamePassword[0];
        String password = usernamePassword[1];

        if (username.equals("admin") && password.equals("admin123")) {
            System.out.println("Admin Login Successful!");
            adminMenu();
        } else {

            Customer customer = findCustomerByLogin(username, password);

            if (customer != null) {
                System.out.println("Customer Login Successful!");
                customerMenu(customer);
            } else {
                System.out.println("Invalid username or password.");
            }
        }
    }

    // Searches for a customer using username and password
    private static Customer findCustomerByLogin(String username, String password) {
        for (Customer customer : customers) {
            if (customer.getUsername().equals(username)
                    && customer.getPassword().equals(password)) {
                return customer;
            }
        }
        return null;
    }

    // Displays the admin dashboard menu and handles menu navigation
    private static void adminMenu() {
        int choice;

        do {
            System.out.println("\n===== ADMIN MENU =====");
            System.out.println("1. Add Customer");
            System.out.println("2. Delete Customer");
            System.out.println("3. Update Customer");
            System.out.println("4. Add Account");
            System.out.println("5. View All Accounts");
            System.out.println("6. View Customers");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    deleteCustomer();
                    break;
                case 3:
                    updateCustomer();
                    break;
                case 4:
                    addAccount();
                    break;
                case 5:
                    viewAllAccounts();
                    break;
                case 6:
                    viewCustomers();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);
    }

    // Displays customer dashboard and customer account information
    private static void customerMenu(Customer customer) {
        System.out.println("\n===== CUSTOMER MENU =====");
        System.out.println("Welcome, " + customer.getName());
        System.out.println("Your accounts:");

        for (Account account : customer.getAccounts()) {
            System.out.println(account);
        }
    }

    // Creates and stores a new customer object
    private static void addCustomer() {
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        int id = customers.size() + 1;

        Customer customer = new Customer(id, name, username, password);
        customers.add(customer);

        System.out.println("Customer added successfully.");
    }

    // Deletes a customer using customer ID
    private static void deleteCustomer() {
        System.out.print("Enter customer ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        customers.removeIf(customer -> customer.getId() == id);

        System.out.println("Customer deleted if ID existed.");
    }

    // Updates customer information using customer ID
    private static void updateCustomer() {
        System.out.print("Enter customer ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Customer customer : customers) {
            if (customer.getId() == id) {
                System.out.print("Enter new name: ");
                customer.setName(sc.nextLine());
                System.out.println("Customer updated successfully.");
                return;
            }
        }

        System.out.println("Customer not found.");
    }

    // Creates checking or savings account for a customer
    private static void addAccount() {
        System.out.print("Enter customer ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Customer foundCustomer = null;

        for (Customer customer : customers) {
            if (customer.getId() == id) {
                foundCustomer = customer;
                break;
            }
        }

        if (foundCustomer == null) {
            System.out.println("Customer not found.");
            return;
        }

        System.out.println("Choose account type:");
        System.out.println("1. Checking");
        System.out.println("2. Savings");
        int type = sc.nextInt();

        System.out.print("Enter starting balance: ");
        double balance = sc.nextDouble();
        sc.nextLine();

        int accountId = foundCustomer.getAccounts().size() + 1;

        if (type == 1) {
            foundCustomer.addAccount(new CheckingAccount(accountId, balance));
        } else if (type == 2) {
            foundCustomer.addAccount(new SavingsAccount(accountId, balance));
        } else {
            System.out.println("Invalid account type.");
            return;
        }

        System.out.println("Account added successfully.");
    }

    // Displays all accounts for all customers
    private static void viewAllAccounts() {
        for (Customer customer : customers) {
            System.out.println("\nCustomer: " + customer.getName());

            if (customer.getAccounts().isEmpty()) {
                System.out.println("No accounts found.");
            } else {
                for (Account account : customer.getAccounts()) {
                    System.out.println(account);
                }
            }
        }
    }

    // Displays all registered customers
    private static void viewCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}

class User {

    private String username;
    private String password;
    private String role;

    // Constructor initializes user login information
    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
}

class Customer {

    private int id;
    private String name;
    private String username;
    private String password;
    private List<Account> accounts;

    // Constructor initializes customer information and account list
    public Customer(int id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.accounts = new ArrayList<>();
    }

    // Returns customer ID
    public int getId() {
        return id;
    }

    // Returns customer name
    public String getName() {
        return name;
    }

    // Returns customer username
    public String getUsername() {
        return username;
    }

    // Returns customer password
    public String getPassword() {
        return password;
    }

    // Returns list of customer accounts
    public List<Account> getAccounts() {
        return accounts;
    }

    // Updates customer name
    public void setName(String name) {
        this.name = name;
    }

    // Adds account object to customer account list
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Converts customer object into readable string output
    @Override
    public String toString() {
        return "Customer ID: " + id + ", Name: " + name + ", Username: " + username;
    }
}

abstract class Account {

    protected int id;
    protected double balance;

    // Constructor initializes account ID and balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    // Abstract method for adding account interest
    public abstract double addInterest();

    // Converts account object into readable string output
    @Override
    public String toString() {
        return "Account ID: " + id + ", Balance: $" + balance;
    }
}

class CheckingAccount extends Account {

    String accountType = "CheckingAccount";

    // Constructor initializes checking account
    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    // Adds 2% interest to checking account balance
    @Override
    public double addInterest() {
        balance = balance + (balance * 0.02);
        return balance;
    }

    // Displays checking account details
    @Override
    public String toString() {
        return accountType + " | Account ID: " + id + " | Balance: $" + balance;
    }
}

class SavingsAccount extends Account {

    String accountType = "SavingsAccount";

    // Constructor initializes savings account
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    // Adds 5% interest to savings account balance
    @Override
    public double addInterest() {
        balance = balance + (balance * 0.05);
        return balance;
    }

    // Displays savings account details
    @Override
    public String toString() {
        return accountType + " | Account ID: " + id + " | Balance: $" + balance;
    }
}
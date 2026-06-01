import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        welcome();
        login();
    }

    private static void welcome() {
        System.out.println("=================================");
        System.out.println("   Welcome to ABC: Digital Bank  ");
        System.out.println("=================================");
    }

    private static void login() {

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Admin Login
        if (username.equals("admin") && password.equals("admin123")) {

            System.out.println("\nLogin Successful!");
            System.out.println("Welcome Admin");

            adminMenu();

        }
        // Customer Login
        else if (username.equals("customer") && password.equals("cust123")) {

            System.out.println("\nLogin Successful!");
            System.out.println("Welcome Customer");

        }
        // Invalid Login
        else {

            System.out.println("\nInvalid Username or Password");

        }
    }

    private static void adminMenu() {

        int choice;

        do {

            System.out.println("\n===== ADMIN MENU =====");
            System.out.println("1. Add Customer");
            System.out.println("2. Delete Customer");
            System.out.println("3. View Customers");
            System.out.println("0. Logout");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Add Customer Selected");
                    break;

                case 2:
                    System.out.println("Delete Customer Selected");
                    break;

                case 3:
                    System.out.println("View Customers Selected");
                    break;

                case 0:
                    System.out.println("Logging Out...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 0);
    }
}
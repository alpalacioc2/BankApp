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

        if (username.equals("admin") && password.equals("admin123")) {
            System.out.println("\nLogin Successful!");
            System.out.println("Welcome Admin");
            bankMenu();
        } else if (username.equals("customer") && password.equals("cust123")) {
            System.out.println("\nLogin Successful!");
            System.out.println("Welcome Customer");
            bankMenu();
        } else {
            System.out.println("\nInvalid Username or Password");
        }
    }

    private static void bankMenu() {
        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. View All Accounts");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Transfer");
            System.out.println("6. Close Account");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    viewAllAccounts();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    transfer();
                    break;
                case 6:
                    closeAccount();
                    break;
                case 7:
                    System.out.println("Exiting System...");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 7);
    }

    private static void createAccount() {
        System.out.println("\nCreate Account Selected");
    }

    private static void viewAllAccounts() {
        System.out.println("\nView All Accounts Selected");
    }

    private static void deposit() {
        System.out.println("\nDeposit Selected");
    }

    private static void withdraw() {
        System.out.println("\nWithdraw Selected");
    }

    private static void transfer() {
        System.out.println("\nTransfer Selected");
    }

    private static void closeAccount() {
        System.out.println("\nClose Account Selected");
    }
}
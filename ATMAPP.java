import java.util.*;

class BankAccount {
    private double bal;

    public BankAccount(double initbal) {
        this.bal = initbal;
    }

    public double getbal() {
        return bal;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            bal += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= bal) {
            bal -= amount;
            return true;
        }
        return false;
    }
}

class ATM {
    private BankAccount account;

    public ATM(BankAccount acc) {
        this.account = acc;
    }

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check bal");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkbal();
                    break;
                case 2:
                    deposit(sc);
                    break;
                case 3:
                    withdraw(sc);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
        sc.close();
    }

    private void checkbal() {
        System.out.println("Your current bal is: $" + account.getbal());
    }

    private void deposit(Scanner scanner) {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        if (account.deposit(amount)) {
            System.out.println("Deposit successful. Your new bal is: $" + account.getbal());
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    private void withdraw(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful. Your new bal is: $" + account.getbal());
        } else {
            System.out.println("Insuff bal or invalid amount. Withdrawal failed.");
        }
    }
}

public class ATMAPP{
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.0);
        ATM atm = new ATM(userAccount);
        atm.showMenu();
    }
}
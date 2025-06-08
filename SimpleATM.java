import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User inputs starting balance
        System.out.print("Enter your starting balance: ₹");
        double balance = sc.nextDouble();

        int choice;

        do {
            System.out.println("\n==== ATM Menu ====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Your Balance: ₹" + balance);
            } else if (choice == 2) {
                System.out.print("Enter amount to deposit: ₹");
                double amount = sc.nextDouble();
                if (amount > 0) {
                    balance += amount;
                    System.out.println("Money Deposited Successfully!");
                } else {
                    System.out.println("Invalid deposit amount.");
                }
            } else if (choice == 3) {
                System.out.print("Enter amount to withdraw: ₹");
                double amount = sc.nextDouble();
                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    System.out.println("Money Withdrawn Successfully!");
                } else {
                    System.out.println("Invalid or Insufficient balance.");
                }
            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM.");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}

package ATMInterface;

import java.util.Scanner;

public class ATMUserInterface {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.0); // Example initial balance
        ATM atm = new ATM(userAccount);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    double balance = atm.checkBalance();
                    System.out.println("Current Balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    
                    if (atm.withdraw(withdrawAmount)){
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    System.out.println("Deposit successful.");
                    break;
                case 4:
                    System.out.println("Exiting. Have a nice day!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }
}

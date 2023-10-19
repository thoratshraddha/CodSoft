package ATMInterface;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        // Implement deposit logic
    }

    public void withdraw(double amount) {
        // Implement withdrawal logic, considering sufficient balance
        // Return true if the withdrawal is successful, false otherwise
    }
}

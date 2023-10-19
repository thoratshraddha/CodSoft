package ATMInterface;


public class ATM {
    private BankAccount userAccount;  // Reference to the user's bank account

    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    public boolean  withdraw(double amount) {
		return false;
		
    	
        // Implement the withdrawal logic, considering sufficient balance
    }

    public void deposit(double amount) {
        // Implement the deposit logic
    }

    public double checkBalance() {
		return 0;
        // Implement logic to retrieve the account balance
    }
}

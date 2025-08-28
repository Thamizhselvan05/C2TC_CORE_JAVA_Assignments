package Assignment_6;

public class BankAccount {
    private int accountNumber;   
    private double balance;      

   
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) throw new InvalidAmountException("Deposit amount must be > 0");
        balance += amount;
        System.out.println("Successfully deposited: " + amount);
    }

   
    public void withdraw(double amount)
            throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) throw new InvalidAmountException("Withdrawal amount must be > 0");
        if (amount > balance) throw new InsufficientFundsException("Insufficient balance");
        balance -= amount;
        System.out.println("Successfully withdrawn: " + amount);
    }

  
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + " | Current Balance: " + balance);
    }
}


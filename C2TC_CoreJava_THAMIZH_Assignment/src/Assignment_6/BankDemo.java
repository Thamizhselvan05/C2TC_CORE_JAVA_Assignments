package Assignment_6;

public class BankDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(12345, 1000.0);

        try {
           
            account.displayBalance();
            account.deposit(500);         
            account.withdraw(200);        

          
            account.withdraw(2000);       
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
            account.displayBalance();
        }

       
        try {
            account.deposit(-50);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Final state:");
            account.displayBalance();
        }

    }
}


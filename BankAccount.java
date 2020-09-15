public class BankAccount
{
    private double balance;

    public BankAccount(int balance) 
    {
        this.balance = balance;
    }

    /**
     * TODO:  Change withdraw to throw an IllegalArgumentException if the balance would go negative
     */
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    /**
     * TODO:  Change withdraw2 to throw an InsufficientFundsException
     *          if the balance would go negative. 
     */
    public void withdraw2(double amount) {
        balance = balance - amount;
    }

    /**
     * TODO:  Change withdraw3 to throw an InsufficientFundsException2 
     *          if the balance would go negative.  Notice that you have to change the declaration of
     *          the method if you are not throwing a subclass of RuntimeException.
     */
    public void withdraw3(double amount) {
        balance = balance - amount;
    }
}
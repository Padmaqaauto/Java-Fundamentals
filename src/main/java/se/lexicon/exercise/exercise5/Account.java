package se.lexicon.exercise.exercise5;

public abstract class Account{

    // private fields
    private String accountHolderName;
    private double balance;

    // constructor
    public Account(String accountHolderName, double balance) {
        setAccountHolderName(accountHolderName);
        setBalance(balance);
    }

    // Getters

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

   // Setters
    public void setAccountHolderName(String accountHolderName) {
        if(accountHolderName == null ||  accountHolderName.isBlank())
            throw new IllegalArgumentException("The account holder name cannot be null or blank");
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        if(balance < 0)
            throw new IllegalArgumentException("The balance cannot be negative");
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount < 0)
            throw new IllegalArgumentException("The amount cannot be negative");
        this.balance += amount;
        IO.println(accountHolderName + " deposited amount " + amount);
    }

    public abstract void processMonth(Account account);

    public void printSummary() {
        IO.println(accountHolderName + " | Balance: "
                + balance + " kr");
    }
}

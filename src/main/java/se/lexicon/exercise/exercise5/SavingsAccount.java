package se.lexicon.exercise.exercise5;

public class SavingsAccount extends Account {

    //fields
    private final double interestRate;

    //Constructor
    public SavingsAccount(String accountHolderName, double balance,  double interestRate) {
        super(accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void processMonth(Account account) {
        double interest = getBalance() * interestRate / 100;
        setBalance(getBalance() + interest);

        IO.println(getAccountHolderName() + ": " + interest + " kr interest credited");
    }

}

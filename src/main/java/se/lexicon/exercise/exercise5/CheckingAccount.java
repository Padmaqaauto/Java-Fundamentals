package se.lexicon.exercise.exercise5;

public class CheckingAccount extends Account {

    private final double monthlyFee;

    public CheckingAccount(String accountHolderName, double balance, double monthlyFee) {
        super(accountHolderName, balance);
        this.monthlyFee = monthlyFee;
    }

    @Override
    public void processMonth(Account account) {
        setBalance(getBalance() - monthlyFee);

        IO.println(getAccountHolderName() + ": " + monthlyFee + " kr monthly fee charged");
    }
}

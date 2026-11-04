package se.lexicon.exercise.exercise5;

public class LoanAccount extends Account {

    private final double loanRate;

    public LoanAccount(String accountHolderName, double balance, double loanRate) {
        super(accountHolderName, balance);
        this.loanRate = loanRate;
    }

    @Override
    public void processMonth(Account account) {
        double interest = getBalance() * loanRate / 100;
        setBalance(getBalance() + interest);

        IO.println(getAccountHolderName() + ": " + interest + " kr loan interest added");
    }
}

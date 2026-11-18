package se.lexicon.practice.session7.exception;

public class InsufficientFundsException extends Exception {
    private final Double balance;
    private final Double amount;

    public InsufficientFundsException(String message, Double balance, Double amount) {
        super(message);
        this.balance = balance;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Insufficient funds: balance = " + balance + ", amount = " + amount;
    }
}

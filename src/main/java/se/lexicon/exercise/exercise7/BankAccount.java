package se.lexicon.exercise.exercise7;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (!Double.isFinite(initialBalance) || initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance must be a non-negative amount.");
        }
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        validateAmount(amount);
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        validateAmount(amount);
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal exceeds the available balance.");
        }
        balance -= amount;
    }

    private static void validateAmount(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Amount must be a positive, finite number.");
        }
    }
}

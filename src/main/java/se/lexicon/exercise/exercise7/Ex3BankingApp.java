package se.lexicon.exercise.exercise7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3BankingApp {
    void main() {
        BankAccount account = new BankAccount(100.00);

        while (true) {
            String action = IO.readln("Choose deposit, withdraw, or exit: ").trim().toLowerCase();
            if (action.equals("exit")) {
                break;
            }

            if (!action.equals("deposit") && !action.equals("withdraw")) {
                IO.println("Please choose deposit, withdraw, or exit.");
                continue;
            }

            try {
                double amount = Double.parseDouble(IO.readln("Enter amount: "));
                if (action.equals("deposit")) {
                    account.deposit(amount);
                    IO.println("Deposit complete.");
                } else {
                    account.withdraw(amount);
                }
                IO.println("Balance: " + String.format("%.2f", account.getBalance()));
            } catch (NumberFormatException e) {
                IO.println("Please enter a valid amount.");
            } catch (InsufficientBalanceException | IllegalArgumentException e) {
                IO.println(e.getMessage());
            }
        }
    }
}

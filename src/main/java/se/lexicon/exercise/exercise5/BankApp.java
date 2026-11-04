package se.lexicon.exercise.exercise5;

import java.util.ArrayList;

public class BankApp {
    void main(){

      Bank bank = new Bank("Lexicon Bank", new ArrayList<>());

      Account savings = new SavingsAccount("Padma", 1000, 2);

      Account checking = new CheckingAccount("Meera", 500, 25);

      Account loan = new LoanAccount("Arun", 5000, 3);

        bank.addAccount(savings);
        bank.addAccount(checking);
        bank.addAccount(loan);

        savings.deposit(500);

        // 1. Starting balances
        bank.printAllSummaries();

        // 2. Process month-end rules
        bank.processAllAccounts();

        // 3. Updated balances
        bank.printAllSummaries();
    }
}

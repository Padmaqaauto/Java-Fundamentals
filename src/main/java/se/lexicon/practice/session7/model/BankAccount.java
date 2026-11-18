package se.lexicon.practice.session7.model;

import se.lexicon.practice.session7.exception.InsufficientFundsException;

public class BankAccount {

        private final int accountNumber;
        private double balance;

        public BankAccount(int accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            deposit(initialBalance);
        }


        public void deposit(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Deposit amount must be positive.");
            }
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        }


        public void withdraw(double amount) throws InsufficientFundsException {
            if (amount <= 0) {
                throw new IllegalArgumentException("Withdraw amount must be greater than 0");
            }
            if(amount > balance) {
                throw new InsufficientFundsException("Withdraw amount must be less than balance", balance, amount);
            }

            balance -= amount;
            System.out.println("✅ Withdrawal successful. New balance: " + balance);
        }



        public int getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        @Override
        public String toString() {
            return "BankAccount{" +
                    "accountNumber=" + accountNumber +
                    ", balance=" + balance +
                    '}';
        }
    }


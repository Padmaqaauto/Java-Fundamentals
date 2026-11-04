package se.lexicon.exercise.exercise5;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    //fields
    private String bankName;
    private final List<Account> accounts;

      public Bank(String bankName, List<Account> accounts) {
        setBankName(bankName);
        this.accounts = new ArrayList<>(accounts);
      }

    public String getBankName() {
        return bankName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setBankName(String bankName) {
          if(bankName == null || bankName.isBlank())
              throw new IllegalArgumentException("Bank name cannot be null or blank");
        this.bankName = bankName;
    }


    public void addAccount(Account account){
          if(account == null)
              throw new IllegalArgumentException("Account cannot be null");
        accounts.add(account);
        IO.println(account.getAccountHolderName() + " has been added to the bank " + bankName);
    }

    public void processAllAccounts(){
        IO.println("\n--- Month End Processing: "+ bankName + " ---");
        for(Account account: accounts){
            account.processMonth(account);
        }
    }
    public void printAllSummaries() {
        IO.println("\n--- " + bankName
                + " Account Summaries ---");

        for (Account account : accounts) {
            account.printSummary();
        }
    }


}

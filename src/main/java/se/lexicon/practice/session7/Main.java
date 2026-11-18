package se.lexicon.practice.session7;

import se.lexicon.practice.session7.exception.ExceptionHandler;
import se.lexicon.practice.session7.model.BankAccount;

public class Main {

    void main(){
        try {
            BankAccount account = new BankAccount(1001, 100);
            account.deposit(-50);
            account.withdraw(350);
            IO.println(account);
        } catch (Exception e) {
            ExceptionHandler.handle(e);
        }

    }
}

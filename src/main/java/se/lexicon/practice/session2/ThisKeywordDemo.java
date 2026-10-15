package se.lexicon.practice.session2;

class BankAccount{
    String accountHolder;
    double balance;

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount){
        this.balance += amount;
        IO.println(this.accountHolder + " deposited " + amount);
    }
}
public class ThisKeywordDemo {
    void main(){

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountHolder("Padma");
        bankAccount.deposit(5000);
    }
}

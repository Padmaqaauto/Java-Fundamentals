package se.lexicon.practice;
class BankApp{
    //Instance Field unique to each account
    String accountHolder;
    double balance;

    // Static Field (shared by All accounts)
    static double Interest_Rate = 4.5;

    // Instance Method (Operates on specific account)
    public void deposit(double amount){
        this.balance += amount;
        IO.println(accountHolder + " deposited "+ amount);
    }

    // static method (shared logic)
    public static void setInterest_Rate(double rate){
        Interest_Rate = rate;
        IO.println("Interest rate globally set to " + rate +"%");
    }

    public static double calculateLoan(double amount, int years){
        return amount + (amount * (Interest_Rate / 100) * years);
    }
}
public class StaticInstanceDemo {
void main(){

        // working with instance members
        BankApp app = new BankApp();
        app.accountHolder = "Padma";
        app.deposit(5000);

        BankApp app1 = new BankApp();
        app1.accountHolder = "Meera";
        app1.deposit(1000);

        // Working with static members
        BankApp.setInterest_Rate(5.4);
        IO.println(BankApp.calculateLoan(5000, 2));
}
}

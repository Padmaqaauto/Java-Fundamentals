package se.lexicon.practice;

class AppConfig{
    static final String App_Name = "Lexicon App";
    static final double Tax_Rate = 0.25;
    static final int Max_Retires = 3;
}
public class StaticFinalDemo {
    void main(){
        IO.println("App: "+AppConfig.App_Name);
        IO.println("Tax: "+AppConfig.Tax_Rate * 100 + "%");
    }
}

package se.lexicon.practice;

public class BankPayment {

    // Process Credit card
    public static void processPayment(String cardNumber, String cvv, double amount) {
        IO.println("Processing Card : " + cardNumber);
    }

    // Process Bank Transfer
    public static void processPayment(String bankAccount, String swift, double amount, String currency){
        IO.println("Processing Bank Transfer");
        IO.println("Bank Account : " + bankAccount + "  Amount : " + amount + "  Currency : " + currency);
    }

    void main() {

       processPayment("506812348097","123",5000.00);
       processPayment("122334455667","123",7500.00,"SEK");
    }
}

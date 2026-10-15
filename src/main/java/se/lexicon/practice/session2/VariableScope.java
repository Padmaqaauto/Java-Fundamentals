package se.lexicon.practice.session2;

public class VariableScope{

    // Class Variable Scope (Instance Field)
    // Accessible from any method in the class
    double totalPrice;

    void addItem(String itemName, double itemPrice){
        // Method level scope (Parameter & local variable)
        double discount = itemPrice * 0.1;
        double finalPrice = itemPrice - discount;

        if(finalPrice > 0){
            // Block level scope
            String message = "Added: " + itemName + " for " + finalPrice;
            IO.println(message);
        }
        totalPrice += finalPrice;
    }

    void printTotalPrice(){
        IO.println("Total Price: " + totalPrice);
    }

    void main(){

        addItem("Laptop", 1200);
        addItem("Mouse", 200);
        addItem("Keyboard", 500);
        printTotalPrice();
    }
}
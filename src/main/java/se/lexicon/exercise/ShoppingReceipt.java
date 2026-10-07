package se.lexicon.exercise;

public class ShoppingReceipt {
    void main(){
        String item1 = "Apple";
        int quantity1 = 2;
        double price1 = 15.00;

        String item2 = "Milk";
        int quantity2 = 1;
        double price2 = 22.50;

        String item3 = "Bread";
        int quantity3 = 3;
        double price3 = 18.00;

        double itemPrice1 = price1 * quantity1;
        double itemPrice2 = price2 * quantity2;
        double itemPrice3 = price3 * quantity3;

        double totalPrice = itemPrice1 + itemPrice2 + itemPrice3;

        IO.println("==============================");
        IO.println("\t\tReceipt");
        IO.println("==============================");
        IO.println(item1  +"  \t " + quantity1 + " x " + String.format("%.2f", price1) + " = "
                + String.format("%.2f", itemPrice1) + "SEK");

        IO.println(item2 +"  \t " +  quantity2 + " x " + String.format("%.2f", price2) + " = "
                + String.format("%.2f", itemPrice2) + "SEK");

        IO.println(item3 +"  \t " +  quantity3 + " x " + String.format("%.2f", price3) + " = "
                + String.format("%.2f", itemPrice3) + "SEK");
        IO.println("------------------------------");
        IO.println("Grand Total: \t\t " + String.format("%.2f", totalPrice));
        IO.println("==============================");
    }
}

package se.lexicon.practice;

public class VariableDeclaration {

    void main() {

        //--- Primitives ---
        int orderId = 100432;
        int quantity = 2;
        double unitPrice = 899.99;
        double discountPercent = 10.0;
        boolean isPaid = false;
        char deliveryMethod = 'E';

        //--- Reference Type ---
        String customerName = "Padmavathy"; //  String  — not a primitive, it is a class (reference type)

        // --- Calculate Totals ---
        double subTotal = quantity * unitPrice;
        double discount = subTotal * (discountPercent / 100);
        double totalAmount = subTotal - discount;

        // --- Print the OrderConfirmation ---

        IO.println("======= Order Confirmation =======");
        IO.println("Order ID: " + orderId);
        IO.println("Customer Name: " + customerName);
        IO.println("Items Ordered: " + quantity + "x" + unitPrice + "SEK");
        IO.println("SubTotal :" + subTotal + "SEK");
        IO.println("Discount (10%) :" + discount + "SEK");
        IO.println("Total Amount :" + totalAmount + "SEK");
        IO.println("Delivery Method :" + (deliveryMethod == 'E' ? "Express" : "Standard") );
        IO.println("Paid :" + isPaid);

        //--- Update: payment is confirmed
        isPaid = true;
        IO.println("Status is updated:" +isPaid);

    }
}

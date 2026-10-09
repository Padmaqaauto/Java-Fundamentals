package se.lexicon.workshops;

class Order {
    String name;
    int item;
    String selectedItem;
    double selectedPrice;
    int quantity;
    String loyaltyChoice;

    String item1 = "Espresso";
    double price1 = 25.00;

    String item2 = "Cappuccino";
    double price2 = 35.00;

    String item3 = "Latte";
    double price3 = 40.00;

    String item4 = "Croissant";
    double price4 = 30.00;

    String item5 = "SandWich";
    double price5 = 55.00;


    double subTotal;
    double discount ;
    double vatTax;
    double totalAmount;


    void displayMenu() {
        IO.println("==============================");
        IO.println("\t\tLexicon Cafe");
        IO.println("==============================");
        IO.println("1. " + item1 + "\t\t\t " + String.format("%.2f", price1) + " SEK ");
        IO.println("2. " + item2 + "\t\t " + String.format("%.2f", price2) + " SEK ");
        IO.println("3. " + item3 + "\t\t\t " + String.format("%.2f", price3) + " SEK ");
        IO.println("4. " + item4 + "\t\t " + String.format("%.2f", price4) + " SEK ");
        IO.println("5. " + item5 + "\t\t\t " + String.format("%.2f", price5) + " SEK ");
        IO.println("==============================\n");
    }

    void  fetchItemDetails() {
        switch (item) {
            case 1:
                selectedItem = item1;
                selectedPrice = price1;
                break;

            case 2:
                selectedItem = item2;
                selectedPrice = price2;
                break;

            case 3:
                selectedItem = item3;
                selectedPrice = price3;
                break;

            case 4:
                selectedItem = item4;
                selectedPrice = price4;
                break;

            case 5:
                selectedItem = item5;
                selectedPrice = price5;
                break;

            default:
                IO.println("Invalid item number.");
        }
    }


    double calculateSubTotal() {
        subTotal = selectedPrice * quantity;
        return subTotal;
    }

    double calculateDiscount() {
        if (loyaltyChoice.equals("yes")) {
            discount = subTotal * ((double) 15 /100);
        } else if ((loyaltyChoice.equals("no")) && (subTotal > 150)) {
            discount = subTotal * ((double) 10 /100);
        } else {
            discount = 0;
        }
        return discount;
    }

    double calculateVat() {
        double amount = subTotal - discount;
        vatTax = amount * ((double) 12 /100);
        return vatTax;
    }

    double calculateTotalBill(){
        totalAmount = subTotal - discount + vatTax;
        return totalAmount;
    }


    void printReceipt() {
        IO.println("==============================");
        IO.println("\t\tLexicon Cafe");
        IO.println("==============================");
        IO.println("Customer:  \t" + name);
        IO.println("Item    : \t" + selectedItem + " x " + quantity);
        IO.println("Subtotal:  \t" + String.format("%.2f", calculateSubTotal()) + " SEK");
        if(calculateDiscount() > 0) {
            IO.println("Discount:  \t" + "-" +String.format("%.2f", calculateDiscount()) + " SEK");
        }
        IO.println("VAT     :  \t" + String.format("%.2f", calculateVat()) + " SEK");
        IO.println("------------------------------");
        IO.println("TOTAL   : \t" + String.format("%.2f", calculateTotalBill()) + " SEK");
    }

    void displayMessage(){
        IO.println("==============================");
        IO.println("\tThank you, "+name+"!\n\tSee you next time.");
        IO.println("==============================");
    }

}

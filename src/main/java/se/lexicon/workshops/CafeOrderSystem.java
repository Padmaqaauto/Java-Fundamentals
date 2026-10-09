package se.lexicon.workshops;

import java.util.Scanner;

class CustomerOrder {
    String name;

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

    String selectedItem;
    double selectedPrice;
    int quantity;
    String loyaltyChoice;
    double subTotal;
    double discount ;
    double vatTax;
    double totalAmount;

    Scanner input;

    CustomerOrder(Scanner input) {
        this.input = input;
    }

    void getCustomerDetails() {
        while (true) {
            IO.println("\nWelcome! What is your name?");
            name = input.nextLine().trim();

            if (!name.isEmpty()) {
                break;
            }
            IO.println("Name cannot be empty! Please try again!");
        }
    }

    void greet() {
        IO.println("Hi " + name + "! Here is our Menu:\n");
    }

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

    void getOrder() {

        int item;
        while (true) {
            IO.println("Enter item number (1-5): ");
            if(input.hasNextInt()) {
                item = input.nextInt();
                input.nextLine();
                if (item >= 1 && item <= 5) {
                    break;
                } else {
                    IO.println("Error: Enter an item number between 1 and 5.");
                }
            } else {
                IO.println("Error: Please enter a numeric value between 1 and 5.");
                input.nextLine();
            }
        }

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
                return;
        }

        while (true) {
            IO.println("How many? ");
            if(input.hasNextInt()) {
                quantity = input.nextInt();
                input.nextLine();
                if(quantity > 0){
                    break;
                } else {
                    IO.println("Error: Quantity must be greater than 0.");
                }
            } else {
                IO.println("Error: Please enter a numeric value greater than 0.");
                input.nextLine();
            }
        }

        while (true) {
            IO.println("Loyalty Member? (yes/no)");
            loyaltyChoice = input.nextLine().trim().toLowerCase();

                if(loyaltyChoice.equals("yes") || loyaltyChoice.equals("no")) {
                    break;
                } else {
                    IO.println("Error: Please enter only yes or no.");
                }
        }
        IO.println("");
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

public class CafeOrderSystem {
    void main() {
        Scanner sc = new Scanner(System.in);
        CustomerOrder order = new CustomerOrder(sc);
        int count = 0;
        boolean flag = true;
        double totalRevenue = 0;
        while (flag) {
            order.getCustomerDetails();
            order.greet();
            order.displayMenu();
            order.getOrder();
            order.printReceipt();
            order.displayMessage();
            while (true){
                IO.println("\nNext customer? Enter 'yes' to continue or 'done' to close.");
                String text = sc.nextLine().trim().toLowerCase();
                if (text.equalsIgnoreCase("yes")) {
                    break;
                } else if (text.equalsIgnoreCase("done")) {
                    flag = false;
                    break;
                } else {
                    IO.println("Error: Please enter yes or done.");
                }

            }
            totalRevenue += order.calculateTotalBill();
            count++;
        }
        IO.println("\n==============================");
        IO.println("\t\t END OF DAY REPORT");
        IO.println("==============================");
        IO.println("Customer Served: "+ count);
        IO.println("Total Revenue  : "+ String.format("%.2f", totalRevenue) + " SEK");
        IO.println("==============================");
    }
}

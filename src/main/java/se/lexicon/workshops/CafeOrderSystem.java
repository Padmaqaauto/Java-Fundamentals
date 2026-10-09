package se.lexicon.workshops;

import java.util.Scanner;

public class CafeOrderSystem {
    void main() {
        Scanner sc = new Scanner(System.in);


        int count = 0;
        boolean flag = true;
        double totalRevenue = 0;

        while (flag) {

            Order order = new Order();

            while (true) {
                IO.println("\nWelcome! What is your name?");
                order.name = sc.nextLine().trim();

                if (!order.name.isEmpty()) {
                    break;
                }
                IO.println("Name cannot be empty! Please try again!");
            }

            IO.println("Hi " + order.name + "! Here is our Menu:\n");

            order.displayMenu();

            while (true) {
                IO.println("Loyalty Member? (yes/no)");
                order.loyaltyChoice = sc.nextLine().trim().toLowerCase();

                if (order.loyaltyChoice.equals("yes") || order.loyaltyChoice.equals("no")) {
                    break;
                } else {
                    IO.println("Error: Please enter only yes or no.");
                }
            }
            IO.println("");

            while (true) {
                IO.println("Enter item number (1-5): ");
                if(sc.hasNextInt()) {
                    order.item = sc.nextInt();
                    sc.nextLine();
                    if (order.item >= 1 && order.item <= 5) {
                        break;
                    } else {
                        IO.println("Error: Enter an item number between 1 and 5.");
                    }
                } else {
                    IO.println("Error: Please enter a numeric value between 1 and 5.");
                    sc.nextLine();
                }
            }

            order.fetchItemDetails();

            while (true) {
                System.out.println("How many?");

                if (sc.hasNextInt()) {
                    order.quantity = sc.nextInt();
                    sc.nextLine();

                    if (order.quantity > 0) {
                        break;
                    }

                    System.out.println(
                            "Error: Quantity must be greater than 0.");
                } else {
                    System.out.println(
                            "Error: Please enter a valid whole number.");
                    sc.nextLine();
                }
            }

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

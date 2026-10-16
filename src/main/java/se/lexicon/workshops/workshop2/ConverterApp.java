
package se.lexicon.workshops.workshop2;

import java.util.Scanner;

class ConversionMenu {

    static final double SEK_PER_USD = 10.87;
    static final double SEK_PER_EUR = 11.32;

    double currencyConvertor(int option, double currency) {
        return switch (option) {
            case 1 -> currency / SEK_PER_USD;
            case 2 -> currency / SEK_PER_EUR;
            default -> -1;
        };
    }

    double fuelConsumptionConvertor(int option, double fuelValue) {
        if (fuelValue <= 0) {
            return -1;
        }

        return switch (option) {
            case 1, 2 -> 100.0 / fuelValue;
            default -> -1;
        };
    }

    String gradeConvertor(double score) {
        if (score < 0 || score > 100) {
            return "Invalid score. Enter a score between 0 and 100.";
        }

        long roundedScore = Math.round(score);

        if (roundedScore >= 90) {
            return "Score: " + roundedScore + " | Grade: A | Label: Excellent";
        } else if (roundedScore >= 80) {
            return "Score: " + roundedScore + " | Grade: B | Label: Good";
        } else if (roundedScore >= 70) {
            return "Score: " + roundedScore + " | Grade: C | Label: Pass";
        } else if (roundedScore >= 60) {
            return "Score: " + roundedScore + " | Grade: D | Label: Below average";
        } else {
            return "Score: " + roundedScore + " | Grade: F | Label: Fail";
        }
    }
}

public class ConverterApp {

    void main() {
        Scanner input = new Scanner(System.in);
        ConversionMenu convertor = new ConversionMenu();

        boolean flag = true;

        while (flag) {
            IO.println("==================================");
            IO.println("LEXICON CONVERTER APP");
            IO.println("==================================");
            IO.println("1. Currency Converter");
            IO.println("2. Fuel Consumption Converter");
            IO.println("3. Grade Converter");
            IO.println("4. Exit");
            IO.println("==================================");

            IO.println("Choose an option: ");
            int choice = input.nextInt();

            int converterChoice;

            switch (choice) {
                case 1:
                    IO.println("\n--- Currency Converter ---");
                    IO.println("1. SEK to USD");
                    IO.println("2. SEK to EUR");
                    IO.println("Your choice: ");

                    converterChoice = input.nextInt();

                    switch (converterChoice) {
                        case 1:
                        case 2:
                            IO.println("Enter amount in SEK: ");
                            double amount = input.nextDouble();
                            double result = convertor.currencyConvertor(converterChoice, amount);

                            String currency = (converterChoice == 1) ? "USD" : "EUR";

                            if (result >= 0) {
                                IO.println("Result: "
                                        + String.format("%.2f", amount)
                                        + " SEK = "
                                        + String.format("%.2f", result)
                                        + " " + currency);
                            }
                            break;

                        default:
                            IO.println("Invalid currency choice!");
                    }
                    break;

                case 2:
                    IO.println("\n--- Fuel Consumption Converter ---");
                    IO.println("1. Litres per 100 km to km per litre");
                    IO.println("2. Km per litre to litres per 100 km");
                    IO.println("Your choice: ");

                    converterChoice = input.nextInt();

                    switch (converterChoice) {
                        case 1:
                            IO.println("Enter fuel consumption in L/100 km: ");
                            double litresPer100km = input.nextDouble();

                            double kmPerLitre = convertor.fuelConsumptionConvertor(converterChoice, litresPer100km);

                            if (kmPerLitre > 0) {
                                IO.println("Result: " + String.format("%.2f", litresPer100km) + " L/100 km = "
                                        + String.format("%.2f", kmPerLitre) + " km/L");
                            } else {
                                IO.println("Value must be greater than zero.");
                            }
                            break;

                        case 2:
                            IO.println("Enter fuel efficiency in km/L: ");
                            double efficiency = input.nextDouble();

                            double consumption = convertor
                                    .fuelConsumptionConvertor(
                                            converterChoice, efficiency);

                            if (consumption > 0) {
                                IO.println("Result: " + String.format("%.2f", efficiency) + " km/L = "
                                        + String.format("%.2f", consumption) + " L/100 km");
                            } else {
                                IO.println("Value must be greater than zero.");
                            }
                            break;

                        default:
                            IO.println("Invalid fuel conversion choice!");
                    }
                    break;

                case 3:
                    IO.println("\n--- Grade Converter ---");
                    IO.println("Enter score (0–100):");

                    double score = input.nextDouble();

                    IO.println(convertor.gradeConvertor(score));

                    break;

                case 4:
                    IO.println("Goodbye!");
                    flag = false;
                    break;

                default:
                    IO.println("Invalid menu choice!");
            }


            if (flag) {
                input.nextLine(); // Consume leftover newline if necessary
                IO.println("Continue? (yes/no): ");
                String text = input.nextLine().trim().toLowerCase();

                if (text.equals("no")) {
                    flag = false;
                    IO.println("Goodbye!");
                } else if (!text.equals("yes")) {
                    IO.println("Invalid input. Please enter yes or no.");
                }
            }



        }
        input.close();
    }

}

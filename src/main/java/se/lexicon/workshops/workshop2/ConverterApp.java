package se.lexicon.workshops.workshop2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        if (!Double.isFinite(fuelValue) || fuelValue <= 0) {
            return -1;
        }

        return switch (option) {
            case 1, 2 -> 100.0 / fuelValue;
            default -> -1;
        };
    }

    String gradeConvertor(double score) {
        if (!Double.isFinite(score) || score < 0 || score > 100) {
            return "Invalid score. Enter a score between 0 and 100.";
        }

        long roundedScore = Math.round(score);

        if (roundedScore >= 90) {
            return "Score: " + roundedScore
                    + " | Grade: A | Label: Excellent";
        } else if (roundedScore >= 80) {
            return "Score: " + roundedScore
                    + " | Grade: B | Label: Good";
        } else if (roundedScore >= 70) {
            return "Score: " + roundedScore
                    + " | Grade: C | Label: Pass";
        } else if (roundedScore >= 60) {
            return "Score: " + roundedScore
                    + " | Grade: D | Label: Below average";
        } else {
            return "Score: " + roundedScore
                    + " | Grade: F | Label: Fail";
        }
    }
}

public class ConverterApp {

    void main() {
        Scanner input = new Scanner(System.in);
        ConversionMenu convertor = new ConversionMenu();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        boolean flag = true;

        StringBuilder history = new StringBuilder();
        int conversionCount = 0;

        while (flag) {
            IO.println("==================================");
            IO.println("LEXICON CONVERTER APP");
            IO.println("==================================");
            IO.println("1. Currency Converter");
            IO.println("2. Fuel Consumption Converter");
            IO.println("3. Grade Converter");
            IO.println("4. Exit");
            IO.println("==================================");

            int choice;

            while (true) {
                IO.println("Choose an option: ");

                if (input.hasNextInt()) {
                    choice = input.nextInt();

                    if (choice >= 1 && choice <= 4) {
                        break;
                    } else {
                        IO.println("Please enter a number between 1 and 4");
                    }
                } else {
                    IO.println("Please enter numeric values only");
                    input.next();
                }
            }

            int converterChoice;

            switch (choice) {
                case 1:
                    IO.println("\n--- Currency Converter ---");
                    IO.println("1. SEK to USD");
                    IO.println("2. SEK to EUR");

                    while (true) {
                        IO.println("Your choice: ");

                        if (input.hasNextInt()) {
                            converterChoice = input.nextInt();

                            if (converterChoice == 1
                                    || converterChoice == 2) {
                                break;
                            } else {
                                IO.println(
                                        "Invalid currency choice! Enter 1 or 2.");
                            }
                        } else {
                            IO.println("Please enter numeric values only");
                            input.next();
                        }
                    }

                    double amount;

                    while (true) {
                        IO.println("Enter amount in SEK: ");

                        if (input.hasNextDouble()) {
                            amount = input.nextDouble();

                            if (Double.isFinite(amount) && amount >= 0) {
                                break;
                            } else {
                                IO.println(
                                        "Please enter a non-negative amount.");
                            }
                        } else {
                            IO.println("Please enter numeric values only");
                            input.next();
                        }
                    }

                    double result = convertor.currencyConvertor(
                            converterChoice, amount);

                    String currency =
                            (converterChoice == 1) ? "USD" : "EUR";

                    IO.println("Result: "
                            + String.format("%.2f", amount)
                            + " SEK = "
                            + String.format("%.2f", result)
                            + " " + currency);

                    IO.println("Converted at: "
                            + LocalDateTime.now().format(formatter));

                    history.append("\n")
                            .append(conversionCount + 1)
                            .append(". ")
                            .append(String.format("%.2f", amount))
                            .append(" SEK = ")
                            .append(String.format("%.2f", result))
                            .append(" ")
                            .append(currency);

                    conversionCount++;
                    break;

                case 2:
                    IO.println("\n--- Fuel Consumption Converter ---");
                    IO.println("1. Litres per 100 km to km per litre");
                    IO.println("2. Km per litre to litres per 100 km");

                    while (true) {
                        IO.println("Your choice: ");

                        if (input.hasNextInt()) {
                            converterChoice = input.nextInt();

                            if (converterChoice == 1
                                    || converterChoice == 2) {
                                break;
                            } else {
                                IO.println(
                                        "Invalid fuel conversion choice! Enter 1 or 2.");
                            }
                        } else {
                            IO.println("Please enter numeric values only");
                            input.next();
                        }
                    }

                    if (converterChoice == 1) {
                        double litresPer100km;

                        while (true) {
                            IO.println(
                                    "Enter fuel consumption in L/100 km: ");

                            if (input.hasNextDouble()) {
                                litresPer100km = input.nextDouble();

                                if (litresPer100km > 0 && litresPer100km <= 100) {
                                    break;
                                } else {
                                    IO.println(
                                            "Values must be between 1 and 100.");
                                }
                            } else {
                                IO.println(
                                        "Please enter numeric values only");
                                input.next();
                            }
                        }

                        double kmPerLitre =
                                convertor.fuelConsumptionConvertor(
                                        converterChoice, litresPer100km);

                        IO.println("Result: "
                                + String.format("%.2f", litresPer100km)
                                + " L/100 km = "
                                + String.format("%.2f", kmPerLitre)
                                + " km/L");

                        IO.println("Converted at: "
                                + LocalDateTime.now().format(formatter));

                        history.append("\n")
                                .append(conversionCount + 1)
                                .append(". ")
                                .append(String.format("%.2f", litresPer100km))
                                .append(" L/100 km = ")
                                .append(String.format("%.2f", kmPerLitre))
                                .append(" km/L");

                        conversionCount++;

                    } else {
                        double efficiency;

                        while (true) {
                            IO.println("Enter fuel efficiency in km/L: ");

                            if (input.hasNextDouble()) {
                                efficiency = input.nextDouble();

                                if (Double.isFinite(efficiency)
                                        && efficiency > 0) {
                                    break;
                                } else {
                                    IO.println(
                                            "Value must be greater than zero.");
                                }
                            } else {
                                IO.println(
                                        "Please enter numeric values only");
                                input.next();
                            }
                        }

                        double consumption =
                                convertor.fuelConsumptionConvertor(
                                        converterChoice, efficiency);

                        IO.println("Result: "
                                + String.format("%.2f", efficiency)
                                + " km/L = "
                                + String.format("%.2f", consumption)
                                + " L/100 km");


                        IO.println("Converted at: "
                                + LocalDateTime.now().format(formatter));

                        history.append("\n")
                                .append(conversionCount + 1)
                                .append(". ")
                                .append(String.format("%.2f", efficiency))
                                .append(" km/L = ")
                                .append(String.format("%.2f", consumption))
                                .append(" L/100 km");

                        conversionCount++;
                    }

                    break;

                case 3:
                    IO.println("\n--- Grade Converter ---");

                    double score;

                    while (true) {
                        IO.println("Enter score (0-100):");

                        if (input.hasNextDouble()) {
                            score = input.nextDouble();

                            if (Double.isFinite(score)
                                    && score >= 0 && score <= 100) {
                                break;
                            } else {
                                IO.println(
                                        "Please enter a score between 0 and 100.");
                            }
                        } else {
                            IO.println(
                                    "Please enter numeric values only");
                            input.next();
                        }
                    }

                    String gradeResult = convertor.gradeConvertor(score);

                    IO.println(gradeResult);


                    IO.println("Converted at: "
                            + LocalDateTime.now().format(formatter));

                    history.append("\n")
                            .append(conversionCount + 1)
                            .append(". Score: ")
                            .append(String.format("%.2f", score))
                            .append(" = ")
                            .append(gradeResult);

                    conversionCount++;
                    break;

                case 4:
                    IO.println("\n=== Conversion History ===");

                    if (conversionCount > 0) {
                        IO.println(history.toString());
                    } else {
                        IO.println("No conversions to display!");
                    }

                    IO.println("==========================");
                    IO.println("Total conversions: " + conversionCount);
                    IO.println("Goodbye!");

                    flag = false;
                    break;
            }

            if (flag) {
                input.nextLine();

                while (true) {
                    IO.println("Continue? (yes/no): ");
                    String text = input.nextLine()
                            .trim()
                            .toLowerCase();

                    if (text.equals("yes")) {
                        break;

                    } else if (text.equals("no")) {
                        flag = false;

                        IO.println("\n=== Conversion History ===");

                        if (conversionCount > 0) {
                            IO.println(history.toString());
                        } else {
                            IO.println("No conversions to display!");
                        }

                        IO.println("==========================");
                        IO.println(
                                "Total conversions: " + conversionCount);
                        IO.println("Goodbye!");

                        break;

                    } else {
                        IO.println(
                                "Invalid input. Please enter yes or no.");
                    }
                }
            }
        }

        input.close();
    }
}

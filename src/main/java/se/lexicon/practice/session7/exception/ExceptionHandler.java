package se.lexicon.practice.session7.exception;

public class ExceptionHandler {

    public static void handle(Exception e) {

        if (e instanceof IllegalArgumentException) {
            // Unchecked exception: programmer / user input error
            System.err.println("❌ Invalid input: " + e.getMessage());

        } else if (e instanceof InsufficientFundsException) {
            // Checked exception: business rule violation
            System.err.println("❌ Transaction failed: " + e.getMessage());

        } else {
            // Fallback for unexpected exceptions
            System.err.println("❌ Unexpected system error: " + e.getMessage());
            e.printStackTrace();
        }
    }


    public static void handleWithSwitch(Exception e) {

        switch (e) {
            case IllegalArgumentException iae -> System.err.println("❌ Invalid input: " + iae.getMessage());

            case InsufficientFundsException ife -> System.err.println("❌ Transaction failed: " + ife.getMessage());

            default -> {
                System.err.println("❌ Unexpected system error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}

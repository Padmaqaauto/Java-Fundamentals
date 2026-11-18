package se.lexicon.exercise.exercise7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2RangeInput {
    public int readInRange(Scanner scanner) {
        while (true) {
            try {
                IO.println("Enter an integer from 1 to 100: ");
                int value = scanner.nextInt();
                validateRange(value);
                return value;
            } catch (InputMismatchException e) {
                IO.println("Invalid input: enter an integer.");
                scanner.next();
            } catch (OutOfRangeException e) {
                IO.println(e.getMessage());
            }
        }
    }

    private static void validateRange(int value) throws OutOfRangeException {
        if (value < 1 || value > 100) {
            throw new OutOfRangeException("Value must be between 1 and 100.");
        }
    }

    void main() {
        try (Scanner scanner = new Scanner(System.in)) {
            IO.println("Accepted value: " + readInRange(scanner));
        }
    }
}

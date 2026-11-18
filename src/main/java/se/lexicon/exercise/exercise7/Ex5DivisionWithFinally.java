package se.lexicon.exercise.exercise7;

public class Ex5DivisionWithFinally {
    void main() {
        try {
            int dividend = Integer.parseInt(IO.readln("Enter the first integer: "));
            int divisor = Integer.parseInt(IO.readln("Enter the second integer: "));
            IO.println("Result: " + (dividend / divisor));
        } catch (ArithmeticException e) {
            IO.println("Cannot divide by zero.");
        } catch (NumberFormatException e) {
            IO.println("Please enter integers only.");
        } finally {
            IO.println("Division attempt finished.");
        }
    }
}

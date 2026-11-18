package se.lexicon.practice.session7;

public class ArithmeticExpression {
    void main() {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            IO.println("Result: " + result);
        } catch (ArithmeticException e) {

            IO.println("Cannot divide by zero");

            // Gets the exception type (e.g., ArithmeticException)
            IO.println("Exception type: " + e.getClass().getSimpleName());

            // Gets the error message describing what went wrong (e.g., / by zero)
            IO.println("Error message: " + e.getMessage());

            // Prints the stack trace, showing where the exception occurred
            // including the class name, method name, and line number
            IO.println("Stack trace:");
            //e.printStackTrace();
        }
      }

}

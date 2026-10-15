package se.lexicon.practice.session2;

public class MethodOverloading {

    // Add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // overload: Add two numbers
    public static double add(double a, double b) {
        return a + b;
    }

    // Overload: Add multiple integers
    public static int add(int... numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    void main() {

        IO.println("Adding sum of two numbers: " + add(10, 20));
        IO.println("Adding sum of two decimals: " + add(7.5, 25.5));
        IO.println("Adding of multiple numbers: " + add(5,6,7,8));
    }
}

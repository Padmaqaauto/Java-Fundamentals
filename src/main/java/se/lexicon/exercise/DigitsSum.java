package se.lexicon.exercise;

public class DigitsSum {

    static void sumOfDigits(int number) {
        int n = number;
        int digits;
        int sum = 0;

        while (number != 0) {
            digits = number % 10;
            sum = sum + digits;
            number = number / 10;
        }
        IO.println("sumofDigits( "+n +") -> " + sum);
    }

    void main() {
        sumOfDigits(1234);
        sumOfDigits(9);
        sumOfDigits(305);

    }
}

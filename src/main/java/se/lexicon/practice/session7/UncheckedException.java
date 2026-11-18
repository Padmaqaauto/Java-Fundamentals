package se.lexicon.practice.session7;

public class UncheckedException {
    void main(){

        // NullPointerException
        String name = null;
        IO.println(name.length());

        // ArithmeticException
        int result = 10 / 0;

        // ArrayIndexOutOfBoundsException
        int[] numbers = {1,2,3};
        IO.println(numbers[5]);
    }
}

package se.lexicon.exercise;
import java.util.Scanner;

public class NumberReverse {
    void main(){
        Scanner input = new Scanner(System.in);
        IO.println("Enter a number: ");
        int number = input.nextInt();
        int digits;
        int product = 0;

        while(number != 0) {
            digits  = number % 10;
            product = product * 10 + digits ;
            number = number / 10;
        }
        IO.println(product);
        input.close();
    }
}

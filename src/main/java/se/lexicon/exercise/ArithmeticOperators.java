package se.lexicon.exercise;
import java.util.Scanner;

public class ArithmeticOperators {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Please enter the first number: ");
        int num1 = sc.nextInt();
        IO.println("Please enter the second number: ");
        int num2 = sc.nextInt();
        IO.println(num1 + " + " + num2 + " = " + (num1 + num2));
        IO.println(num1 + " - " + num2 + " = " + (num1 - num2));
        IO.println(num1 + " * " + num2 + " = " + (num1 * num2));
        IO.println(num1 + " / " + num2 + " = " +  ((double) num1 / num2));
    }
}

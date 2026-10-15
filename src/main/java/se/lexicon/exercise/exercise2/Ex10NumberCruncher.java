package se.lexicon.exercise.exercise2;

import java.util.Scanner;

public class Ex10NumberCruncher {

    static void findMax(int a, int b, int c) {
        int max ;
        max = Math.max(a, b);
        max = Math.max(max, c);
        IO.println("Maximum: " + max);
    }

    static void findMin(int a, int b, int c) {
        int min ;
        min = Math.min(a, b);
        min = Math.min(min, c);
        IO.println("Minimum: " + min);
    }

    static void average(int a, int b, int c) {
        double average = (double) (a + b + c) /3;
        IO.println("Average: " + String.format("%.2f", average));

    }

    void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("Enter first number: ");
        int num1 =  sc.nextInt();

        IO.println("Enter second number: ");
        int num2 =  sc.nextInt();

        IO.println("Enter third number: ");
        int num3 =  sc.nextInt();

        findMax(num1,num2,num3);
        findMin(num1,num2,num3);
        average(num1,num2,num3);

        sc.close();

    }
}

package se.lexicon.exercise.exercise2;

import java.util.Scanner;

public class Ex9RightTriangle {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Enter side a: ");
        double a = sc.nextInt();

        IO.println("Enter side b: ");
        double b = sc.nextInt();

        IO.println("Enter side c: ");
        double c = sc.nextInt();

        double rhs = Math.pow(a,2) +  Math.pow(b,2);
        double lhs = Math.pow(c,2);

        IO.println("Longest Side : " + c);
        if(rhs == lhs) {
            IO.println("This is a Right Triangle");
        } else {
            IO.println("This is not a Right Triangle");
        }
        sc.close();
    }
}

package se.lexicon.exercise.exercise2;

import java.util.Scanner;

public class CircleCalculator {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;

        IO.println("The area of the circle is: " + String.format("%.2f", area));
        IO.println("The perimeter of the circle is: " + String.format("%.2f", perimeter));

        sc.close();
    }
}

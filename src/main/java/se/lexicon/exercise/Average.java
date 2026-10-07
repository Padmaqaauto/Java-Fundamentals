package se.lexicon.exercise;
import java.util.Scanner;

public class Average {
    void main(){
        Scanner scanner=new Scanner(System.in);
        int num1, num2, num3;
        IO.println("Enter the first number: ");
        num1=scanner.nextInt();
        IO.println("Enter the second number: ");
        num2=scanner.nextInt();
        IO.println("Enter the third number: ");
        num3=scanner.nextInt();

        float Average;
        Average = (float) (num1 + num2 + num3) / 3.0f;
        IO.println("Average: " + Average);
        scanner.close();
   }
}

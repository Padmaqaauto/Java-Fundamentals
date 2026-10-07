package se.lexicon.exercise;
import java.util.Scanner;

public class GradeCalculator {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Enter score:");
        int score = sc.nextInt();

        if (score >= 90) {
            IO.println("Grade : A");
        } else if (score >= 80) {
            IO.println("Grade : B");
        } else if (score >= 70) {
            IO.println("Grade : C");
        } else if (score >= 60) {
            IO.println("Grade : D");
        }  else if (score >= 0) {
            IO.println("Grade : E");
        } else {
            IO.println("Invalid Score");
        }
        sc.close();
    }
}

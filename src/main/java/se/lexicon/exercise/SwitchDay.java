package se.lexicon.exercise;
import java.util.Scanner;

public class SwitchDay {
    void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter a day:");
        String day = sc.nextLine();

        switch(day){
        case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> IO.println("It is a Weekday");
        case "Saturday", "Sunday" -> IO.println("It is a Weekend");
        default ->  IO.println("Unknown day");
        }
        sc.close();
    }
}

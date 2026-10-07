package se.lexicon.exercise;
import java.util.Scanner;

public class LeapYear {
    void main(){
        Scanner scanner=new Scanner(System.in);
        IO.println("Enter a Year: ");
        int year=scanner.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                IO.println(year + " is a leap year ");
        } else {
            IO.println(year + " is not a leap year ");
        }
    }
}

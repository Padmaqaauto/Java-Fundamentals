package se.lexicon.exercise;
import java.util.Scanner;

public class TimeConverter {
    void main(){
        Scanner sc=new Scanner(System.in);
        IO.println("Enter Seconds: ");
        int seconds =sc.nextInt();

        int hour = seconds / 3600;
        int minute = (seconds % 3600) / 60;
        int second = seconds % 60;

        IO.println(hour + " : " + minute + " : " + second);
    }
}

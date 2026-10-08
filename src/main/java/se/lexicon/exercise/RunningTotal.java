package se.lexicon.exercise;
import java.util.Scanner;

public class RunningTotal {
    void main(){
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        int count = 0;
        int total = 0;
        float average;


        while(flag){
            IO.println("Enter a number (0 to stop)");
            int number = input.nextInt();
            if (number != 0){
                count++;
                total = total + number;
                IO.println("Total: " + total + " | " + " Count: " + count);
            } else {
                flag = false;
                average = (float)total / count;
                IO.println("--- Summary ---");
                IO.println("Count: " + count);
                IO.println("Total: " + total);
                IO.println("Average: " + average);
            }
        }
        input.close();
    }
}

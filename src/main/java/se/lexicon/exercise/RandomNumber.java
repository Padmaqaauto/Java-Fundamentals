package se.lexicon.exercise;
import java.util.Scanner;
import java.util.Random;


public class RandomNumber {
    void main(){

        Random rand=new Random();
        Scanner sc=new Scanner(System.in);

        int secretNumber = rand.nextInt(500) + 1;
        int guess;
        int guessCount=0;

        while (true){
            IO.println("Enter your guess: ");
            guess=sc.nextInt();
            guessCount++;

            if(guess < secretNumber){
                IO.println("Too small!");
            } else if(guess > secretNumber){
                IO.println("Too big!");
            } else {
                IO.println("Correct! You got it in " + guessCount +"guesses.\n");
                break;
            }
        }
        sc.close();
    }
}

package se.lexicon.exercise.exercise2;


import java.util.Scanner;

public class WordReverse {
    void main(){
        Scanner input = new Scanner(System.in);

        IO.println("Enter a word: ");
        String text = input.nextLine();

        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        IO.println("Reversed: " + sb.toString());
    }
}

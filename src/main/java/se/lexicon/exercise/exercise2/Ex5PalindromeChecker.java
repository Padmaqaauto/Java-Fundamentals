package se.lexicon.exercise.exercise2;

import java.util.Scanner;

public class Ex5PalindromeChecker {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Enter a word: ");
        String word = sc.nextLine().toLowerCase();
        int length = word.length();

        StringBuilder sb = new StringBuilder(word);
        sb.reverse();

        if(word.contentEquals(sb)){
            IO.println(word +  " is a palindrome");
        } else {
            IO.println(word +  " is not a palindrome");
        }
        sc.close();
    }
}

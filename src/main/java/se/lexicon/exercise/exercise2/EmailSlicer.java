package se.lexicon.exercise.exercise2;

import java.util.Scanner;

public class EmailSlicer {
    void main(){
        Scanner input = new Scanner(System.in);

        IO.println("Enter email:");
        String email = input.nextLine();

        StringBuilder sb = new StringBuilder(email);
        String userName = sb.toString().split("@")[0];
        String domain = sb.toString().split("@")[1];
        IO.println("Username: " + userName);
        IO.println("Domain: " + domain);
    }
}

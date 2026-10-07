package se.lexicon.exercise;
import java.util.Scanner;

public class GreetUser {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Enter First Name:");
        String firstName = sc.nextLine();
        IO.println("Enter Last Name:");
        String lastName = sc.nextLine();
        String fullName = firstName.concat(" ").concat(lastName);
        IO.println("Hello,"+fullName+ "! Welcome abroad.");
        sc.close();
    }
}

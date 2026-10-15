package se.lexicon.exercise.exercise2;

import java.util.Scanner;

public class Ex12PasswordGenerator {
    void main(){
        Scanner input = new Scanner(System.in);

        IO.println("Enter Password length:");
        int length = input.nextInt();
        String characters =
                "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            password.append(characters.charAt(index));
        }

        System.out.println("Generated password: " + password);

        input.close();
    }
}

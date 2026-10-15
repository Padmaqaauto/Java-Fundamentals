package se.lexicon.exercise.exercise2;

import java.util.Scanner;

public class Ex4InitialGenerator {
    void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("Enter full name:");
        String name = sc.nextLine().trim();

        String initials = "";

        for (int i = 0; i < name.length(); i++) {
            if (!Character.isWhitespace(name.charAt(i))
                    && (i == 0 || Character.isWhitespace(name.charAt(i - 1)))) {

                initials = initials.concat(
                        String.valueOf(Character.toUpperCase(name.charAt(i)))
                ).concat(".");
            }
        }

        IO.println("Initials: " + initials);
        sc.close();
    }
}
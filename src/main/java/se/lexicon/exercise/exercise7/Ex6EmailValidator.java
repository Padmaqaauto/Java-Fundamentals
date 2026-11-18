package se.lexicon.exercise.exercise7;

import java.util.regex.Pattern;

public class Ex6EmailValidator {
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    public static void validateEmail(String email) {
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new IllegalArgumentException("Invalid email address.");
        }
    }

    void main() {
        String email = IO.readln("Enter an email address: ");
        try {
            validateEmail(email);
            IO.println("Valid email address.");
        } catch (IllegalArgumentException e) {
            IO.println(e.getMessage());
        }
    }
}

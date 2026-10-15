package se.lexicon.practice.session2;

public class FinalClassDemo {

    void main() {
        final int maxAttempts = 3;
        // maxAttempts = 0; // Error: Cannot Assign value to Final Variable
        IO.println("maxAttempts: "+ maxAttempts);
    }

}

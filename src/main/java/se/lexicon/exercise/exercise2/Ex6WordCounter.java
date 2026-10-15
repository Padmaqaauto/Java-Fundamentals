package se.lexicon.exercise.exercise2;

import java.util.Scanner;

public class Ex6WordCounter {
    void main(){
        Scanner input = new Scanner(System.in);

        IO.println("Enter a sentence:");
        String sentence = input.nextLine();

        IO.println("Enter word to find:");
        String word = input.nextLine();

        int count = 0;
        int wordCount = 0;
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i <= sentence.length(); i++) {
            if (i == sentence.length()
                    || Character.isWhitespace(sentence.charAt(i))) {

                if (!currentWord.isEmpty()) {
                    count++;

                    if (currentWord.toString().equalsIgnoreCase(word)) {
                        wordCount++;
                    }

                    currentWord = new StringBuilder();
                }
            } else {
                currentWord.append(sentence.charAt(i));
            }
        }

        IO.println("Total words: " + count);
        IO.println("\""+word + "\" appears: " + wordCount + " times");
        input.close();
    }
}

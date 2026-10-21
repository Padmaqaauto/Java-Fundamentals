package se.lexicon.exercise.exercise3;

import java.util.ArrayList;
import java.util.Collections;

public class WordFrequency {

    public ArrayList<String> getWordList(){
        ArrayList<String> wordList =  new ArrayList<>();

        wordList.add("apple");
        wordList.add("banana");
        wordList.add("apple");
        wordList.add("orange");
        wordList.add("banana");
        wordList.add("apple");
        wordList.add("grape");
        wordList.add("orange");

        return wordList;
    }

    public void displayWordList(ArrayList<String> wordList){
        for(String word : wordList){
            IO.print(word + " \t ");
        }
    }

    public void countWordFrequency(ArrayList<String> wordList){
        Collections.sort(wordList);

        IO.println("\n");
        for (int i = 0; i < wordList.size(); i++) {

            int count = 1;

            if (i > 0 && wordList.get(i).equals(wordList.get(i - 1))) {
                continue;
            }

            for (int j = i + 1; j < wordList.size(); j++) {
                if (wordList.get(i).equals(wordList.get(j))) {
                    count++;
                }
            }

            IO.println(wordList.get(i) + " : " + count);
        }
    }

    void main(){
        WordFrequency counter = new WordFrequency();
        ArrayList<String> words = counter.getWordList();

        IO.println("\nList of Words:");
        displayWordList(words);

        counter.countWordFrequency(words);

    }
}

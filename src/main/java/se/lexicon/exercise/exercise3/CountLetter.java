package se.lexicon.exercise.exercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class CountLetter {

    public ArrayList<String> getNamesList(){
        ArrayList<String> names = new ArrayList<>();

        names.add("Anna");
        names.add("Bob");
        names.add("Alice");
        names.add("Charlie");
        names.add("Amanda");
        names.add("David");
        names.add("Amy");
        names.add("Brian");

        return names;
    }

    public void displayNames(ArrayList<String> names){
        for(String name : names){
            IO.print(name + " \t ");
        }
    }

    public int countNames(ArrayList<String> names, char letter){
        if (names == null) {
            throw new IllegalArgumentException("Names list cannot be null");
        }

        int count = 0;
        char searchLetter = Character.toLowerCase(letter);

        for (String name : names) {
            if (name != null && !name.isEmpty()
                    && Character.toLowerCase(name.charAt(0)) == searchLetter) {
                IO.println(name + " \t ");
                count++;
            }
        }
        return count;
    }

    void main(){
        CountLetter counter = new CountLetter();
        ArrayList<String> nameList = counter.getNamesList();

        IO.println("Name List: ");
        displayNames(nameList);

        Scanner scan = new Scanner(System.in);
        IO.println("\nEnter a letter to lookup: ");
        String letter = scan.nextLine().trim().toLowerCase();

        if(letter.length() != 1 || !Character.isLetter(letter.charAt(0))){
            IO.println("Please enter a single valid letter");
        } else {
            int result = counter.countNames(nameList, letter.charAt(0));
            IO.println("Number of names starting with " + letter + " is " + result);
        }
    }
}

package se.lexicon.practice.session3;

import java.util.*;

public class ObjectCollectionsDemo {
    void main(){
        IO.println("--- Collections Utility Examples ---");
        collectionsExamples();

        IO.println("\n--- Objects Utility Examples ---");
        objectExamples();
    }

    public static void collectionsExamples(){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10,20,30,40,50));

        //1.Reversing
        Collections.reverse(numbers);
        IO.println("Reversed: " + numbers);

        //2.Shuffling
        Collections.shuffle(numbers);
        IO.println("Shuffled: " + numbers);

        //3.Finding Min and Max
        IO.println("Min:  " + Collections.min(numbers));
        IO.println("Max:  " + Collections.max(numbers));

        //4.Sorting
        Collections.sort(numbers);
        IO.println("Sorted: " + numbers);

        //5.Binary Search
        int index =  Collections.binarySearch(numbers, 30);
        IO.println("Index of 30:  " + index);

    }

    public static void objectExamples(){

        String name1 = "Erik";
        String name2 = "Null";

        //1. Null safe equality check
        IO.println("Equals(Erik, Null): "+ Objects.equals(name1, name2));

        //2. Null to safe string
        IO.println("ToString: "+ Objects.toString(name2, "Default Name"));

        //3. Check for Null
        IO.println("IsNull: " + Objects.isNull(name2));

        //4. Require Non-Null throws exception
        try {
            Objects.requireNonNull(name2, "Name cannot be null");
        } catch (NullPointerException e) {
            IO.println("Exception: " + e.getMessage());
        }

        IO.println(name2);
    }
}

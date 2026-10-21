package se.lexicon.exercise.exercise3;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateNum {

    public ArrayList<Integer> getNumList() {
        ArrayList<Integer> numList = new ArrayList<>();

        numList.add(4);
        numList.add(7);
        numList.add(2);
        numList.add(7);
        numList.add(9);
        numList.add(4);
        numList.add(1);
        numList.add(9);
        numList.add(3);

        return numList;
    }

    public ArrayList<Integer> removeDuplicates(ArrayList<Integer> numList) {

        if (numList == null || numList.size() == 0) {
            throw new IllegalArgumentException(
                    "List is null or empty"
            );
        }

        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(Integer num : numList) {
            if(set.add(num)){
                result.add(num);
            }
        }

        return result;
    }

    void main(){

        RemoveDuplicateNum remover = new RemoveDuplicateNum();
        ArrayList<Integer> numbers = remover.getNumList();

        ArrayList<Integer> result = remover.removeDuplicates(numbers);

        IO.println("\nOriginal List: " + numbers);
        IO.println("Remove Duplicates: " + result);
    }
}

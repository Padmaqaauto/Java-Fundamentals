package se.lexicon.exercise.exercise3;

import java.util.ArrayList;
import java.util.HashSet;

public class MergeLists {

    public ArrayList<Integer> getListA(){
        ArrayList<Integer> listA = new ArrayList<>();

        listA.add(1);
        listA.add(2);
        listA.add(3);
        listA.add(4);
        listA.add(5);

        return listA;
    }

    public ArrayList<Integer> getListB(){
        ArrayList<Integer> listB = new ArrayList<>();

        listB.add(3);
        listB.add(4);
        listB.add(5);
        listB.add(6);
        listB.add(7);

        return listB;
    }

    public ArrayList<Integer> mergeLists(ArrayList<Integer> listA, ArrayList<Integer> listB){

        if(listA == null || listB == null){
            throw new IllegalArgumentException(
                    "Lists cannot be null."
            );
        }

        HashSet<Integer> numbers = new HashSet<>();

        numbers.addAll(listA);
        numbers.addAll(listB);

        return new ArrayList<>(numbers);
    }

    void main(){
        MergeLists merger = new MergeLists();
        ArrayList<Integer> listA = merger.getListA();
        ArrayList<Integer> listB = merger.getListB();

        ArrayList<Integer> result = merger.mergeLists(listA, listB);

        IO.println("\nMerge Lists: " + result);
        IO.println("Size of merged lists: " + result.size());
    }
}

package se.lexicon.exercise.exercise3;

import java.util.ArrayList;

public class LargestNumber {

    public ArrayList<Integer> getNumberList(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(14);
        list.add(3);
        list.add(78);
        list.add(45);
        list.add(22);
        list.add(91);
        list.add(7);
        list.add(56);

       return list;
    }

    public void printList(ArrayList<Integer> list){
        for(int num : list){
            IO.print(num + "\t");
        }
    }

    public int findLargestNum(ArrayList<Integer> numbers){

        if(numbers.isEmpty() || numbers ==  null){
            throw new IllegalArgumentException(
                    "Number list cannot be null or empty."
            );
        }

        int largest = numbers.get(0);

        for(int num : numbers){
            if(num > largest){
                largest = num;
            }
        }

        return largest;
    }


    void main(){
        LargestNumber number = new LargestNumber();
        ArrayList<Integer> numList = number.getNumberList();

        IO.println("Number list: ");
        printList(numList);

        int maxNum = number.findLargestNum(numList);
        IO.println("\nLargest number: " + maxNum);

    }
}

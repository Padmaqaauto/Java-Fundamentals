package se.lexicon.practice.session3;

import java.util.Arrays;

public class ArrayDeclaration {


    void main(){

        // 1. Declaration
        int[] numbers;
        String[] names;

        //2. Initialization
        numbers = new int[3];

        //3. Combined Declaration and Initialization
        String[] stringArray = new String[3];

        //4. Initialize specific values
        int[] numArr = {2,4,6,8,10};

        //5.Accessing and Modifying Elements
        String[] students = {"Uma", "Meera", "Aji"};

        IO.println(students[0]);
        IO.println(students[2]);

        //2D matrix
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int element = matrix[1][2];
        IO.println("Element at [1][2]: " + element);

        matrix[0][0] = 10;

        expandingArray();
        expandingArrayUsingCopyOf();
    }

    public static void expandingArray(){
        int[] originalArray = {2,5,8,1,9};
        int newElement = 40;

        //1. create new array with expanding size + 1
        int[] expandedArray = new int[originalArray.length + 1];

        //2.Copy elements manually using for loop
        for (int i = 0; i < originalArray.length; i++) {
            expandedArray[i] = originalArray[i];
        }

        //3.Add new element to the last position
        expandedArray[expandedArray.length - 1] = newElement;

        IO.println("Original Array: " + Arrays.toString(originalArray));
        IO.println("Expanded: " + Arrays.toString(expandedArray));
    }

    public static void expandingArrayUsingCopyOf(){
        int[] originalArray = {2,5,8,1,9};
        int newElement = 40;

        // Arrays.copyof() creates new array and copies existing elements
        int[] expandedArray = Arrays.copyOf(originalArray, originalArray.length+1);

        // Add new element to the last position
        expandedArray[expandedArray.length - 1] = newElement;
        IO.println("Expanded Array: " + Arrays.toString(expandedArray));
    }

    public static int findMaxNumber(int[] numbers) {


        if(numbers == null || numbers.length == 0){
            throw new IllegalArgumentException("Array is empty");
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        IO.println("Max number: " + max);
        return max;
    }
}


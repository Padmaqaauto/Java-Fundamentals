package se.lexicon.practice.session3;

import java.util.Arrays;

public class ArrayIterationExample {
    void main(){
        int[] numbers = {5,3,2,4,7};
        IO.println("Iteration using index based for loop");
        for(int i=0; i<numbers.length; i++){
            if (i==2){
                numbers[i] = 200;
            }
        }

        IO.println(Arrays.toString(numbers));
        for(int number: numbers ){
            if(number == 5){
                number = 5000;
            }
        }
        IO.println(Arrays.toString(numbers));
    }
}

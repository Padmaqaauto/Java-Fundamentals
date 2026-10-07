package se.lexicon.exercise;

public class FizzBuzz {
    void main(){
        int num;
        for(num = 1; num <= 30; num++){
            if ( num % 3 == 0 && num % 5 == 0){
                IO.println("FizzBuzz");
            } else if( num % 5 == 0 ){
                IO.println("Buzz");
            } else if (num % 3 == 0 ){
                IO.println("Fizz");
            } else {
                IO.println(num);
            }
        }
    }
}

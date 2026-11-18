package se.lexicon.practice.session7;

public class Errors {
    void main(){

      // recursiveMethod();

        //out of memory error
        int[] largeArray = new int[Integer.MAX_VALUE];
    }

    void recursiveMethod() {
        recursiveMethod();
    }
}

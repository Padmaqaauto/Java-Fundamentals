package se.lexicon.exercise;

public class MultiplicationTable {
    void main(){
        int product;
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                product = i * j;
                IO.println(i + " * " + j +" = " + product);
            }
        }

    }
}

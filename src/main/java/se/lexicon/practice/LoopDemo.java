package se.lexicon.practice;

public class LoopDemo {
    void main(){
        // Example 1: For loop (Counting)
        IO.println("---For Loop---");
        for(int i = 0; i < 3; i++){
            IO.println("Iteration: "+i);
        }

        // Example 2: While loop (Conditional)
        IO.println("\n---While Loop---");
        int coffeeCups = 0;
        while (coffeeCups < 3) {
            coffeeCups++;
            IO.println("Drinking cup #"+coffeeCups);
        }

        // Example 3: Break & Continue
        IO.println("\n---Break & Continue---");
        for (int j = 1; j <= 5; j++){
            if (j == 2) continue;
            if (j == 4) break;
            IO.println("Value: "+ j);
        }
    }
}

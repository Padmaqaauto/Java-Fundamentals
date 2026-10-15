package se.lexicon.exercise.exercise2;

import java.util.Scanner;

public class Ex11DiceStats {
    void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("How many rolls? ");
        int rolls = sc.nextInt();

        int diceOne;
        int diceTwo;
        int sum ;
        String result = "";

        for(int i = 1; i <= rolls; i++){
            diceOne = (int) (Math.random() * 6) + 1;
            diceTwo = (int) (Math.random() * 6) + 1;
            sum = diceOne + diceTwo;

            if(diceOne == diceTwo){
                result = "Double";
            }

            IO.println("Roll" + i + ": " + diceOne + " + " + diceTwo + " = " + sum + "\t" + result);
            result = "";

            sc.close();
        }
    }
}

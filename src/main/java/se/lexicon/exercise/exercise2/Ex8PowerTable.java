package se.lexicon.exercise.exercise2;

import java.util.Scanner;

public class Ex8PowerTable {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Enter base number:");
        int base = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            IO.println(String.format("%d ^ %-2d = %9.1f",
                    base, i, Math.pow(base, i)));
        }
        sc.close();
    }
}

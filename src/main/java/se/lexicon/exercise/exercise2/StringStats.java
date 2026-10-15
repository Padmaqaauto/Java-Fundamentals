package se.lexicon.exercise.exercise2;

import java.util.Scanner;

public class StringStats {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Enter a sentence:");
        String sentence = sc.nextLine();
        int length = sentence.length();
        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        int spaceCount = 0;

         for(int i = 0; i < length; i++){
             char c = Character.toLowerCase(sentence.charAt(i));

             if(c == ' '){
                spaceCount++;
          } else if(c >= '0' && c <= '9'){
              digitCount++;
          } else if("aeiou".indexOf(c) >= 0){
              vowelCount++;
          } else {
              consonantCount++;
          }
         }

        IO.println("vowels: " + vowelCount);
        IO.println("consonants: " + consonantCount);
        IO.println("digits: " + digitCount);
        IO.println("spaces: " + spaceCount);

    }
}

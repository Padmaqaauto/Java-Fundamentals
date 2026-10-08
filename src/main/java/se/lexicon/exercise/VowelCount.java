package se.lexicon.exercise;

public class VowelCount {

    static void countVowels(String s){
        String str = s;
        str = str.toLowerCase();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ("aeiou".indexOf(ch) >= 0){
                count++;
            }
        }
        IO.println("countVowels(\""+ s +  "\")  -> " + count);
    }
    void main(){
        countVowels("Hello World");
        countVowels("Java");
        countVowels("rhythm");
    }
}

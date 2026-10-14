package se.lexicon.practice;

public class StringsDemo {
    void main(){
        String greeting = "Hello ";
        greeting.concat(" World");
        IO.println(greeting);

        greeting = greeting.concat( " World");
        IO.println(greeting);



    }
}

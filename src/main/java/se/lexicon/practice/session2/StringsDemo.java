package se.lexicon.practice.session2;

public class StringsDemo {
    void main(){
        String greeting = "Hello ";
        greeting.concat(" World");
        IO.println(greeting);

        greeting = greeting.concat( " World");
        IO.println(greeting);



    }
}

package se.lexicon.practice.session2;

public class StringBuilderDemo {
    void main(){
        // 1. Creation
        StringBuilder sb = new StringBuilder("Hello");

        // 2. Appending
        sb.append(" World");
        sb.append("!");
        IO.println("After append: " + sb);

        // 3.Inserting
        sb.insert(6, "Java ");
        IO.println("After insert: " + sb);

        // 4.Deleting
        sb.delete(10,16);
        IO.println("After delete: " + sb);

        // 5.Reversing
        sb.reverse();
        IO.println("After reverse: " + sb);

        // 6.Converting back to String
        String FinalResult = sb.toString();
        IO.println("Final Result: " + FinalResult);
    }
}

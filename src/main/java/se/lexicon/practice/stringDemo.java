package se.lexicon.practice;

public class stringDemo {
    void main(){
        String s1 = "Java";
        String s2 = new String("Java");
        IO.println("s1 == s2 ? "+(s1==s2));
        IO.println("s1.equals(s2)? "+(s1.equals(s2)));

        String message = "Welcome to Java Programming!";

        IO.println("\n---String Inspection---");
        IO.println("Original message: "+ message);
        IO.println("Length: "+ message.length());
        IO.println("Contains Java: "+ message.contains("Java"));

        IO.println("\n---String Manipulation---");
        IO.println("Uppercase : "+message.toUpperCase());
        IO.println("Lowercase : "+message.toLowerCase());
        IO.println("Trimmed: [" + message.trim() + "]");
        IO.println("Replace Java with Lexicon: " + message.replace("Java", "Lexicon"));

        IO.println("\n---String Comparision---");
        String name1 = "Padma";
        String name2 = "padma";
        IO.println("Padma equals padma? " + name1.equals(name2));
        IO.println("Padma equalsIgnoreCase padma? "+ name1.equalsIgnoreCase(name2));

        IO.println("\n---Escape Characters---");
        IO.println("Hello\nWorld");
        IO.println("Tap\tSpace");
        IO.println("Quotes: \"Hello\"");
        IO.println("Backslash: \\");

    }
}

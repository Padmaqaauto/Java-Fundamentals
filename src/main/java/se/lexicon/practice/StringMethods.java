package se.lexicon.practice;

public class StringMethods {
    void main(){
        String message = "Java Programming is Fun!";

        //1. indexof() Examples
        IO.println("-- indexof() --");
        int firstP = message.indexOf('P');
        int firstGram = message.indexOf("gram");
        int secondA = message.indexOf('a',2);
        int missing = message.indexOf("Python");

        IO.println("First P: " + firstP);
        IO.println("First 'Gram': " + firstGram);
        IO.println("Second 'a': " + secondA);
        IO.println("Missing: " + missing);


        //2. Substring Examples

        IO.println("\n-- Substring() --");
        String language = message.substring(0,4);
        String topic = message.substring(5,16);
        String remainder = message.substring(17);

        IO.println("Language : " + language);
        IO.println("Topic : " + topic);
        IO.println("Remainder : " + remainder);

        // 3. Traditional Multi line string
        String oldWay = "This is the old way.\n" +
                        "It requires Concatenation \n" +
                        "and manual new line characters.";

        // 4. Modern Text Block
        String newWay = """
                This is a Text Block.
                It preserves the line breaks
                and makes the code looks exactly like the output;
                """;

        IO.println("\n");
        IO.println(oldWay);
        IO.println("---");
        IO.println(newWay);
    }
}

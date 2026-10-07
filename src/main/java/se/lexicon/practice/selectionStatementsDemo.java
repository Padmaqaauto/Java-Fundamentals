package se.lexicon.practice;

public class selectionStatementsDemo {
    void main() {
        //Example 1 -> If-Else
        int temperature = 25;
        IO.println("---Temperature Check ---");
        if (temperature > 30) {
            IO.println("It is hot outside!");
        } else if (temperature >= 15) {
            IO.println("The weather is nice!");
        } else  {
            IO.println("It is cold outside!");
        }

        //another example for if-else
        int points = 150;
        IO.println("\n---Membership level---");
        if(points >= 200){
            IO.println("Status -> Gold Member");
        } else if (points >= 100) {
            IO.println("Status -> Silver Member");
        } else {
            IO.println("Status -> Broze Member");
        }

        //Example 2 -> Switch
        String lightColor = "Green";
        IO.println("\n---Switch Statement---");
        switch (lightColor) {
            case "Red" -> IO.println("Stop!");
            case "Yellow" -> IO.println("Prepare to stop!");
            case "Green" -> IO.println("Go!");
            default -> IO.println("Invalid light color");
        }

        // another example for switch
        String day = "Saturday";
        IO.println("\n---Day Type ---");
        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> IO.println("It is a Weekday");
            case "Saturday","Sunday" -> IO.println("It is a Weekend");
            default -> IO.println("Invalid day");
        }
    }
}

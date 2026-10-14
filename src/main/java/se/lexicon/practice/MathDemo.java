package se.lexicon.practice;

public class MathDemo {
    void main(){

        //1. Absolute Value
        IO.println("Absolute Value of -42: " + Math.abs(-42));

        // 2. Max and Min
        IO.println("\nMaximum value between 100 and 250: "+ Math.max(100, 250));
        IO.println("Minimum value between 100 and 250: "+ Math.min(100, 250));

        // 3. Power and Square Root
        IO.println("\n2 to the power of 8 is : " + Math.pow(2, 8));
        IO.println("Square root of 256 is: "+ Math.sqrt(256));

        // 4. Rounding
        IO.println("\nRounding of 4.4: "+ Math.round(4.4));
        IO.println("Rounding of 4.5: "+ Math.round(4.5));
        IO.println("Rounding of 4.9: "+ Math.floor(4.6));
        IO.println("Rounding of 4.1: "+ Math.ceil(4.9));

        // 5.Random number between  1 and 100
        int random = (int) (Math.random()*100) + 1;
        IO.println("\nRandom (1-100): " + random);

        // 6. Circle area using Math.PI
        double radius = 5.0;
        double area = Math.PI * Math.pow(radius, 2);
        IO.println("\nArea is: " + area);
    }
}

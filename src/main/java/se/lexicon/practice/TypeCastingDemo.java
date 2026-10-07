package se.lexicon.practice;

public class TypeCastingDemo {
    void main(){
        // 1.Widening Casting (Automatic)
        // Converting a smaller type to a larger type size:
        // byte -> short -> char -> int -> long -> float -> double
        int myInt = 9;
        double myDouble = myInt;

        IO.println("-- Widening Casting --");
        IO.println("Int Value : "+ myInt);
        IO.println("Double : "+ myDouble);

        // 2. Narrowing Casting (Manual)
        // Converting a larger type to a samller size type
        // double -> float -> int -> char -> short -> byte
        double d = 9.78;
        int i = (int)d;

        IO.println("\n -- Narrowing Casting --");
        IO.println("Double value: "+ d);
        IO.println("Int value: "+ i);

        //3. Potential for Data loss (Overflow)
        int largeInt = 130;
        byte smallByte = (byte)largeInt;

        IO.println("\n --Data Loss (Overflow)");
        IO.println("Large Int: "+ largeInt);
        IO.println("Small Byte: "+ smallByte);
    }
}

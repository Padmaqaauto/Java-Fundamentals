package se.lexicon.practice;

public class OperatorDemo {
    void main() {
        //Arithmetic Operators
        int a = 10;
        int b = 3;
        IO.println("---Arithmetic Operators---");
        IO.println("a+b = " + (a+b));
        IO.println("a-b = " + (a-b));
        IO.println("a*b = " + (a*b));
        IO.println("a/b = " + (a/b));
        IO.println("a%b = " + (a%b));

        //Assignment Operators
        int x=10;
        IO.println("\n---Assignment Operators---");
        IO.println("Start x = " +x);
        x += 5;
        x -= 2;
        x *= 2;
        x /= 2;
        IO.println("Final x = " + x);

        //Comparision Operators
        int p = 10;
        int q = 5;
        IO.println("\n---Comparision Operators---");
        IO.println("p == q -> " + (p == q));
        IO.println("P != q -> " + (p != q));
        IO.println("p > q  -> " + (p > q));
        IO.println("p <= q -> " + (p < q));

        //logical Operators
        int n = 10;
        boolean andResult = (n > 5 && n < 20);
        boolean orResult = (n < 5 || n == 10);
        boolean notResult = !(n == 10);
        IO.println("\n---Logical Operators---");
        IO.println("n > 5 && n < 20 -> "+ andResult);
        IO.println("n < 5 || n == 10 -> "+ orResult);
        IO.println("!(n == 10) -> "+ notResult);
    }
}

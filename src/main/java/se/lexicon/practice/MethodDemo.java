package se.lexicon.practice;

public class MethodDemo {

    // 1. Method with no return (void) and no parameters
    public static void sayHello(){
        IO.println("Hello from Padma!");
    }

    // 2. Method with parameters
    public static void printSum(int a, int b){
        IO.println("Sum is: "+(a+b));
    }

    // 3. Method with a Return Type
    public static int multiply(int x, int y){
        return x*y;
    }

    void main() {
        // Calling static methods directly using the Class name
            MethodDemo.sayHello();

        // Calling a static method with arguments
            MethodDemo.printSum(5,10);

        // Calling a static method and storing the return value
            int result = MethodDemo.multiply(4,3);
        IO.println("Multiplication Result is: "+result);
    }
}

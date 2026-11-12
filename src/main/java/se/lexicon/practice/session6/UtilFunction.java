package se.lexicon.practice.session6;

import java.util.Random;
import java.util.function.*;

public class UtilFunction {

    void main(){
        Function<String, Integer> stringToLength = s -> s.length();
        Function<Todo, String> todoToString = todo -> todo.getTitle();
        Function<Double, Double> FahrenheitToCelsius = fahrenheit  -> (fahrenheit - 32) * 5/9;

        IO.println("\nLength of 'Java': " + stringToLength.apply("Java"));
        IO.println("Fahrenheit to Celsius: " + FahrenheitToCelsius.apply(100.0));
        IO.println("Get Title from ToDo: " + todoToString.apply(new Todo("Test",2,true)));

        Predicate<Integer> isEven = i -> i % 2 == 0;
        IO.println("\nIs 10 Even?: " + isEven.test(10));

        Consumer<String> printUpperCase = s -> IO.println(s.toUpperCase());
        Consumer<String> printLowerCase = s -> IO.println(s.toLowerCase());

        IO.println();
        printUpperCase.accept("Java");
        printLowerCase.accept("Test");

        Supplier<Integer> randomNumber = () -> new Random().nextInt(100);
        IO.println("\nRandom Number: " + randomNumber.get());

        UnaryOperator<Integer> square = num -> num * num;
        IO.println("Square of 5: " + square.apply(5));

        UnaryOperator<String> reverse = s ->  new StringBuilder(s).reverse().toString();
        IO.println("Reverse of 'Hello' " + reverse.apply("Hello"));
    }
}

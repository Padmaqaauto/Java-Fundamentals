package se.lexicon.exercise;
import java.util.Scanner;

public class TemperatureConverter {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Enter temperature in Celsius: ");
        int temperature = sc.nextInt();
        IO.println("Celsius : " + (double)temperature + " °C " );
        double fahrenheit = (temperature * 1.8) + 32;
        double kelvin = temperature + 273.15;
        IO.println("Fahrenheit : " + fahrenheit +" °F ");
        IO.println("kelvin : " + kelvin + " K ");
        sc.close();
    }
}

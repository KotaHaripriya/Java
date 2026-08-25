// Write a Java program to enter temperature in °Celsius and convert it into °Fahrenheit. 

import java.util.Scanner;

public class conversionCtoF{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a temperature: ");
        double input = sc.nextDouble();
        double res = (input * (9.0/ 5)) + 32;
        System.out.println(input + " C in Fahrenheit : " + res + " F ");

        sc.close();

    }
}
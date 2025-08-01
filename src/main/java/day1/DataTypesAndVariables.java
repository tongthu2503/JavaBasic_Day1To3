package day1;

import java.util.Scanner;

public class DataTypesAndVariables {
    public static void main(String[] args) {
       // printHelloWorld();
       // printString();
        String helloWrold = "Hello World";
        String specialCharacter = "++++++\n" + //
                        "\n" + //
                        "@@@@@@\n" + //
                        "\n" + //
                        "******\n" + //
                        "\n" + //
                        "######\n" + //
                        "";
                        
        //printAnyString(helloWrold);
        //printAnyString(specialCharacter);
        //printVariable();
        //printBoolean();
        //FahrenheitToCelsius();
        InchesToMeters();

    }

    /*
     * Ex1
     */
    static void printHelloWorld(){
        System.out.println("Hello World");
    }

    /*
     * Ex2
     */
    static void printString(){
        System.out.println("++++++\n" + //
                        "\n" + //
                        "@@@@@@\n" + //
                        "\n" + //
                        "******\n" + //
                        "\n" + //
                        "######\n" + //
                        "");
    }

    static void printAnyString(String s){
        System.out.println(s);
    }

    /*
     * Ex3
     */
    static void printVariable(){
        int a = 10;
        double b = 10.3;
        double c = 3.14785;
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Value of c: " + c);
    }

    /*
     * Ex4
     */
    static void printBoolean(){
        boolean flag = true;
        flag = false;           // Change value to false
        System.out.println("The value of flag is: " + flag);
    
    }

    /*
     * Ex6
     */
    static void FahrenheitToCelsius(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit-32)/1.8000;
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");


    }
     
    /*
     * Ex7
     */
    static void InchesToMeters(){
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Input a value for inch: ");
        double inches = scanner.nextDouble();

        // Conversion factor from inches to meters
        double meters = inches * 0.0254;

        // Display the result
        System.out.println(inches + " *inch is " + meters + " meters");
    
    }
}   

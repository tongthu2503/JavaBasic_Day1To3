package day2;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args){

        int x = 22;
        String sup = (x < 15) ? "small" : (x < 22)? "tiny" : "huge";
        System.out.println(sup);

        //SpeedCalculator();
        //twoInteger();
        individualDigits();
    }

    static void SpeedCalculator(){
        Scanner scanner = new Scanner(System.in);
        
        //Read distance
        System.out.println("Enter distance in meters: ");
        double distance = scanner.nextDouble();
        // Read hours
        System.out.println("Enter hours: ");
        int hours = scanner.nextInt();
        //Read minutes
        System.out.println("Enter minutes: ");
        int minutes = scanner.nextInt();
        //Read seconds
        System.out.println("Enter seconds: ");
        int seconds = scanner.nextInt();

        //Caculate total time in Seconds
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;

        // Caculate speed by seconds
        double speed_mps = distance / totalSeconds;

        // Convert speed kilometers per hour 
        double speed_kps =   speed_mps * 3600 / 1000;

        // Convert to miles per hour (1 mile = 1609 meters)
        double speed_mph = (distance / 1609) / (totalSeconds / 3600);

        System.out.println ("Your speed in meters/second is:" + " "+ speed_mps);
        System.out.println ("Your speed in kilometers/hour is:" + " " + speed_kps);
        System.out.println ("Your speed in miles/h is:" + " " + speed_mph);
        
        scanner.close();
    }

    /*
     * Ex3
     */
    static void twoInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a:");
        int a = scanner.nextInt();
        System.out.println("Input b:");
        int b = scanner.nextInt();

        // Sum a + b
        int sum = a + b;
        System.out.println("Sum of two integers:" + " " + sum);

        //Diff a - b
        int diff = a - b;
        System.out.println("Difference of two integers:" + " " + diff);

        // a * b
        int prod = a * b;
        System.out.println("Product of two integers:" + " " + prod);

        // (a + b)/2
        float avg = (float)(a + b)/2;
        System.out.println("Average of two integers:" + " " + avg);

        //Distance a - b
        int dis;
        int dis1 = Math.abs(a-b);
        if (a > b){
            dis = a - b;
        }else dis = b - a;
        System.out.println("Distance of two integers:" + " " + dis);
        System.out.println("Distance of two integers:" + " " + dis1);

        //Max(a,b)
        int max = Math.max(a,b);
        System.out.println("Max of two integers:" + " " + max);

        // Min(a,b))
        int min = Math.min(a,b);
        System.out.println("Min of two integers:" + " " + min);

        // Close the scanner to release system resources
        scanner.close();
    }

    /*
     * Ex4
     */
    static void individualDigits(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int number = scanner.nextInt();
        printDigits(number);
        // Close the scanner to release system resources
        scanner.close();
    }

    public static void printDigits(int num) {
    if(num / 10 > 0) {
        printDigits(num / 10);
    }
    System.out.printf("%d ", num % 10);
}
}
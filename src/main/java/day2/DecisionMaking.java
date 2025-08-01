package day2;

import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        //sumDigits();
        //sumOfDigits();
        convertMinutesTYearDay();
    }

    /*
     * Ex1 option 1
     */
    static void sumDigits(){
        int sumDigits = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number:");
        int n = scanner.nextInt();
        if (n < 10) {
            sumDigits = n;
        }if ((n < 100) && (n >= 10)) {
            sumDigits = (n/10) + (n % 10);
        }if ((n < 1000) && (n >= 100)){
            sumDigits = (n/100) +( (n%100)/10) + (n%10);
        }
        System.out.println("The sum of the digits is " + sumDigits);
        scanner.close();
    }

    /*
     * Ex1 Option 2
     */
    static void sumOfDigits(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number:");
        int number = scanner.nextInt();
        if (number < 0 || number > 1000) {
            System.out.println("Invalid input. Please enter an integer between 0 and 1000.");
        } else {
            
            // Convert the integer to a String to use charAt()
            String numberString = String.valueOf(number);
            int sumDigits = 0;
            
            //Iterate through each character (digit) in the string
            for (int i = 0; i < numberString.length(); i ++) {
                
                //Get the character in current index
                char digitChar = numberString.charAt(i);

                sumDigits += (digitChar - '0'); 

            }
            System.out.println("The sum of the digits in " + number + " is: " + sumDigits);
            scanner.close();
        }
    }

    /*
     * Ex2
     */
    static void convertMinutesTYearDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number:");
        int minutes = scanner.nextInt();
        int years = minutes / 525600;
        int remainingMinutes = minutes % 525600;
        int days = remainingMinutes / 1440;
        System.out.println(minutes + " minutes is " + years + " years and " + days + " days");
        scanner.close();
    }
}
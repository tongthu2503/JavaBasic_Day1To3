package day3;

import java.util.Scanner;

public class Loops {
        
        public static void main(String[] args) {
            int[] a = {1, 3, 5, 8, 9};
            System.out.println("======EX1======");
            System.out.print("Array a: ");
            inArray(a);
            System.out.println("======EX2======");
            sumAndAverage();
            System.out.println("======EX3======");
            sumAndAverage2();
            System.out.println("======EX4======");
            sumAndAverage3();
            System.out.println("======EX5======");
            sumAndAverage4();
            System.out.println("======EX6======");
            sumOfSquares();
            System.out.println("======EX7======");
            HarmonicSum();
            System.out.println("======EX8======");
            SquareBoard();
            System.out.println("======EX9======");
            CheckerBoard();
            System.out.println("======EX10 For ======");
            findLocationLeter();
            System.out.println("======EX10 While ======");
            findLocationLeter1();
        }

    /*
    * Ex1
    */
        public static void inArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    
    /*
    * Ex2
    */

        public static void sumAndAverage() {
            int sum = 0;
            for (int i = 1; i <= 100; i++){
                sum = sum + i;
            }
            System.out.println("The sum is:" + " " + sum);
            float avg;
            avg = (float)sum/100;
            System.out.println("The average is:" + " " + avg);
        }
    
    /*
    * Ex3
    */
        public static void sumAndAverage2() {
            int sum = 0;
            int count = 0;
            for (int i = 111; i <= 8890; i++){
                sum = sum + i;
                count++;
            }
            System.out.println("The sum is:" + " " + sum);
            double avg = (double)sum/(double)count;
            System.out.println("The average is:" + " " + avg);
        }

    /*
    * Ex4
    */
        public static void sumAndAverage3() {
            int sum = 0;
            int count = 0;
            for (int i = 1; i <= 100; i++){
                if (i%2 == 1){
                    sum = sum + i;
                    count++;
                }
               
            }
            System.out.println("The sum is:" + " " + sum);
            double avg = (double)sum/(double)count;
            System.out.println("The average is:" + " " + avg);
        }

    /*
    * Ex5
    */
        public static void sumAndAverage4() {
            int sum = 0;
            int count = 0;
            for (int i = 1; i <= 100; i++){
                if (i%7 == 0){
                    sum = sum + i;
                    count++;
                }
               
            }
            System.out.println("The sum is:" + " " + sum);
            double avg = (double)sum/(double)count;
            System.out.println("The average is:" + " " + avg);
        }
    
    /*
    * Ex6
    */
        public static void sumOfSquares() {
            int sum = 0;
            for (int i = 1; i <= 100; i++){
                sum = sum + i*i;
            }
            System.out.println("The sum is:" + " " + sum);
        }

    /*
    * Ex7
    */
        public static void HarmonicSum() {
            double sum1 = 0;
            double sum2 = 0;
            for (int i = 1; i <= 100; i++){
                sum1 = sum1 + (double)1/i;
            }
            System.out.println("The sum1 is:" + " " + sum1);
            System.out.println("The sum1 round is:" + " " + Math.round(sum1*100.0)/100.0);
            for (int i = 100; i >=1; i--) {
                sum2 = sum2 + (double)1/i;
            }
            System.out.println("The sum2 is:" + " " + sum2);
            System.out.println("The sum2 round is:" + " " + Math.round(sum2*100.0)/100.0);
        }

    /*
    * Ex8
    */
        public static void SquareBoard() {
            for (int i = 1; i <= 5; i++){
                for (int j=1;j<=5;j++) {
                    System.out.print("# ");
                }
                System.out.println();
            }
        }

    /*
    * Ex9
    */
        public static void CheckerBoard() {
            Scanner scanner = new Scanner(System.in); 
            //Create Size variable
            System.out.print("Input a size: ");
            int n = 0; n = scanner.nextInt();
            for (int i = 1; i <= n; i++){
                if (i % 2 == 1) {
                    for (int j = 1; j <= n;j++) {
                        System.out.print("# ");
                    }
                }
                else {
                    for (int j = 2; j <= n+1;j++) {
                        System.out.print(" #");
                    }
                }
                System.out.println();
            }
        }
    /*
    * Ex10_For
    */
        public static int locationLetter(String string, char findLeter) {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == findLeter) {
                    return i;
                }
            }
            return -1;
        }
        public static void findLocationLeter() {
            String string = "Hello World";
            char letter = 'r';
            int location = locationLetter(string, letter);
            if (location != -1) {
                System.out.println("Kí tự '" + letter + "' được tìm thấy tại vị trí: " + location);
            }   
            else {
            System.out.println("Không tìm thấy kí tự '" + letter + "' trong chuỗi.");
            }
        }
    /*
    * Ex10_While
    */
        public static int locationLetter1(String string, char findLeter) {
            int i = 0;
            while (i < string.length()) {
                if (string.charAt(i) == findLeter) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        public static void findLocationLeter1() {
            String string = "Hello World";
            char letter = 'r';
            int location = locationLetter1(string, letter);
            if (location != -1) {
                System.out.println("Kí tự '" + letter + "' được tìm thấy tại vị trí: " + location);
            }   
            else {
            System.out.println("Không tìm thấy kí tự '" + letter + "' trong chuỗi.");
            }
        }       

}
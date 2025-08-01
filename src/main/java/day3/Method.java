package day3;
import java.util.Scanner;
public class Method {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter an interger to check:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        isOdd(n);
        boolean answer = isOdd(n);
        if (answer == true) {
            System.out.println("ODD");
        }
        if (answer == false) {
            System.out.println("EVEN");
        }
        int m;
        System.out.print("Enter an interger to check contains the digit 8:");
        m = scanner.nextInt();
        //hasEight(m);
        boolean check = hasEight(m);
        if (check == true) {
            System.out.println("The number contains the digit 8");
        }
        if (check == false) {
            System.out.println("The number does not contain the character 8.");
        }
        MagicSum();
        scanner.close();
    }

    /*
     * Ex1
     */
    public static boolean isOdd(int n) {
        if (n % 2 == 1) {
            return true;
        }
        return false;
    }

    /*
     * Ex2
     */
    public static boolean hasEight(int n) {
        while (n > 0) {
            if (n % 10 == 8) {
                return true;
            }
            n = n/10;
        }
        return false;
    }

    /*
     * Ex3
     */
    public static void MagicSum() {
        int n,sum = 0;
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter a positive integer or -1 to exit:");
        while (true) {
            n = scanner1.nextInt();
            if (n < 0) break;
            // n > 0
            boolean ch = hasEight(n);
            if (ch == true) {
                sum = sum + n;
            }    
        }
        System.out.println("sum is:" + sum);
        scanner1.close();
    }
}

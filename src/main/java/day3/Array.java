package day3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        GradesAverage();
        // TC1
        int[] arrayEmty = {};
        printArray(arrayEmty);
        //TC2
        int[] arrayOne = {4};
        printArray(arrayOne);
        //TC3
        int[] arrayMultiple = {4,5,6,7};
        printArray(arrayMultiple);
        
        //Ex3
        System.out.println("Ex3");
     // TC1
        int[] arrayEmty1 = {};
        arrayToString(arrayEmty1);
        System.out.println(arrayToString(arrayEmty1));
        //TC2
        int[] arrayOne1 = {4};
        arrayToString(arrayOne1);
        System.out.println(arrayToString(arrayOne1));
        //TC3
        int[] arrayMultiple1 = {4,5,6,7,8};
        arrayToString(arrayMultiple1);
        System.out.println(arrayToString(arrayMultiple1));
    }

    /*
     * Ex1
     */
    public static void GradesAverage() {
        int n,numStudents,average = 0, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        numStudents = scanner.nextInt();
        int grades[] = new int[numStudents];
        //Emter grade for student
        for (int i= 1; i<=numStudents; i++) {
            System.out.print("Enter the grade for student" + " " + i + ": ");
            n = scanner.nextInt();
            while (n>100) {
                System.out.println("Invalid grade, try again...");
                System.out.print("Enter the grade for student" + " " + i + ": ");
                n = scanner.nextInt();
            }
            grades[i-1] = n;
        }
        //average
        for (int i= 0; i<numStudents; i++) {
            sum = sum + grades[i];
        }
        average = sum / numStudents;
        // Print average
        System.out.println("average is:" + average);
        scanner.close();
    }

    /*
     * Ex2
     */
    public static void printArray(int[] array){
        if(array.length>0){
            System.out.print("(");
            for(int i=0; i< array.length; i++){
                if (i == array.length-1 ){
                    System.out.print( + array[i]);
                }
                else {
                    System.out.print(array[i] + ",");
                }
            }
            System.out.println(")");

        }else{
            System.out.println("Array has no elements");
        }
    }

    /*
     * Ex3
     */
    public static String arrayToString(int[] array) {
    	String str = "";
    	if (array.length ==0) {
    		return str = "the array empty";
    	}
    	else if (array.length ==1) {
    		return str = "{" + Integer.toString(array[0]) + "}";
    	}
    	else {	
    		for(int i=0; i< array.length; i++) {
    		
    			if (i == 0 ) {
    				str+= "{" + Integer.toString(array[i]) + ",";
    			}else if (i == array.length-1 ) {
    				str+=Integer.toString(array[i]) + "}";
    			}
    			else {
    				str = str + Integer.toString(array[i]);
    				str = str + ",";
    			}
    		}
    		return str;
    	}
    }
}
/*
 * Question 3:
 * Write a Java program that takes a year from the user and prints whether that year is a leap year or not.
 *
 * Leap Year Rules:
 * 1. A non-century year is a leap year if it is divisible by 4 and not divisible by 100.
 * 2. A century year (ending with 00) is a leap year ONLY if it is divisible by 400.
 */

import java.util.Scanner;

class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Check leap year conditions using nested if-else
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // Century year: must be divisible by 400
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                // Non-century year divisible by 4 is a leap year
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }

        sc.close();
    }
}
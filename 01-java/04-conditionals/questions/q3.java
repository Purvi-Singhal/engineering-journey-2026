package questions;

import java.util.Scanner;

/*
 * Question 3: Day of Week using Switch-Case
 * 
 * Problem Statement:
 * Write a Java program that accepts a number from 1 to 7 from the user
 * and prints the corresponding day name of the week (1 -> Monday, ..., 7 -> Sunday).
 */

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter week number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        sc.close();
    }
}

package questions;

import java.util.Scanner;

/*
 * Question 1: Check Number Sign
 * 
 * Problem Statement:
 * Write a Java program to get a number from the user and print whether it is
 * positive, negative, or zero.
 */

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        sc.close();
    }
}

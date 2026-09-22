/*
 * Question 1:
 * Write a Java program to get a number from the user and print whether it is positive or negative.
 *
 * Logic:
 * - If number > 0 -> Positive
 * - If number < 0 -> Negative
 * - If number == 0 -> Zero (neither positive nor negative)
 */

import java.util.Scanner;

class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        // Check if the number is positive, negative, or zero
        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println(num + " is neither positive nor negative.");
        }

        sc.close();
    }
}
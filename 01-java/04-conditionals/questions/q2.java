package questions;

import java.util.Scanner;

/*
 * Question 2: Fever Temperature Check
 * 
 * Problem Statement:
 * Write a program that inputs body temperature in Fahrenheit from the user.
 * If temperature > 100.0, print "You have a fever", otherwise print "You don't have a fever".
 */

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter body temperature in Fahrenheit: ");
        double temp = sc.nextDouble();

        if (temp > 100.0) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You don't have a fever");
        }

        sc.close();
    }
}

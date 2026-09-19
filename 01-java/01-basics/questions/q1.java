package questions;

/**
 * Question 1: Average of 3 Numbers
 * 
 * Problem Statement:
 * In a program, input 3 numbers: A, B, and C. You have to output the average of
 * these 3 numbers.
 * 
 * Formula:
 * Average = (A + B + C) / 3
 * 
 * Sample Input:
 * A = 25, B = 30, C = 35
 * 
 * Expected Output:
 * 30.0
 */
public class q1 {
    public static void main(String args[]) {
        int a = 25;
        int b = 30;
        int c = 35;
        float avg = (float)(a + b + c) / 3;
        System.out.println("Average: " + avg);
    }
}

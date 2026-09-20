package questions;

/**
 * Question 4: Complex Multi-Operator Expression Tracing
 * 
 * Problem Statement:
 * What will be the output of the following Java program?
 * 
 *   int x = 9, y = 12;
 *   int a = 2, b = 4, c = 6;
 *   int exp = 4/3 * (x + 34) + 9 * (a + b + c) + (3 + y * (2 + a)) / (a + b * y);
 * 
 * Step-by-Step Breakdown:
 * 1. Term 1: 4/3 * (x + 34)
 *    - 4 / 3 in integer division = 1
 *    - (x + 34) = (9 + 34) = 43
 *    - 1 * 43 = 43
 * 
 * 2. Term 2: 9 * (a + b + c)
 *    - (a + b + c) = (2 + 4 + 6) = 12
 *    - 9 * 12 = 108
 * 
 * 3. Term 3: (3 + y * (2 + a)) / (a + b * y)
 *    - Numerator: (3 + 12 * (2 + 2)) = (3 + 12 * 4) = (3 + 48) = 51
 *    - Denominator: (a + b * y) = (2 + 4 * 12) = (2 + 48) = 50
 *    - Division: 51 / 50 = 1 (integer division truncates)
 * 
 * 4. Summing all terms:
 *    - exp = 43 + 108 + 1 = 152
 * 
 * Expected Output:
 * 152
 */
public class q4 {
    public static void main(String args[]) {
        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;

        int exp = 4 / 3 * (x + 34) + 9 * (a + b + c) + (3 + y * (2 + a)) / (a + b * y);
        System.out.println("Result of expression: " + exp);
    }
}

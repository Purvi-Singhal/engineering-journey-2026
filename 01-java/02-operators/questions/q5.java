package questions;

/**
 * Question 5: Associativity & Parentheses Evaluation Trace
 * 
 * Problem Statement:
 * What will be the output of the following Java program?
 * 
 *   int x = 10, y = 5;
 *   int exp1 = (y * (x / y + x / y));
 *   int exp2 = (y * x / y + y * x / y);
 * 
 * Step-by-Step Breakdown:
 * 1. exp1 = (y * (x / y + x / y))
 *    - Parentheses evaluate first.
 *    - (x / y) -> (10 / 5) = 2
 *    - (2 + 2) = 4
 *    - y * 4 -> 5 * 4 = 20
 * 
 * 2. exp2 = (y * x / y + y * x / y)
 *    - '*' and '/' evaluate Left-to-Right before addition '+':
 *    - First term: (y * x / y) -> (5 * 10 / 5) -> (50 / 5) = 10
 *    - Second term: (y * x / y) -> (5 * 10 / 5) -> (50 / 5) = 10
 *    - Addition: 10 + 10 = 20
 * 
 * Expected Output:
 * 20
 * 20
 */
public class q5 {
    public static void main(String args[]) {
        int x = 10, y = 5;

        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);

        System.out.println("exp1: " + exp1);
        System.out.println("exp2: " + exp2);
    }
}

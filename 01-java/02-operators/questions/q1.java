package questions;

/**
 * Question 1: Operator Precedence & Integer Division Tracing
 * 
 * Problem Statement:
 * What will be the output of the following Java program?
 * 
 *   int x = 2, y = 5;
 *   int exp1 = (x * y / x);
 *   int exp2 = (x * (y / x));
 * 
 * Step-by-Step Evaluation:
 * 1. exp1 = (x * y / x)
 *    - Both '*' and '/' have equal precedence, evaluated Left-to-Right (Associativity).
 *    - (2 * 5) = 10
 *    - (10 / 2) = 5
 *    - exp1 = 5
 * 
 * 2. exp2 = (x * (y / x))
 *    - Parentheses '()' take highest priority.
 *    - (y / x) -> (5 / 2) = 2 (Integer division truncates the decimal).
 *    - (x * 2) -> (2 * 2) = 4
 *    - exp2 = 4
 * 
 * Expected Output:
 * 5 , 4
 */
public class q1 {
    public static void main(String args[]) {
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));

        System.out.print(exp1 + " , ");
        System.out.println(exp2);
    }
}

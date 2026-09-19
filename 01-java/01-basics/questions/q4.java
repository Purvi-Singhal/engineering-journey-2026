package questions;

/**
 * Question 4: Type Promotion & Identifier Rules
 * 
 * Problem Statement:
 * What will be the type of result in the following Java code?
 *   byte b = 4;
 *   char c = 'a';
 *   short s = 512;
 *   int i = 1000;
 *   float f = 5.67f;
 *   double d = 0.1234;
 *   result = (f * b) + (i / c) - (d * s);
 * 
 * Concept:
 * - (f * b) -> float * byte => float
 * - (i / c) -> int / char => int
 * - (d * s) -> double * short => double
 * - float + int - double => double
 * 
 * The entire expression is promoted to the largest data type involved, which is `double`.
 * 
 * Also tests identifier rules:
 * - Is `int $ = 24;` valid? Yes, '$' and '_' are allowed as identifier characters in Java.
 */
public class q4 {
    public static void main(String args[]) {
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 5.67f;
        double d = 0.1234;

        double result = (f * b) + (i / c) - (d * s);
        System.out.println("Result of expression: " + result);

        // Valid identifier demonstration
        int $ = 24;
        System.out.println("Value of identifier $: " + $);
    }
}

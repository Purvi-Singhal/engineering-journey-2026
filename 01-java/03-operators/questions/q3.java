package questions;

/**
 * Question 3: Compound Assignment Operators Tracing
 * 
 * Problem Statement:
 * What will be the output of the following Java program?
 * 
 *   int x, y, z;
 *   x = y = z = 2;
 *   x += y;
 *   y -= z;
 *   z /= (x + y);
 *   System.out.println(x + " " + y + " " + z);
 * 
 * Step-by-Step Evaluation:
 * 1. Chained assignment: x = 2, y = 2, z = 2.
 * 2. x += y  -> x = x + y -> x = 2 + 2 = 4.
 * 3. y -= z  -> y = y - z -> y = 2 - 2 = 0.
 * 4. z /= (x + y) -> z = z / (4 + 0) -> z = 2 / 4.
 *    - In integer division, 2 / 4 evaluates to 0 (fractional part is truncated).
 *    - Therefore, z = 0.
 * 
 * Expected Output:
 * 4 0 0
 */
public class q3 {
    public static void main(String args[]) {
        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);

        System.out.println(x + " " + y + " " + z);
    }
}

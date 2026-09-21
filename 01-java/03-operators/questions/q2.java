package questions;
/**
 * Question 2: Logical Operators & Short-Circuit Evaluation
 * 
 * Problem Statement:
 * What will be the output of the following code?
 * 
 *   int x = 200, y = 50, z = 100;
 *   if(x > y && y > z) {
 *       System.out.println("Hello");
 *   }
 *   if(z > y && z < x) {
 *       System.out.println("Java");
 *   }
 *   if((y + 200) < x && (y = 150) < z) {
 *       System.out.println("Hello Java");
 *   }
 * 
 * Step-by-Step Evaluation:
 * 1. (x > y && y > z) -> (200 > 50 && 50 > 100) -> (true && false) => false
 *    - "Hello" is NOT printed.
 * 
 * 2. (z > y && z < x) -> (100 > 50 && 100 < 200) -> (true && true) => true
 *    - "Java" IS printed!
 * 
 * 3. ((y + 200) < x && ...) -> ((50 + 200) < 200) -> (250 < 200) => false
 *    - Because the left condition of '&&' is false, Java short-circuits and ignores the right side.
 *    - "Hello Java" is NOT printed.
 * 
 * Expected Output:
 * Java
 */
public class q2 {
    public static void main(String args[]) {
        int x = 200, y = 50, z = 100;

        if (x > y && y > z) {
            System.out.println("Hello");
        }
        if (z > y && z < x) {
            System.out.println("Java");
        }
        if ((y + 200) < x && (y = 150) < z) {
            System.out.println("Hello Java");
        }
    }
}

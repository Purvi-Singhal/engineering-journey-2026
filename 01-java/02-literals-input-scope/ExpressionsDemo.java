/**
 * ExpressionsDemo.java
 * 
 * Demonstrates:
 * 1. Expression vs Statement vs Code Block
 * 2. Arithmetic, Relational, Logical, and Assignment expressions
 * 3. Type promotion rules in expressions (byte/short/char -> int -> long -> float -> double)
 * 4. Evaluation order and side effects in compound expressions
 */
public class ExpressionsDemo {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("              EXPRESSIONS IN JAVA                 ");
        System.out.println("==================================================");

        // 1. Expression vs Statement
        // (10 + 20) is an Expression (evaluates to 30)
        // int sum = 10 + 20; is a Declaration Statement
        int sum = 10 + 20;
        System.out.println("Evaluated expression (10 + 20) = " + sum);

        // 2. Assignment Expression Evaluation
        // In Java, an assignment itself is an expression evaluating to the assigned value!
        int x;
        int y = (x = 42); // x becomes 42, and (x = 42) evaluates to 42
        System.out.println("Chained / Nested Assignment: x = " + x + ", y = " + y);

        // 3. Type Promotion in Expressions
        byte b1 = 40;
        byte b2 = 50;
        byte b3 = 100;
        // Even though b1, b2, b3 are bytes, intermediate operations are promoted to int:
        int promotedInt = b1 * b2 / b3; // (40 * 50) = 2000 (exceeds byte range, safely kept as int)
        System.out.println("\n--- Type Promotion ---");
        System.out.println("byte calculation (40 * 50 / 100) promoted to int: " + promotedInt);

        char c = 'a'; // ASCII 97
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;

        // Mixed expression:
        // (f * b1) => float
        // (i / c)  => int
        // (d * s)  => double
        // (float) + (int) - (double) => double
        double complexResult = (f * b1) + (i / c) - (d * s);
        System.out.println("Complex Expression Result (promoted to double): " + complexResult);

        // 4. Evaluation Order & Side Effects
        int val = 5;
        // Java evaluates operands strictly from LEFT to RIGHT:
        // val++ produces 5 (then val becomes 6)
        // ++val produces 7 (val becomes 7)
        // result = 5 + 7 = 12
        int evalResult = val++ + ++val;
        System.out.println("\n--- Evaluation Order & Side Effects ---");
        System.out.println("Result of (val++ + ++val) where initial val=5: " + evalResult);
        System.out.println("Final val value: " + val);

        System.out.println("==================================================");
    }
}

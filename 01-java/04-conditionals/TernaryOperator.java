// Demonstrating Ternary Operator: variable = (condition) ? statement1 : statement2;
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example 1: Check Odd or Even
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String type = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + type);

        // Example 2: Check Pass or Fail
        System.out.print("Enter your marks (0 - 100): ");
        int marks = sc.nextInt();
        String result = (marks >= 33) ? "PASS" : "FAIL";
        System.out.println("Result: " + result);

        sc.close();
    }
}

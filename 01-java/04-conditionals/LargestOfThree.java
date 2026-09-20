// Print the largest of 3 numbers
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (A): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (B): ");
        int b = sc.nextInt();
        System.out.print("Enter third number (C): ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + " is the largest number.");
        } else if (b >= c) {
            System.out.println(b + " is the largest number.");
        } else {
            System.out.println(c + " is the largest number.");
        }

        sc.close();
    }
}

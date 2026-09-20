import java.util.Scanner;

/**
 * ScannerInputDemo.java
 * 
 * Demonstrates:
 * 1. Reading single tokens (next(), nextInt(), nextDouble(), nextBoolean())
 * 2. Reading full lines with spaces (nextLine())
 * 3. The famous Scanner "newline buffer trap" and its correct resolutions
 */
public class ScannerInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("            JAVA SCANNER INPUT DEMO               ");
        System.out.println("==================================================");

        // 1. Reading Numbers & Tokens
        System.out.print("Enter your Age (integer): ");
        int age = sc.nextInt();

        System.out.print("Enter your CGPA / Rating (double): ");
        double rating = sc.nextDouble();

        System.out.print("Are you an active student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        System.out.print("Enter your First Name (single word): ");
        String firstName = sc.next();

        // ----------------------------------------------------
        // CRITICAL: BUFFER FLUSH FIX
        // The preceding next() / nextBoolean() calls left '\n'
        // in the System.in buffer. We must consume it before nextLine()!
        // ----------------------------------------------------
        sc.nextLine(); // Clear the leftover newline character

        System.out.print("Enter your Full College / Organization Name (full line): ");
        String organization = sc.nextLine();

        System.out.println("\n----------------- Summary Output -----------------");
        System.out.println("First Name   : " + firstName);
        System.out.println("Age          : " + age);
        System.out.println("Rating       : " + rating);
        System.out.println("Student Status: " + isStudent);
        System.out.println("Organization : " + organization);
        System.out.println("==================================================");

        sc.close();
    }
}

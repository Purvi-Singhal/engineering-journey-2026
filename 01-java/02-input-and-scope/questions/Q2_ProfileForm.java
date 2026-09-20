import java.util.Scanner;

/**
 * Q2_ProfileForm.java
 * 
 * Solution for Question 2:
 * Demonstrates clean, bullet-proof handling of mixed primitive types and full lines,
 * avoiding the nextInt() -> nextLine() newline skip pitfall.
 */
public class Q2_ProfileForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== USER PROFILE REGISTRATION ======");

        System.out.print("Enter User ID (int): ");
        int userId = sc.nextInt();
        sc.nextLine(); // Clear leftover '\n' from buffer

        System.out.print("Enter Full Name (String with spaces): ");
        String fullName = sc.nextLine();

        System.out.print("Enter Hourly Wage (double): ");
        double wage = sc.nextDouble();
        sc.nextLine(); // Clear leftover '\n' from buffer

        System.out.print("Enter Department (String with spaces): ");
        String department = sc.nextLine();

        System.out.println("\n========== PROFILE REGISTERED ==========");
        System.out.println("ID         : " + userId);
        System.out.println("Name       : " + fullName);
        System.out.println("Wage/hr    : $" + String.format("%.2f", wage));
        System.out.println("Department : " + department);
        System.out.println("========================================");

        sc.close();
    }
}

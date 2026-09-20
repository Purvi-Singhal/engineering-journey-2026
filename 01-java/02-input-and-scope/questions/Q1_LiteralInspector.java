import java.util.Scanner;

/**
 * Q1_LiteralInspector.java
 * 
 * Takes an integer input and displays its literal representations in:
 * - Decimal (Base 10)
 * - Binary (Base 2 with 0b prefix)
 * - Octal (Base 8 with 0 prefix)
 * - Hexadecimal (Base 16 with 0x prefix)
 */
public class Q1_LiteralInspector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int value = sc.hasNextInt() ? sc.nextInt() : 255;

        System.out.println("\n========== LITERAL INSPECTOR ==========");
        System.out.println("Decimal (Base 10)     : " + value);
        System.out.println("Binary (Base 2)       : 0b" + Integer.toBinaryString(value));
        System.out.println("Octal (Base 8)        : 0" + Integer.toOctalString(value));
        System.out.println("Hexadecimal (Base 16) : 0x" + Integer.toHexString(value).toUpperCase());
        System.out.println("=======================================");

        sc.close();
    }
}

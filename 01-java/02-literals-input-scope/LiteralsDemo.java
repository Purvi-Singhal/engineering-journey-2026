/**
 * LiteralsDemo.java
 * 
 * Demonstrates all Java literal representations:
 * 1. Integer literals: Decimal, Binary (0b), Octal (0), Hexadecimal (0x), Long suffix (L)
 * 2. Underscores in numeric literals for readability
 * 3. Floating-point literals: Standard double, explicit float (f), scientific notation (e/E)
 * 4. Character literals: Standard, ASCII numerical values, Escape sequences, Unicode escapes
 * 5. String, Boolean, and Null literals
 */
public class LiteralsDemo {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("               JAVA LITERALS DEMO                 ");
        System.out.println("==================================================");

        // 1. Integer Literals in Different Number Bases
        int decimalVal = 100;
        int binaryVal  = 0b1100100; // 0b prefix (100 in base 10)
        int octalVal   = 0144;      // 0 prefix  (100 in base 10)
        int hexVal     = 0x64;      // 0x prefix (100 in base 10)
        long longVal   = 9_876_543_210L;

        System.out.println("\n--- 1. Integer Literals (Base Systems) ---");
        System.out.println("Decimal  (100)       : " + decimalVal);
        System.out.println("Binary   (0b1100100) : " + binaryVal);
        System.out.println("Octal    (0144)      : " + octalVal);
        System.out.println("Hex      (0x64)      : " + hexVal);
        System.out.println("Long     (with 'L')  : " + longVal);

        // 2. Underscores in Numeric Literals (Java 7+)
        int million = 1_000_000;
        long creditCard = 4532_8901_2345_6789L;
        int hexColor = 0xFF_57_33;
        int binaryMask = 0b1111_0000_1010_0101;

        System.out.println("\n--- 2. Underscores for Readability ---");
        System.out.println("Million      : " + million);
        System.out.println("Credit Card  : " + creditCard);
        System.out.println("Hex Color    : " + hexColor + " (0xFF5733)");
        System.out.println("Binary Mask  : " + binaryMask);

        // 3. Floating-Point Literals
        float floatPrice = 19.99F;
        double doubleVal = 12345.6789;
        double sciNotation1 = 1.25e4;  // 1.25 * 10^4 = 12500.0
        double sciNotation2 = 4.5e-3;  // 4.5 * 10^-3 = 0.0045

        System.out.println("\n--- 3. Floating-Point Literals ---");
        System.out.println("Float (19.99F)       : " + floatPrice);
        System.out.println("Double (12345.6789)  : " + doubleVal);
        System.out.println("Scientific 1.25e4    : " + sciNotation1);
        System.out.println("Scientific 4.5e-3    : " + sciNotation2);

        // 4. Character Literals & Escape Sequences
        char normalChar = 'P';
        char asciiChar = 80;        // 'P'
        char unicodeChar = '\u0050'; // 'P'
        char devanagari = '\u092A';  // 'प'
        char omega = '\u03A9';       // 'Ω'

        System.out.println("\n--- 4. Character Literals & Unicode ---");
        System.out.println("Standard Char        : " + normalChar);
        System.out.println("ASCII (80)           : " + asciiChar);
        System.out.println("Unicode (\\u0050)     : " + unicodeChar);
        System.out.println("Devanagari (\\u092A)   : " + devanagari);
        System.out.println("Greek Omega (\\u03A9)  : " + omega);
        System.out.println("Escape \\t Tab \\n Line : Tabbed\tNextLine");

        // 5. String & Boolean Literals
        String quote = "Engineering Journey \u2014 \"2026\"";
        boolean isActive = true;
        String emptyObj = null;

        System.out.println("\n--- 5. String, Boolean & Null ---");
        System.out.println("String Literal       : " + quote);
        System.out.println("Boolean Literal      : " + isActive);
        System.out.println("Null Literal         : " + emptyObj);
        System.out.println("==================================================");
    }
}

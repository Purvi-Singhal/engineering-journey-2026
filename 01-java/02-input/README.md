# Module 02: Java User Input with Scanner

> Comprehensive guide covering Java User Input using `java.util.Scanner`, standard input stream (`System.in`), token-based vs. line-based reading, and resolving the classic `nextLine()` buffer newline pitfall.

---

## 1. Overview & Architecture

Every interactive Java application relies on **Input Streams** to capture data from users via the keyboard or console. In Java, this is handled through `System.in`, which represents the standard input stream.

```
+-----------------------------------------------------------------------------+
|                      JAVA USER INPUT (SCANNER ARCHITECTURE)                 |
|                                                                             |
|                       [ Keyboard / Terminal Input ]                         |
|                                     │                                       |
|                                     ▼                                       |
|                           [ System.in Stream ]                              |
|                                     │                                       |
|                                     ▼                                       |
|                            [ java.util.Scanner ]                            |
|                                     │                                       |
|       ┌─────────────────────────────┼─────────────────────────────┐         |
|       ▼                             ▼                             ▼         |
|   Tokens                        Lines                         Primitives    |
|  sc.next()                   sc.nextLine()               sc.nextInt()       |
|  (Reads word)               (Reads full line)            sc.nextFloat()     |
|                                                          sc.nextDouble()    |
|                                                          sc.nextBoolean()   |
+-----------------------------------------------------------------------------+
```

---

## 2. Reading Input with `java.util.Scanner`

To use `Scanner`, import it from the `java.util` package and create an instance bound to `System.in`:

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading inputs...
        
        sc.close(); // Good practice to close scanner
    }
}
```

### 1. Key Scanner Input Methods

| Method | Description | Input Example | Data Type Returned |
| :--- | :--- | :--- | :--- |
| `sc.next()` | Reads next token up to whitespace | `"Purvi"` | `String` |
| `sc.nextLine()` | Reads entire line including spaces until `\n` | `"Purvi Singhal 2026"` | `String` |
| `sc.nextInt()` | Reads a 32-bit signed integer | `42` | `int` |
| `sc.nextLong()` | Reads a 64-bit signed integer | `9876543210` | `long` |
| `sc.nextFloat()` | Reads a 32-bit floating-point number | `99.5` | `float` |
| `sc.nextDouble()` | Reads a 64-bit floating-point number | `3.14159` | `double` |
| `sc.nextBoolean()`| Reads a boolean value (`true` / `false`) | `true` | `boolean` |
| `sc.hasNextInt()` | Checks if the next available token is an `int` | *Lookahead* | `boolean` |

---

## 3. The Classic Scanner Buffer Trap & Resolution

### The Problem:
Methods like `nextInt()`, `nextFloat()`, `nextDouble()`, and `next()` read only their target token and **leave the trailing newline character (`\n`)** sitting in the input buffer. When `nextLine()` is called immediately after, it reads that leftover `\n` and returns an **empty string** without waiting for the user!

```
User enters: "25 [Enter]"
Buffer State:  [ '2' ][ '5' ][ '\n' ]
sc.nextInt()   --> Reads '2''5' (Returns 25)
Buffer State:  [ '\n' ] (Lingering in buffer!)
sc.nextLine()  --> Immediately consumes '\n' and finishes -> Returns "" (SKIPPED!)
```

### Solution 1: Flush the Residual Newline (Recommended)
```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter Age: ");
int age = sc.nextInt();
sc.nextLine(); // Clear the leftover newline '\n'

System.out.print("Enter Full Name: ");
String name = sc.nextLine(); // Now correctly waits for user input!
```

### Solution 2: Read All Inputs via `nextLine()` and Parse
```java
System.out.print("Enter Age: ");
int age = Integer.parseInt(sc.nextLine().trim());

System.out.print("Enter Full Name: ");
String name = sc.nextLine();
```

---

## 4. Code Examples & Directory Files

| File | Type | Description |
| :--- | :--- | :--- |
| [`input.java`](./input.java) | Demo | Basic Scanner integer, float, string input and addition. |
| [`product.java`](./product.java) | Demo | Scanner product and Circle area computation. |
| [`ScannerInputDemo.java`](./ScannerInputDemo.java) | Demo | Comprehensive multi-type Scanner usage with newline buffer flush fix. |
| [`questions/`](./questions/README.md) | Practice | Full set of Scanner input-driven practice problems and solutions. |

---

## 5. Practice Questions

| Problem | File | Description |
| :--- | :--- | :--- |
| **Q1: Average of 3 Numbers** | [`questions/q1_average.java`](./questions/q1_average.java) | Calculates average of 3 input integers. |
| **Q2: Area of a Square** | [`questions/q2_square_area.java`](./questions/q2_square_area.java) | Takes side length and calculates square area. |
| **Q3: Item Bill with 18% GST** | [`questions/q3_bill_gst.java`](./questions/q3_bill_gst.java) | Computes total bill with tax using `float` input. |
| **Q4: Robust Profile Form** | [`questions/q4_profile_form.java`](./questions/q4_profile_form.java) | Multi-field safe Scanner form fixing the newline buffer trap. |

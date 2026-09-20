# Module 02: Java User Input

> Comprehensive guide covering Java Input Systems, interactive console I/O with `Scanner`, the classic `nextLine()` buffer pitfall, and high-performance Fast I/O with `BufferedReader` and `StringTokenizer`.

---

## 1. Overview & Architecture

Every interactive Java application relies on **Input Streams** to capture data from users, command lines, or files. The standard mechanism is through `System.in`, which connects to the standard input stream of the underlying operating system.

```
+-----------------------------------------------------------------------------+
|                           JAVA USER INPUT SYSTEMS                           |
|                                                                             |
|                       [ Keyboard / Terminal Input ]                         |
|                                     │                                       |
|                                     ▼                                       |
|                           [ System.in Stream ]                              |
|                                     │                                       |
|         ┌───────────────────────────┴───────────────────────────┐           |
|         ▼                                                       ▼           |
|  [ java.util.Scanner ]                               [ java.io.BufferedReader ] 
|  ├─ 1 KB buffer                                      ├─ 8 KB character buffer
|  ├─ Token parsing (Regex)                            ├─ Direct string stream 
|  ├─ nextInt(), nextFloat(), etc.                     ├─ readLine() + StringTokenizer
|  └─ Best for: Interactive Console Apps               └─ Best for: Fast I/O & Big Data
+-----------------------------------------------------------------------------+
```

---

## 2. Reading Input with `java.util.Scanner`

The `Scanner` class parses primitive types and strings using regular expressions over tokens (whitespace-delimited by default).

### 1. Common Scanner Methods

| Method | Description | Input Example | Stored Type |
| :--- | :--- | :--- | :--- |
| `sc.next()` | Reads next token up to whitespace delimiter | `"Purvi"` | `String` |
| `sc.nextLine()` | Reads full line including spaces until `\n` | `"Purvi Singhal 2026"` | `String` |
| `sc.nextInt()` | Reads 32-bit integer token | `42` | `int` |
| `sc.nextLong()` | Reads 64-bit integer token | `9876543210` | `long` |
| `sc.nextFloat()` | Reads 32-bit floating-point token | `99.5` | `float` |
| `sc.nextDouble()` | Reads 64-bit floating-point token | `3.14159` | `double` |
| `sc.nextBoolean()`| Reads boolean token (`true` / `false`) | `true` | `boolean` |
| `sc.hasNextInt()` | Checks if the next token is an integer | *Lookahead* | `boolean` |

---

## 3. The Classic Scanner Buffer Trap & Fix

### The Problem:
`nextInt()`, `nextFloat()`, and `next()` read only their target token and **leave the trailing newline character (`\n`)** in the input buffer. When `nextLine()` is called immediately afterwards, it reads that leftover `\n` and returns an **empty string** without waiting for the user!

```
User enters: "25 [Enter]"
Buffer State:  [ '2' ][ '5' ][ '\n' ]
sc.nextInt()   --> Reads '2''5' (Returns 25)
Buffer State:  [ '\n' ] (Lingering in buffer!)
sc.nextLine()  --> Immediately consumes '\n' and finishes -> Returns "" (SKIPPED!)
```

### Solution 1: Flush the Residual Newline
```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter Age: ");
int age = sc.nextInt();
sc.nextLine(); // Clear the leftover newline '\n'

System.out.print("Enter Full Name: ");
String name = sc.nextLine(); // Correctly waits for user input!
```

### Solution 2: Read All Inputs via `nextLine()` and Parse
```java
int age = Integer.parseInt(sc.nextLine().trim());
String name = sc.nextLine();
```

---

## 4. High-Performance Fast I/O: `BufferedReader`

For competitive programming, massive datasets, or high-throughput servers, `Scanner` is slow because of regex overhead and a small 1KB buffer. `BufferedReader` provides an **8KB character buffer** with direct character-array reading.

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FastIOExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Fast line reading
        String line = br.readLine();
        
        // Tokenize space-separated values (e.g. "10 20 30 40")
        StringTokenizer st = new StringTokenizer(line);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        System.out.println("Sum = " + (a + b));
    }
}
```

### Comparison: `Scanner` vs. `BufferedReader`

| Feature | `java.util.Scanner` | `java.io.BufferedReader` |
| :--- | :--- | :--- |
| **Package** | `java.util` | `java.io` |
| **Buffer Size** | 1 KB | **8 KB (8x larger)** |
| **Speed** | Slower (regex parsing overhead) | **~10x - 20x Faster** |
| **Thread Safety** | Not Synchronized | Synchronized (Thread-safe) |
| **Parsing** | Direct primitive methods (`nextInt`) | Reads raw strings; parse manually |
| **Exception Handling** | Swallows `IOException` internally | Requires explicit `IOException` handling |
| **Best Use Case** | Small interactive console applications | Large inputs, Competitive Programming, File I/O |

---

## 5. Code Examples & Directory Files

| File | Type | Description |
| :--- | :--- | :--- |
| [`input.java`](./input.java) | Demo | Basic Scanner integer, float, string input and addition. |
| [`product.java`](./product.java) | Demo | Scanner product and Circle area computation. |
| [`ScannerInputDemo.java`](./ScannerInputDemo.java) | Demo | Comprehensive multi-type Scanner usage with newline buffer flush fix. |
| [`FastIODemo.java`](./FastIODemo.java) | Demo | High-performance I/O with `BufferedReader` and `StringTokenizer`. |
| [`questions/`](./questions/README.md) | Practice | Full set of input-driven practice problems and solutions. |

---

## 6. Practice Questions

| Problem | File | Description |
| :--- | :--- | :--- |
| **Q1: Average of 3 Numbers** | [`questions/q1_average.java`](./questions/q1_average.java) | Calculates average of 3 input integers. |
| **Q2: Area of a Square** | [`questions/q2_square_area.java`](./questions/q2_square_area.java) | Takes side length and calculates square area. |
| **Q3: Item Bill with 18% GST** | [`questions/q3_bill_gst.java`](./questions/q3_bill_gst.java) | Computes total bill with tax using `float` input. |
| **Q4: Robust Profile Form** | [`questions/q4_profile_form.java`](./questions/q4_profile_form.java) | Multi-field safe Scanner form fixing the newline buffer trap. |
| **Q5: Fast I/O Stream Sum** | [`questions/q5_fast_stream_sum.java`](./questions/q5_fast_stream_sum.java) | Fast multi-line stream summation with `BufferedReader`. |

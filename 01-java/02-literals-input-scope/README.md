# Module 02: Java Literals, Expressions, Input & Scope

> Deep dive into Java literals, literal syntax, expression evaluation rules, user input handling (`Scanner` vs. `BufferedReader` Fast I/O), and variable scope, shadowing, and lifetime.

---

## 1. Overview & Architecture

Every Java computation starts with constant values (**Literals**), combines them into evaluated formulas (**Expressions**), receives data dynamically from users (**I/O Streams**), and manages variable visibility and lifetime across execution blocks (**Scope**).

```
+-----------------------------------------------------------------------------+
|                               JAVA EXECUTION                                |
|                                                                             |
|  [ Literals ] ───> [ Expressions & Operators ] ───> [ Evaluated Result ]    |
|   (Constants)          (Evaluation & Promotion)                             |
|                                ▲                                            |
|                                │ User Data                                  |
|                 [ System.in / Input Streams ]                               |
|                  ├─ Scanner (Token parsing)                                 |
|                  └─ BufferedReader (Fast 8KB I/O)                           |
|                                                                             |
|  [ Variable Scopes ]                                                        |
|   ├─ Block Scope { ... }   (Stack Frame - local lifecycle)                  |
|   ├─ Method Scope (main)   (Stack Frame - parameter lifecycle)              |
|   └─ Class/Static Scope    (Method Area & Heap - global lifecycle)          |
+-----------------------------------------------------------------------------+
```

---

## 2. Java Literals

A **literal** is a fixed source code representation of a constant value directly assigned to a variable without computation.

```java
int count = 100;         // 100 is an integer literal
double price = 29.99;    // 29.99 is a floating-point literal
char grade = 'A';        // 'A' is a character literal
String label = "Alpha";  // "Alpha" is a string literal
```

### 1. Integer Literals (Base Systems & Prefixes)

Java supports four number systems for integer literals:

| Number System | Base | Prefix | Valid Digits | Example | Decimal Value |
| :--- | :---: | :---: | :--- | :--- | :---: |
| **Decimal** | 10 | *None* | `0-9` | `int a = 120;` | `120` |
| **Binary** | 2 | `0b` or `0B` | `0, 1` | `int b = 0b1010;` | `10` |
| **Octal** | 8 | `0` | `0-7` | `int c = 014;` | `12` |
| **Hexadecimal** | 16 | `0x` or `0X` | `0-9`, `a-f`, `A-F` | `int d = 0x2A;` | `42` |

> [!WARNING]
> Leading zero `0` denotes an **octal** literal! Writing `int x = 077;` results in decimal `63`. Writing `int y = 088;` causes a compile-time error because `8` is invalid in base-8.

#### Suffixes for Long Literals:
Integer literals default to type `int` (32-bit). To specify a `long` literal (64-bit), append `L` or `l` (always prefer uppercase `L` for readability):
```java
long distance = 9876543210L; // Required: without 'L', 9876543210 exceeds int capacity
```

### 2. Underscores in Numeric Literals (Java 7+)

Underscores (`_`) can be placed between digits to improve readability. The compiler ignores them completely.

```java
int million = 1_000_000;
long creditCard = 1234_5678_9012_3456L;
int binaryByte = 0b1100_0011;
int hexColor = 0xFF_E4_A1;
```

**Rules for Underscores:**
- Allowed: Only between digits (e.g., `1_000`).
- Disallowed: At the start/end of numbers (`_100` or `100_`), adjacent to decimal points (`3_.14` or `3._14`), or next to suffixes/prefixes (`0b_101` or `1000_L`).

### 3. Floating-Point Literals

Floating-point literals represent numbers with fractional parts.

- **`double`**: Default type for decimal literals. Suffix `D` or `d` is optional (e.g., `3.14159`).
- **`float`**: Requires explicit `F` or `f` suffix (e.g., `3.14f`).

```java
float f1 = 45.67f;       // Explicit float suffix
double d1 = 45.67;       // Default double
double d2 = 1.5e3;       // Scientific notation: 1.5 * 10^3 = 1500.0
double d3 = 2.4e-2;      // Scientific notation: 2.4 * 10^-2 = 0.024
```

### 4. Character Literals & Escape Sequences

A `char` literal is enclosed in single quotes `' '` representing a 16-bit Unicode character.

| Escape Sequence | Description | Unicode Code Point |
| :---: | :--- | :---: |
| `\n` | Newline (Line feed) | `\u000A` |
| `\t` | Horizontal Tab | `\u0009` |
| `\b` | Backspace | `\u0008` |
| `\r` | Carriage Return | `\u000D` |
| `\'` | Single Quote | `\u0027` |
| `\"` | Double Quote | `\u0022` |
| `\\` | Backslash | `\u005C` |
| `\uXXXX` | Any Unicode Character (Hex) | e.g. `\u0905` = 'अ', `\u03A9` = 'Ω' |

```java
char ch1 = 'A';
char ch2 = 65;           // ASCII decimal for 'A'
char ch3 = '\u0041';     // Unicode hex for 'A'
char newline = '\n';
```

### 5. String Literals & Boolean Literals

- **String Literal**: Sequence of characters enclosed in double quotes `" "`. Stored in the JVM **String Constant Pool**.
  ```java
  String greeting = "Hello, Java!\nWelcome to 2026.";
  ```
- **Boolean Literal**: Only two valid values: `true` or `false` (case-sensitive, no quotes, cannot use `0` or `1`).
  ```java
  boolean isCompleted = true;
  ```
- **Null Literal**: `null` represents the absence of any object reference.

---

## 3. Expressions & Statements

### Definitions:

| Concept | Definition | Example |
| :--- | :--- | :--- |
| **Expression** | A construct of variables, operators, and literals that evaluates to a **single value**. | `a + b * 2`, `x > 10`, `Math.sqrt(16)` |
| **Statement** | A complete unit of execution terminated with a semicolon (`;`). | `int a = 10;`, `System.out.println(a);` |
| **Block** | A sequence of zero or more statements enclosed within curly braces `{ }`. | `{ int temp = a; a = b; b = temp; }` |

### Expression Types:

1. **Arithmetic Expression**: Evaluates to a number (`int`, `double`, etc.).
   ```java
   int result = (10 + 5) * 2; // 30
   ```
2. **Relational / Boolean Expression**: Evaluates to `true` or `false`.
   ```java
   boolean isEligible = (age >= 18) && (hasLicense == true);
   ```
3. **Assignment Expression**: Evaluates to the assigned value.
   ```java
   int x;
   int y = (x = 50); // x is assigned 50, and expression (x = 50) evaluates to 50
   ```

### Type Promotion Rules in Expressions

When evaluating expressions with multiple data types:

1. **Byte / Short / Char Promotion**: All `byte`, `short`, and `char` operands are automatically promoted to `int` before arithmetic operations.
   ```java
   byte b1 = 10, b2 = 20;
   // byte b3 = b1 + b2; // COMPILE ERROR: (b1 + b2) produces an int
   int b3 = b1 + b2;      // Correct
   ```
2. **Dominant Operand Promotion**: If an expression contains mixed numeric types, the entire expression promotes to the highest-precision type:
   $$\text{byte, short, char} \longrightarrow \text{int} \longrightarrow \text{long} \longrightarrow \text{float} \longrightarrow \text{double}$$

---

## 4. User Input Handling: Scanner vs. BufferedReader

### 1. The `java.util.Scanner` Class

`Scanner` parses primitive types and strings using regular expressions over tokens (delimited by whitespace by default).

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

System.out.print("Enter integer: ");
int n = sc.nextInt();

System.out.print("Enter single word: ");
String word = sc.next();

System.out.print("Enter full sentence: ");
sc.nextLine(); // Consume residual newline if preceding was nextInt()/next()
String sentence = sc.nextLine();

sc.close();
```

### 2. The Classic Scanner Buffer Pitfall & Solutions

#### The Problem:
`nextInt()`, `nextDouble()`, and `next()` read only their target token and **leave the newline character (`\n`)** sitting in the input stream. When `nextLine()` is called immediately afterwards, it encounters and consumes this leftover `\n` and returns an **empty string**.

```
Input Stream Buffer: [ "42" ][ "\n" ][ "Purvi Singhal" ][ "\n" ]
sc.nextInt()  ──> reads "42", leaves "\n" in buffer
sc.nextLine() ──> reads "\n" immediately -> Returns "" (SKIPS USER INPUT!)
```

#### Solution 1: Consume the Trailing Newline
```java
int age = sc.nextInt();
sc.nextLine(); // Flush / consume leftover '\n'
String name = sc.nextLine(); // Now correctly waits for user input
```

#### Solution 2: Read All Input via `nextLine()` and Parse (Best Practice)
```java
int age = Integer.parseInt(sc.nextLine().trim());
String name = sc.nextLine();
```

---

### 3. Fast I/O: `BufferedReader` & `StringTokenizer`

For competitive programming, massive datasets, or high-throughput systems, `Scanner` is slow because of regex overhead and a small 1KB buffer. `BufferedReader` utilizes an **8KB internal character buffer** and direct stream reads.

```
Scanner:        Stream -> Regex Parser -> Token (Slow for 10^5+ inputs)
BufferedReader: Stream -> 8KB Buffer -> Direct Char Array -> Fast Tokenizer
```

#### Fast I/O Implementation:
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FastIOExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Reading full line
        String line = br.readLine();
        
        // Tokenizing space-separated values (e.g., "10 20 30 40")
        StringTokenizer st = new StringTokenizer(line);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        System.out.println("Sum: " + (a + b));
    }
}
```

### Comparison Matrix: `Scanner` vs `BufferedReader`

| Feature | `java.util.Scanner` | `java.io.BufferedReader` |
| :--- | :--- | :--- |
| **Package** | `java.util` | `java.io` |
| **Buffer Size** | 1 KB buffer | 8 KB buffer (8x larger) |
| **Parsing** | Built-in regex parsing (`nextInt`, `nextDouble`) | Reads raw strings (`readLine`), manual parsing needed |
| **Speed / Performance** | Slower (high parsing overhead) | **Significantly Faster** (~10x-20x) |
| **Thread Safety** | Not synchronized (not thread-safe) | Synchronized (thread-safe) |
| **Exception Handling** | Hides `IOException` internally | Requires handling `IOException` (`throws` or `try-catch`) |
| **Best Use Case** | Small interactive console applications | Large inputs, Competitive Programming, File I/O |

---

## 5. Variable Scope, Shadowing & Lifetime

**Scope** refers to the region of the program where a variable is accessible by its identifier.

```
+-------------------------------------------------------------------+
| Class / Static Scope                                              |
| static int globalCount = 0;                                       |
|                                                                   |
|   +-------------------------------------------------------------+ |
|   | Instance Scope (Field)                                      | |
|   | int instanceVal = 100;                                      | |
|   |                                                             | |
|   |   +-------------------------------------------------------+ | |
|   |   | Method Scope                                          | | |
|   |   | void calculate(int param) {                           | | |
|   |   |                                                       | | |
|   |   |     +-----------------------------------------------+ | | |
|   |   |     | Block Scope                                   | | |
|   |   |     | {                                             | | |
|   |   |     |     int blockTemp = 50;                       | | |
|   |   |     | }                                             | | |
|   |   |     +-----------------------------------------------+ | | |
|   |   | }                                                     | | |
|   |   +-------------------------------------------------------+ | |
|   +-------------------------------------------------------------+ |
+-------------------------------------------------------------------+
```

### 1. The 4 Scope Levels

1. **Block Scope**: Declared inside `{ ... }`. Visible only from declaration to closing brace `}`.
   ```java
   {
       int blockVar = 10;
       System.out.println(blockVar); // Accessible
   }
   // System.out.println(blockVar);  // COMPILE ERROR: blockVar out of scope
   ```
2. **Method / Local Scope**: Declared inside a method (including parameters). Alive during method execution on the stack.
3. **Instance / Field Scope**: Declared inside a class but outside methods (without `static`). Belongs to the object instance.
4. **Static / Class Scope**: Declared with `static`. Belongs to the class itself and shared across all instances.

---

### 2. Variable Shadowing

**Shadowing** occurs when a variable declared within a narrower scope has the same name as a variable declared in an outer scope.

#### Local Variable Shadowing Instance Field:
```java
public class ShadowExample {
    int count = 10; // Instance field

    void display() {
        int count = 99; // Shadows instance variable 'count'
        System.out.println("Local count: " + count);          // 99
        System.out.println("Instance count: " + this.count);  // 10
    }
}
```

> [!NOTE]
> In Java, **nested local variables cannot shadow outer local variables** in the same method.
> ```java
> int x = 10;
> {
>     int x = 20; // COMPILE ERROR: Variable 'x' is already defined in scope
> }
> ```

---

### 3. Scope vs. Lifetime

| Aspect | Variable Scope (Visibility) | Variable Lifetime (Duration) |
| :--- | :--- | :--- |
| **Definition** | Where in the code the variable can be referenced. | How long the variable exists in computer memory. |
| **Local Variables** | From declaration point to the end of enclosing block `{}`. | Allocated when stack frame is pushed, deallocated when stack frame is popped. |
| **Instance Fields** | Accessible anywhere inside the class (via `this`). | Exists as long as the containing object lives on the **Heap**. |
| **Static Fields** | Accessible anywhere the class is loaded. | Exists throughout the entire duration of the application/class lifecycle. |

---

## 6. Directory Files & Examples

| File | Concept Covered |
| :--- | :--- |
| [`LiteralsDemo.java`](./LiteralsDemo.java) | Binary `0b`, Octal `0`, Hex `0x`, scientific floats, unicode chars, underscore separators. |
| [`ExpressionsDemo.java`](./ExpressionsDemo.java) | Arithmetic/logical expressions, operand evaluation order, implicit type promotion. |
| [`ScannerInputDemo.java`](./ScannerInputDemo.java) | Comprehensive Scanner usage, resolving the `nextInt()` buffer trap. |
| [`FastIODemo.java`](./FastIODemo.java) | High-speed I/O using `BufferedReader` and `StringTokenizer`. |
| [`ScopeAndShadowingDemo.java`](./ScopeAndShadowingDemo.java) | Block scope, method scope, instance shadowing, and `this` reference. |

---

## 7. Practice Questions

| Problem | File | Description |
| :--- | :--- | :--- |
| **Q1: Literal Inspector** | [`questions/Q1_LiteralInspector.java`](./questions/Q1_LiteralInspector.java) | Parse binary/hex/octal representations and format numbers with underscores. |
| **Q2: Robust Profile Form** | [`questions/Q2_ProfileForm.java`](./questions/Q2_ProfileForm.java) | Interactive form reading mixed integer, float, and multi-word string input safely. |
| **Q3: Fast Matrix Sum** | [`questions/Q3_FastMatrixSum.java`](./questions/Q3_FastMatrixSum.java) | Read multiple lines of space-delimited integers via `BufferedReader` and sum them. |
| **Q4: Scope Tracer Challenge** | [`questions/Q4_ScopeTracer.java`](./questions/Q4_ScopeTracer.java) | Trace variable shadowing and block scopes with nested contexts. |

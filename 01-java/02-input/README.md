# Module 02: Java User Input & Variable Scope

> Comprehensive guide covering Java Input Systems (`Scanner` vs. `BufferedReader` Fast I/O) and Variable Scope Architecture (Local Variables, Block Scope, Class-Level Fields, and Variable Shadowing).

---

## 1. Overview & Architecture

Understanding how data enters a Java program (**Input Streams**) and how long variables survive and where they are visible (**Variable Scope**) is essential for writing robust, bug-free applications.

```
+-----------------------------------------------------------------------------+
|                     JAVA INPUT & SCOPE ARCHITECTURE                         |
|                                                                             |
|  [ Standard Input Stream: System.in ]                                       |
|   ├── Scanner (Regex token parsing, easy interactive I/O)                   |
|   └── BufferedReader (8KB fast character buffer for large data streams)     |
|                                                                             |
|  [ Variable Scopes Hierarchy ]                                              |
|   ├── Class-Level / Static Scope   (Class lifecycle, Method Area/Heap)      |
|   │   └── Instance / Member Scope  (Object lifecycle on Heap)               |
|   │       └── Method / Local Scope (Stack Frame execution)                  |
|   │           └── Block Scope {}   (Inner block lifecycle within frame)     |
|                                                                             |
|  [ Variable Shadowing ]                                                     |
|   └── Local variable hides Outer Field (Resolved via 'this' / ClassName)    |
+-----------------------------------------------------------------------------+
```

---

## 2. Java User Input Handling

Java communicates with the operating system standard input stream via `System.in` (`InputStream`).

### 1. `java.util.Scanner` Class

The `Scanner` class is the standard utility for parsing primitive data types and strings token-by-token using regular expressions.

#### Common Scanner Methods:
| Method | Description | Input Example | Stored Type |
| :--- | :--- | :--- | :--- |
| `sc.next()` | Reads next token up to whitespace delimiter | `"Purvi"` | `String` |
| `sc.nextLine()` | Reads full line including spaces until `\n` | `"Purvi Singhal 2026"` | `String` |
| `sc.nextInt()` | Reads integer token | `42` | `int` |
| `sc.nextLong()` | Reads 64-bit integer | `9876543210` | `long` |
| `sc.nextFloat()` | Reads 32-bit floating-point | `99.5` | `float` |
| `sc.nextDouble()` | Reads 64-bit floating-point | `3.14159` | `double` |
| `sc.nextBoolean()`| Reads boolean token (`true`/`false`) | `true` | `boolean` |

---

### 2. The Classic Scanner Buffer Trap & Solution

#### Why does `nextLine()` get skipped after `nextInt()` / `nextFloat()`?
`nextInt()` and `nextFloat()` read only the digits from the input stream, **leaving the newline character (`\n`) in the buffer**. When `nextLine()` is subsequently called, it immediately consumes that lingering `\n` and returns an empty string without waiting for user input.

```
User enters: "25 [Enter]"
Buffer State:  [ '2' ][ '5' ][ '\n' ]
sc.nextInt()   --> Reads '2''5' (Returns 25)
Buffer State:  [ '\n' ] (Lingering!)
sc.nextLine()  --> Immediately consumes '\n' and finishes -> Returns "" (SKIPPED!)
```

#### The Fix:
```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter Age: ");
int age = sc.nextInt();
sc.nextLine(); // Clear the leftover newline '\n'

System.out.print("Enter Full Name: ");
String name = sc.nextLine(); // Works perfectly!
```

---

### 3. Fast I/O: `BufferedReader` & `StringTokenizer`

For competitive programming, big data, or high-throughput servers, `Scanner` is slow due to heavy regular expression parsing and a small 1KB buffer. `BufferedReader` provides an **8KB character buffer** and direct stream reading.

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
        
        // Tokenize space-separated integers (e.g. "10 20 30")
        StringTokenizer st = new StringTokenizer(line);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        System.out.println("Sum = " + (a + b));
    }
}
```

#### Comparison: `Scanner` vs `BufferedReader`

| Feature | `Scanner` | `BufferedReader` |
| :--- | :--- | :--- |
| **Package** | `java.util` | `java.io` |
| **Buffer Size** | 1 KB | **8 KB (8x larger)** |
| **Speed** | Slower (Regex overhead) | **~10x - 20x Faster** |
| **Thread Safety** | Not Synchronized | Synchronized (Thread-safe) |
| **Exception Handling** | Swallows `IOException` | Requires `IOException` handling |

---

## 3. Variable Scope in Java

**Scope** determines where in the program a variable can be accessed by its name. **Lifetime** determines how long that variable remains allocated in memory.

```
+-----------------------------------------------------------------------+
| 1. CLASS / STATIC LEVEL SCOPE                                         |
|    static int globalTracker = 0; // Lifetime: entire app runtime      |
|                                                                       |
|    +----------------------------------------------------------------+ |
|    | 2. INSTANCE / CLASS LEVEL SCOPE                                | |
|    |    int objectId = 101;      // Lifetime: object on Heap        | |
|    |                                                                | |
|    |    +---------------------------------------------------------+ | |
|    |    | 3. METHOD / LOCAL SCOPE                                 | | |
|    |    |    void calculate(int parameter) {                      | | |
|    |    |        int localSum = 0; // Lifetime: method stack frame| | |
|    |    |                                                         | | |
|    |    |        +----------------------------------------------+ | | |
|    |    |        | 4. BLOCK SCOPE                               | | |
|    |    |        |    {                                         | | |
|    |    |        |        int blockTemp = 50; // Inside { } only| | |
|    |    |        |    }                                         | | |
|    |    |        +----------------------------------------------+ | | |
|    |    |    }                                                    | | |
|    |    +---------------------------------------------------------+ | |
|    +----------------------------------------------------------------+ |
+-----------------------------------------------------------------------+
```

---

### 1. The 4 Scope Levels

#### A. Local Variable Scope (Method Scope)
- Declared inside a method or passed as a method parameter.
- **Accessible**: Only inside the method from the declaration point downwards.
- **Lifetime**: Created when method is invoked (stack frame pushed); destroyed when method finishes (stack frame popped).
- **Default Value**: **None**. Must be explicitly initialized before use, otherwise compiler throws an error.

#### B. Block Scope (`{ ... }`)
- Declared inside any pair of curly braces `{}` (such as `if`, `for`, `while`, or independent block).
- **Accessible**: Only within that enclosing block.
- **Lifetime**: Destroyed once execution exits the block.

```java
{
    int blockVar = 99;
    System.out.println(blockVar); // Accessible
}
// System.out.println(blockVar);  // COMPILE ERROR: blockVar out of scope
```

#### C. Class-Level: Instance Variables (Fields)
- Declared inside the class body but outside any method (without `static`).
- **Accessible**: By all non-static methods in the class.
- **Lifetime**: Exists as long as the containing object exists on the **Heap**.
- **Default Value**: Automatically initialized (`0` for numbers, `false` for boolean, `null` for objects).

#### D. Class-Level: Static Variables
- Declared inside the class with the `static` keyword.
- **Accessible**: Everywhere in the class and outside via `ClassName.variableName`.
- **Lifetime**: Loaded when class is initialized by JVM ClassLoader; destroyed when class is unloaded.

---

### 2. Variable Shadowing

**Variable Shadowing** occurs when a variable declared in an inner scope (e.g., local variable or method parameter) has the same name as a variable in an outer scope (e.g., instance field).

```java
public class ShadowDemo {
    int count = 10; // Instance field

    public void update(int count) { // Parameter shadows field 'count'
        System.out.println("Local count: " + count);         // Prints method parameter
        System.out.println("Instance count: " + this.count); // Accesses instance field
        
        this.count = count; // Resolves ambiguity using 'this'
    }
}
```

> [!NOTE]
> In Java, **nested local variables cannot shadow outer local variables** within the same method:
> ```java
> int x = 10;
> {
>     int x = 20; // COMPILE ERROR: Variable 'x' is already defined in scope
> }
> ```

---

## 4. Scope vs. Lifetime Summary

| Scope Type | Where Declared | Accessibility (Scope) | Memory Location | Lifetime | Default Value |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **Block Variable** | Inside `{ ... }` | Within enclosing block only | Stack Frame | Until block exits | No (must initialize) |
| **Local / Method Variable** | Inside method / parameter | Within enclosing method | Stack Frame | Method execution | No (must initialize) |
| **Instance Field** | Inside class (no `static`) | Entire class / object | Heap (with object) | As long as object lives | Yes (`0`, `null`, `false`) |
| **Static Field** | Inside class (with `static`)| Everywhere across instances | Method Area / Heap | Program run lifecycle | Yes (`0`, `null`, `false`) |

---

## 5. Code Demos & Practice Directory

| File | Type | Description |
| :--- | :--- | :--- |
| [`input.java`](./input.java) | Demo | Basic Scanner integer, float, string input and arithmetic sum. |
| [`product.java`](./product.java) | Demo | Scanner product and Circle area computation. |
| [`ScannerInputDemo.java`](./ScannerInputDemo.java) | Demo | Comprehensive multi-type Scanner usage with newline buffer flush fix. |
| [`FastIODemo.java`](./FastIODemo.java) | Demo | High-performance I/O with `BufferedReader` and `StringTokenizer`. |
| [`ScopeAndShadowingDemo.java`](./ScopeAndShadowingDemo.java) | Demo | Local, block, instance, and static scopes with variable shadowing. |
| [`questions/`](./questions/README.md) | Practice | Full set of input calculations and scope tracing exercises. |

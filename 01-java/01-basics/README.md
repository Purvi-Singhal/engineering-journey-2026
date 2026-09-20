# Module 01: Java Basics & Data Types

> Core Java foundations, JVM architecture, program anatomy, variables, primitive & reference data types, user input, and type casting.

---

## 1. What is Java?

**Java** is a high-level, class-based, object-oriented programming language designed to have minimal implementation dependencies.

### Key Characteristics:
- **Platform Independent (WORA)**: Follows the philosophy of *"Write Once, Run Anywhere"*. Source code compiles into platform-neutral bytecode (`.class`) executed on any system with a Java Virtual Machine (JVM).
- **Object-Oriented**: Built around classes, objects, encapsulation, inheritance, and polymorphism.
- **Robust & Secure**: Automatic memory management (Garbage Collection), exception handling, and strict compile-time and runtime type checking.

---

## 2. Java Runtime Architecture: JDK vs. JRE vs. JVM

```
+-----------------------------------------------------------------------+
|  JDK (Java Development Kit)                                           |
|  [Development Tools: javac compiler, java launcher, javadoc, jdb]     |
|                                                                       |
|  +-----------------------------------------------------------------+  |
|  |  JRE (Java Runtime Environment)                                 |  |
|  |  [Core Libraries (java.lang, java.util), Runtime Support Files] |  |
|  |                                                                 |  |
|  |  +-----------------------------------------------------------+  |  |
|  |  |  JVM (Java Virtual Machine)                               |  |  |
|  |  |  [ClassLoader, Bytecode Verifier, Execution Engine(JIT)] |  |  |
|  |  +-----------------------------------------------------------+  |  |
|  +-----------------------------------------------------------------+  |
+-----------------------------------------------------------------------+
```

| Component | Full Name | Purpose | What it Contains |
| :--- | :--- | :--- | :--- |
| **JVM** | Java Virtual Machine | Executes the compiled bytecode (`.class` files) on host OS. | ClassLoader, Memory Areas (Heap, Stack, Method Area), JIT Compiler, Garbage Collector. |
| **JRE** | Java Runtime Environment | Provides runtime environment to run Java programs. | JVM + Core Class Libraries + Supporting Files. |
| **JDK** | Java Development Kit | Complete development environment to build & run Java applications. | JRE + Development tools (`javac`, `jar`, `javadoc`, debugger). |

---

## 3. Anatomy of a Java Program

```java
public class JavaBasics {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

### Breakdown of Keywords & Components:
1. **`public class JavaBasics`**:
   - `public`: Access modifier allowing the class to be accessed globally.
   - `class`: Keyword used to declare a class.
   - `JavaBasics`: Name of the class. Must match the filename (`JavaBasics.java`).
2. **`public static void main(String[] args)`**:
   - `public`: Accessible to the JVM from outside the class.
   - `static`: Allows JVM to call the method without creating an instance/object of the class.
   - `void`: Return type indicating no value is returned.
   - `main`: Entry-point method recognized by the JVM.
   - `String[] args`: Command-line arguments passed as an array of strings.
3. **`System.out.println()`**:
   - `System`: Built-in class in `java.lang`.
   - `out`: Static member representing standard output stream (`PrintStream`).
   - `println()`: Method to print data to the console with a trailing newline.

---

## 4. Variables & Identifiers

A **variable** is a named memory location to store data during program execution.

### Rules for Identifiers:
- Can contain letters (`a-z`, `A-Z`), digits (`0-9`), underscores (`_`), and dollar signs (`$`).
- **Cannot start with a digit** (e.g., `1variable` is invalid; `variable1` is valid).
- Java is **case-sensitive** (`age` and `Age` are different variables).
- Cannot use Java **reserved keywords** (`int`, `class`, `public`, `static`, etc.).
- Follow camelCase naming convention for variables (e.g., `totalPrice`, `studentName`).

---

## 5. Data Types in Java

Java is a **statically typed** language, meaning every variable must be declared with a data type before use.

### Primitive Data Types (8 Types)

| Data Type | Size (Bytes) | Size (Bits) | Range / Values | Default Value | Example |
| :--- | :--- | :--- | :--- | :--- | :--- |
| `byte` | 1 byte | 8 bits | -128 to 127 | `0` | `byte b = 8;` |
| `short` | 2 bytes | 16 bits | -32,768 to 32,767 | `0` | `short s = 240;` |
| `char` | 2 bytes | 16 bits | `\u0000` to `\uffff` (Unicode characters) | `'\u0000'` | `char ch = 'a';` |
| `boolean` | JVM-dependent | 1 bit logical | `true` or `false` | `false` | `boolean isPass = true;` |
| `int` | 4 bytes | 32 bits | -2,147,483,648 to 2,147,483,647 | `0` | `int count = 25;` |
| `long` | 8 bytes | 64 bits | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | `0L` | `long bigNum = 100000L;` |
| `float` | 4 bytes | 32 bits | Up to 7 decimal digits precision | `0.0f` | `float price = 10.5f;` |
| `double` | 8 bytes | 64 bits | Up to 15 decimal digits precision | `0.0d` | `double temp = 98.6;` |

### Non-Primitive / Reference Types
- **`String`**: Sequence of characters enclosed in double quotes (e.g., `String name = "Purvi Singhal";`).
- Arrays, Classes, Interfaces.

---

## 6. Type Conversion & Type Casting

### 1. Widening / Implicit Conversion (Automatic)
Occurs when converting a smaller data type to a larger data type without data loss.
- **Conversion Order**: `byte` -> `short` -> `int` -> `long` -> `float` -> `double`
```java
int a = 25;
long b = a;     // Valid: int automatically converted to long
```

### 2. Narrowing / Explicit Casting (Manual)
Occurs when converting a larger data type to a smaller data type. Requires explicit cast syntax `(targetType)` and may result in precision/data loss.
```java
float marks = 99.99f;
int truncatedMarks = (int) marks; // Truncated to 99
```

### 3. Type Promotion in Expressions
In arithmetic expressions:
- Java automatically promotes `byte`, `short`, and `char` operands to `int`.
- If one operand is `long`, `float`, or `double`, the whole expression is promoted to `long`, `float`, or `double` respectively.

---

## 7. Code Examples & Directory Files

| File | Concept Covered |
| :--- | :--- |
| [`JavaBasics.java`](./JavaBasics.java) | Output formatting with `println` and `print`, pattern printing. |
| [`HelloEngineering.java`](./HelloEngineering.java) | Basic program structure and class declaration. |
| [`PersonalInfo.java`](./PersonalInfo.java) | Variable declarations (`String`, `int`) and concatenation. |
| [`datatypes.java`](./datatypes.java) | Primitive data types demonstration (`byte`, `char`, `boolean`, `int`, `double`, `short`). |
| [`variables.java`](./variables.java) | Variable assignment, re-assignment, and value swapping/modification. |
| [`typec.java`](./typec.java) | Comprehensive type casting, char-to-int ASCII conversions, and type promotion. |

> [!NOTE]
> Detailed user input handling (`Scanner`, `BufferedReader`, Fast I/O) is covered in [**Module 02: User Input**](../02-input/README.md).

---

## 8. Practice Questions

| Problem | File | Description |
| :--- | :--- | :--- |
| **Q1: Type Promotion Test** | [`questions/q4.java`](./questions/q4.java) | Tests output data types for expressions with mixed primitive types. |
| **Q2: Temperature Converter** | [`questions/TemperatureConverter.java`](./questions/TemperatureConverter.java) | Converts Celsius temperature to Fahrenheit using floating point arithmetic. |


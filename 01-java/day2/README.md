# Day 2: Java Fundamentals & Core Concepts

> A structured breakdown of Java basics, the runtime architecture (JDK, JRE, JVM), program anatomy, variables, data types, and basic operators.

---

## 1. What is Java?

**Java** is a high-level, class-based, object-oriented programming language designed to have as few implementation dependencies as possible. 

### Key Characteristics:
- **Platform Independent**: Follows the philosophy of *"Write Once, Run Anywhere"* (WORA). Java code compiles into platform-neutral bytecode rather than machine-specific native machine code.
- **Object-Oriented**: Everything in Java revolves around objects and classes.
- **Robust & Secure**: Features automatic memory management (Garbage Collection) and strong type-checking at compile and runtime.

---

## 2. Java Runtime Architecture: JDK vs. JRE vs. JVM

Understanding the execution lifecycle and the core components of the Java platform is essential:

```
+-----------------------------------------------------------------------+
|  JDK (Java Development Kit)                                           |
|  [Development Tools: javac, jar, javadoc, debugger, etc.]             |
|                                                                       |
|  +-----------------------------------------------------------------+  |
|  |  JRE (Java Runtime Environment)                                 |  |
|  |  [Core Libraries, Utility Packages, Runtime Support Files]      |  |
|  |                                                                 |  |
|  |  +-----------------------------------------------------------+  |  |
|  |  |  JVM (Java Virtual Machine)                               |  |  |
|  |  |  [Class Loader, Bytecode Verifier, Execution Engine(JIT)] |  |  |
|  |  +-----------------------------------------------------------+  |  |
|  +-----------------------------------------------------------------+  |
+-----------------------------------------------------------------------+
```

### Component Breakdown

| Component | Full Name | Purpose | What it Contains |
| :--- | :--- | :--- | :--- |
| **JVM** | Java Virtual Machine | Executes the compiled bytecode (`.class` files) on the host OS. | ClassLoader, Memory areas (Stack, Heap), Execution Engine, JIT Compiler, Garbage Collector. |
| **JRE** | Java Runtime Environment | Provides the environment necessary to run Java applications. | JVM + Core Class Libraries (e.g., `java.lang`, `java.util`) + supporting files. |
| **JDK** | Java Development Kit | Complete software development environment to create and run Java apps. | JRE + Development tools (`javac` compiler, `java` launcher, debuggers, `javadoc`). |

---

## 3. Anatomy of a Java Program

Here is the standard structure of a basic Java application:

```java
public class HelloEngineering {
    public static void main(String[] args) {
        System.out.println("Hello Engineering");
    }
}
```

### Key Elements Explained:

1. **`public class HelloEngineering`**:
   - `public`: Access modifier making the class accessible from anywhere.
   - `class`: Keyword used to declare a class in Java.
   - `HelloEngineering`: The identifier/name of the class. In Java, public class names must match the file name (`HelloEngineering.java`).

2. **`public static void main(String[] args)`**:
   - The entry point for any standalone Java application. The JVM begins execution here.
   - `public`: Accessible to the JVM from outside the class.
   - `static`: Allows the JVM to invoke the method without needing to instantiate an object of the class.
   - `void`: Return type indicating that the method returns no value.
   - `main`: The designated method name recognized by the JVM.
   - `String[] args`: Command-line arguments passed as an array of strings.

3. **`System.out.println()`**:
   - `System`: A built-in class in the `java.lang` package containing standard system utilities.
   - `out`: A static member field of `System` representing the standard output stream (`PrintStream`).
   - `println()`: A method that prints the passed content to the console followed by a new line.

---

## 4. Variables & Data Types

A **variable** is a named memory location used to store data during program execution. Every variable must have a declared data type.

### Primitive Data Types

Java has 8 primitive data types; the fundamental types learned today include:

| Type | Size | Description | Example |
| :--- | :--- | :--- | :--- |
| `int` | 4 bytes (32-bit) | Stores whole numbers from -2,147,483,648 to 2,147,483,647 | `int age = 19;` |
| `double` | 8 bytes (64-bit) | Stores fractional numbers (15-17 decimal digits precision) | `double celsius = 19.9;` |
| `char` | 2 bytes (16-bit) | Stores a single Unicode character enclosed in single quotes | `char grade = 'A';` |
| `boolean` | 1 bit (logical) | Stores binary state: `true` or `false` | `boolean isEnrolled = true;` |

### Non-Primitive / Reference Types

- **`String`**: An object that represents a sequence of characters enclosed in double quotes (e.g., `String name = "Purvi Singhal";`). Unlike primitives, `String` comes with built-in utility methods for text manipulation.

---

## 5. Basic Operators

Operators are special symbols used to perform operations on variables and values.

### 1. Arithmetic Operators
Used for mathematical calculations:
- `+` (Addition): Adds two values (`a + b`) or concatenates strings (`"Hello " + name`).
- `-` (Subtraction): Subtracts right operand from left (`a - b`).
- `*` (Multiplication): Multiplies two values (`celsius * 9`).
- `/` (Division): Divides numerator by denominator (`9 / 5`).
- `%` (Modulus): Returns the division remainder (`10 % 3` yields `1`).

### 2. Assignment Operators
Used to assign values to variables:
- `=` (Simple Assignment): `int age = 19;`
- Compound assignment operators: `+=`, `-=`, `*=`, `/=`, `%=` (e.g., `x += 5` is equivalent to `x = x + 5`).

### 3. Relational (Comparison) Operators
Used to compare two values, returning a `boolean` result:
- `==` (Equal to)
- `!=` (Not equal to)
- `>` (Greater than)
- `<` (Less than)
- `>=` (Greater than or equal to)
- `<=` (Less than or equal to)

### 4. Logical Operators
Used to determine logic between variables or conditions:
- `&&` (Logical AND): Returns `true` if both statements are true.
- `||` (Logical OR): Returns `true` if at least one statement is true.
- `!` (Logical NOT): Inverts the boolean result (`!true` is `false`).

---

## 6. Code Examples & Implementations

The exercises implemented in this directory demonstrate these concepts:

| File | Key Concepts Demonstrated |
| :--- | :--- |
| [`HelloEngineering.java`](./HelloEngineering.java) | Basic program structure, class declaration, `main` entry point, standard console output. |
| [`PersonalInfo.java`](./PersonalInfo.java) | Variable declaration (`String`, `int`), string concatenation with the `+` operator. |
| [`TemperatureConverter.java`](./TemperatureConverter.java) | Floating-point arithmetic (`double`), mathematical formulas, operator precedence. |

---

## 7. Key Takeaways & Summary

1. **Compilation vs Execution**: Source code (`.java`) is compiled by `javac` into bytecode (`.class`), which is interpreted and executed by the `JVM`.
2. **Strict Typing**: Every variable must have an explicitly defined type before assignment.
3. **Execution Entry**: Execution strictly begins at `public static void main(String[] args)`.
4. **Expression Evaluation**: Standard operator precedence applies in mathematical expressions (e.g., multiplication and division evaluate before addition).

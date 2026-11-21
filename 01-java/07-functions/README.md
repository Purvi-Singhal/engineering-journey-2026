# ⚙️ Chapter 7: Functions & Methods

A **function** (called a **method** in Java because it is defined inside a class) is a reusable block of code designed to perform a specific task. Methods improve modularity, eliminate repetitive code, and make programs easier to test and maintain.

---

## 📑 Table of Contents
- [1. Overview & Call Stack Flow](#1-overview--call-stack-flow)
- [2. Method Syntax & Anatomy](#2-method-syntax--anatomy)
- [3. Parameters vs. Arguments](#3-parameters-vs-arguments)
- [4. Return Types (`void` vs. Value-Returning Methods)](#4-return-types-void-vs-value-returning-methods)
- [5. Call by Value in Java & Memory Behavior](#5-call-by-value-in-java--memory-behavior)
- [6. Code Files Overview](#6-code-files-overview)
- [7. How to Compile & Run](#7-how-to-compile--run)

---

## 1. Overview & Call Stack Flow

When a method is called from `main()`, execution pauses in `main()`, jumps to the called method, executes its body, and returns control (along with any return value) back to `main()`.

```
     main() Execution (Caller)                  add(num1, num2) (Callee)
   ┌───────────────────────────┐             ┌───────────────────────────┐
   │ int a = 10, b = 30;       │             │                           │
   │ int result = add(a, b); ──┼────────────►│ num1 = 10, num2 = 30      │
   │                           │   Passes    │ int sum = num1 + num2;    │
   │                           │   Copies    │ return sum; (40)          │
   │         (result = 40)   ◄─┼─────────────┼───┘                       │
   │ System.out.println(result)│   Returns   │                           │
   └───────────────────────────┘    Value    └───────────────────────────┘
```

---

## 2. Method Syntax & Anatomy

```java
modifier returnType methodName(DataType param1, DataType param2) {
    // Method body (statements)
    return value; // Required if returnType is not void
}
```

- **`modifier` (`public static` / `static`)**: `static` allows the method to be called directly from `public static void main` without creating an object of the class.
- **`returnType`**: The data type of the value sent back to the caller (`int`, `double`, `String`, etc.), or `void` if nothing is returned.
- **`methodName`**: Identifier used to invoke the method (conventionally written in `camelCase`).
- **Parameter List**: Comma-separated input variables enclosed in parentheses `()`.

---

## 3. Parameters vs. Arguments

| Term | Where It Appears | Definition | Example |
|---|---|---|---|
| **Parameters** *(Formal Parameters)* | Method **Declaration / Definition** | Variables listed in the method header that act as placeholders for incoming values. | `static int add(int num1, int num2)` |
| **Arguments** *(Actual Parameters)* | Method **Call / Invocation** | Actual values or variables passed into the method when calling it. | `int result = add(a, b);` or `add(10, 20);` |

---

## 4. Return Types (`void` vs. Value-Returning Methods)

1. **`void` Methods**: Perform an action (like printing to console) and do not return any value to the caller.
   ```java
   static void greet() {
       System.out.println("Welcome to Java.");
   }
   ```
2. **Value-Returning Methods**: Compute a result and use the `return` keyword to send a value matching the declared return type back to the caller.
   ```java
   static int product(int num1, int num2) {
       int multiply = num1 * num2;
       return multiply;
   }
   ```

---

## 5. Call by Value in Java & Memory Behavior

> [!IMPORTANT]
> **Java always uses Call by Value.**
> When you pass a variable as an argument to a method, Java passes a **copy of the variable's value** to the method parameter.

Because the method receives its own independent copy in stack memory:
- Modifying the parameter inside the called method **only changes the local copy**.
- The original variable inside `main()` remains **unchanged**.

```
   Stack Frame: main()                     Stack Frame: swapping(a, b)
 ┌─────────────────────┐                 ┌─────────────────────────────┐
 │  x = 10             │ ──(Copy: 10)──► │  a = 10  ──► swapped to 20  │
 │  y = 20             │ ──(Copy: 20)──► │  b = 20  ──► swapped to 10  │
 │  (Still x=10, y=20) │                 │  (Destroyed when method ends)│
 └─────────────────────┘                 └─────────────────────────────┘
```

---

## 6. Code Files Overview

| File | Topic / Concept | Description |
|---|---|---|
| [`functions.java`](functions.java) | Basic `void` Method | Defines and invokes a reusable `greet()` method with no parameters and `void` return type. |
| [`functionParameter.java`](functionParameter.java) | Parameters & Arguments | Demonstrates passing integer arguments `(10, 20)` to a parameterized `add(int a, int b)` method. |
| [`funcReturn.java`](funcReturn.java) | `return` Keyword | Computes the sum of two numbers inside `add(int a, int b)` and returns the integer result to `main()`. |
| [`funcAdd.java`](funcAdd.java) | Dynamic Input + Return | Reads two numbers via `Scanner`, passes them to `add(num1, num2)`, and prints the returned sum. |
| [`funcMultiply.java`](funcMultiply.java) | Product Method | Takes two user-input integers and returns their product via `product(num1, num2)`. |
| [`funcFactorial.java`](funcFactorial.java) | Factorial Method ($n!$) | Computes and returns the factorial of a user-provided number using a `for` loop inside `factorial(int num)`. |
| [`callByValue.java`](callByValue.java) | Call by Value Proof | Shows that reassigning parameter `x = 100` inside `change(int x)` leaves original variable `a = 10` in `main()` unchanged. |
| [`swap.java`](swap.java) | Call by Value in Swapping | Swaps `a` and `b` using a `temp` variable inside `swapping(int a, int b)` and proves `x` and `y` in `main()` remain unaltered. |

---

## 7. How to Compile & Run

```bash
# Compile any file in 07-functions
javac funcFactorial.java

# Run the compiled bytecode
java funcFactorial
```

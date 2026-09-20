# 🚦 Chapter 4: Conditional Statements in Java

Conditional statements (or decision-making statements) allow a Java program to evaluate boolean expressions at runtime and alter execution flow dynamically based on whether conditions evaluate to `true` or `false`.

---

## 📑 Table of Contents
- [1. Overview of Decision Making](#1-overview-of-decision-making)
- [2. The `if` Statement](#2-the-if-statement)
- [3. The `if-else` Statement](#3-the-if-else-statement)
- [4. The `else-if` Ladder](#4-the-else-if-ladder)
- [5. Nested `if-else`](#5-nested-if-else)
- [6. Ternary Operator (`? :`)](#6-ternary-operator--)
- [7. The `switch` Statement](#7-the-switch-statement)
- [8. Repository Programs Overview](#8-repository-programs-overview)
- [9. Practice Questions](#9-practice-questions)
- [10. Best Practices & Common Pitfalls](#10-best-practices--common-pitfalls)

---

## 1. Overview of Decision Making

In Java, control statements decide which block of code gets executed.

```
                  ┌────────────────────────┐
                  │    Condition Check     │
                  └───────────┬────────────┘
                              │
                    ┌─────────┴─────────┐
                 [true]               [false]
                    │                   │
         ┌──────────▼──────────┐ ┌──────▼──────────────┐
         │ Execute True Block  │ │ Execute False Block │
         └──────────┬──────────┘ └──────┬──────────────┘
                    │                   │
                    └─────────┬─────────┘
                              │
                     ┌────────▼────────┐
                     │ Continue Flow   │
                     └─────────────────┘
```

---

## 2. The `if` Statement

The `if` statement executes a code block only when the condition evaluates to `true`.

```java
if (condition) {
    // code executed if condition is true
}
```

---

## 3. The `if-else` Statement

Provides an alternative execution path when the boolean condition evaluates to `false`.

```java
if (condition) {
    // executes when condition is true
} else {
    // executes when condition is false
}
```

**Example Program:** [`oddOreven.java`](oddOreven.java)

---

## 4. The `else-if` Ladder

Used to test multiple conditions in sequential order. The first branch with a condition evaluating to `true` executes; all remaining branches are bypassed.

```java
if (condition1) {
    // branch 1
} else if (condition2) {
    // branch 2
} else if (condition3) {
    // branch 3
} else {
    // default branch when all conditions are false
}
```

**Example Programs:**
- [`ifelse.java`](ifelse.java): Categorize age (Adult, Teenager, Minor).
- [`LargestOfThree.java`](LargestOfThree.java): Find greatest among three numbers.
- [`IncomeTaxCalculator.java`](IncomeTaxCalculator.java): Progressive tax slab calculation.

---

## 5. Nested `if-else`

An `if` statement placed inside another `if` or `else` block to evaluate hierarchical conditions.

```java
if (primaryCondition) {
    if (secondaryCondition) {
        // executes if both conditions are true
    } else {
        // executes if primary is true but secondary is false
    }
}
```

**Example Program:** [`LeapYear.java`](LeapYear.java) (century year vs standard leap year evaluation).

---

## 6. Ternary Operator (`? :`)

A compact one-line shorthand for simple `if-else` evaluations that return a value.

### Syntax:
```java
variable = (condition) ? expressionIfTrue : expressionIfFalse;
```

**Example Program:** [`TernaryOperator.java`](TernaryOperator.java)

---

## 7. The `switch` Statement

The `switch` statement selects one of many code blocks to execute based on the value of a single expression.

### Syntax:
```java
switch (variable) {
    case value1:
        // statement
        break;
    case value2:
        // statement
        break;
    default:
        // default fallback statement
}
```

> **Note:** Supported data types for switch expressions: `byte`, `short`, `char`, `int`, `enum`, and `String` (since Java 7).

**Example Program:** [`Calculator.java`](Calculator.java)

---

## 8. Repository Programs Overview

| File | Primary Concept | Description |
|---|---|---|
| [`ifelse.java`](ifelse.java) | `if-else if-else` | Age verification (Adult, Teenager, Minor). |
| [`largestOf2.java`](largestOf2.java) | `if-else` | Compares two integers to print the larger one. |
| [`oddOreven.java`](oddOreven.java) | Modulo `%` + `if-else` | Checks whether an integer is even or odd. |
| [`LargestOfThree.java`](LargestOfThree.java) | Relational + Logical `&&` | Determines the maximum of three numbers. |
| [`IncomeTaxCalculator.java`](IncomeTaxCalculator.java) | `else-if` Ladder | Calculates income tax across standard income slabs. |
| [`TernaryOperator.java`](TernaryOperator.java) | Ternary `? :` | Inline condition checks for parity and pass/fail status. |
| [`Calculator.java`](Calculator.java) | `switch-case` | Arithmetic calculator supporting `+`, `-`, `*`, `/`, `%`. |
| [`LeapYear.java`](LeapYear.java) | Nested Conditions | Evaluates whether a given calendar year is a leap year. |

---

## 9. Practice Questions

Explore hands-on practice problems in the [`questions/`](questions/) directory:

| # | Question File | Concept |
|---|---|---|
| **Q1** | [`questions/q1.java`](questions/q1.java) | Check if number is positive, negative, or zero |
| **Q2** | [`questions/q2.java`](questions/q2.java) | Fever temperature evaluation |
| **Q3** | [`questions/q3.java`](questions/q3.java) | Print day name (1-7) using `switch-case` |

---

## 10. Best Practices & Common Pitfalls

1. **Avoid Assignment in Conditions**:
   - `if (x = 5)` causes a compiler error in Java for integers, but for booleans `if (isFlag = true)` will accidentally reassign `isFlag`. Always use `==` or boolean variable directly: `if (isFlag)`.
2. **Remember `break` in `switch`**:
   - Omitting `break` triggers **fall-through**, executing all subsequent case blocks unintentionally.
3. **Always Include a Default/Else Case**:
   - Ensures your program gracefully handles unexpected or invalid inputs.
4. **Close Scanners**:
   - Always call `sc.close()` at the end of `main` to release system I/O resources.

---

## 💻 How to Compile and Run

From the root of this folder:

```bash
# Compile any file:
javac Calculator.java

# Run the compiled bytecode:
java Calculator
```

# 🚦 Chapter 4: Conditionals (Decision Making)

Conditional statements in Java allow a program to evaluate boolean expressions at runtime and alter execution flow dynamically based on whether conditions evaluate to `true` or `false`.

---

## 📑 Table of Contents
- [1. Overview](#1-overview)
- [2. The `if` Statement](#2-the-if-statement)
- [3. The `if-else` Statement](#3-the-if-else-statement)
- [4. The `else-if` Ladder](#4-the-else-if-ladder)
- [5. Code Files Overview](#5-code-files-overview)
- [6. How to Compile & Run](#6-how-to-compile--run)

---

## 1. Overview

Control flow statements determine which block of code gets executed based on specific conditions.

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

Executes a specific block of code only if the condition evaluates to `true`.

```java
if (condition) {
    // executes if condition is true
}
```

---

## 3. The `if-else` Statement

Provides a fallback branch (`else`) when the tested condition evaluates to `false`.

```java
if (condition) {
    // executes if condition is true
} else {
    // executes if condition is false
}
```

---

## 4. The `else-if` Ladder

Used to check multiple conditions sequentially. Once a condition evaluates to `true`, its block executes and the rest are bypassed.

```java
if (condition1) {
    // branch 1
} else if (condition2) {
    // branch 2
} else {
    // default branch
}
```

---

## 5. Code Files Overview

| File | Topic / Concept | Description |
|---|---|---|
| [`ifelse.java`](ifelse.java) | `if-else if-else` | Evaluates age to categorize as Adult, Teenager, or Minor. |
| [`elseif.java`](elseif.java) | `else-if` Ladder | Assigns letter grades (A, B, C, D, F) based on student marks. |
| [`largestOf2.java`](largestOf2.java) | `if-else` | Compares two integers and prints the larger value. |
| [`oddOreven.java`](oddOreven.java) | Modulo `%` + `if-else` | Checks whether an integer is even or odd. |

---

## 6. How to Compile & Run

```bash
# Compile
javac ifelse.java

# Run
java ifelse
```

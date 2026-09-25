# 🔄 Chapter 5: Loops (Flow Control & Iteration)

Loops in Java are used to execute a specific block of code repeatedly as long as a specified boolean condition evaluates to `true`. They help automate repetitive tasks and manage dynamic sequences efficiently.

---

## 📑 Table of Contents
- [1. Overview](#1-overview)
- [2. Three Essential Components of a Loop](#2-three-essential-components-of-a-loop)
- [3. The `while` Loop](#3-the-while-loop)
  - [Syntax](#syntax)
  - [Execution Flow](#execution-flow)
- [4. Code Files Overview](#4-code-files-overview)
- [5. How to Compile & Run](#5-how-to-compile--run)

---

## 1. Overview

Iteration control structures allow a set of instructions to be executed repeatedly until a termination condition is met.

```
                    ┌────────────────────────┐
                    │     Initialization     │
                    └───────────┬────────────┘
                                │
                    ┌───────────▼────────────┐
             ┌─────►│    Condition Check     │
             │      └───────────┬────────────┘
             │                  │
             │        ┌─────────┴─────────┐
             │     [true]               [false]
             │        │                   │
             │ ┌──────▼─────────────┐     │
             │ │  Execute Loop Body │     │
             │ └──────┬─────────────┘     │
             │        │                   │
             │ ┌──────▼─────────────┐     │
             │ │ Increment / Update │     │
             │ └──────┬─────────────┘     │
             │        │                   │
             └────────┘                   │
                                 ┌────────▼────────┐
                                 │   Exit Loop     │
                                 └─────────────────┘
```

---

## 2. Three Essential Components of a Loop

Every standard loop consists of three key elements:
1. **Initialization**: Setting up a loop control variable (e.g., `int i = 1;`).
2. **Condition**: A boolean expression evaluated before each iteration (e.g., `i <= n`). When `false`, the loop terminates.
3. **Updation (Increment / Decrement)**: Modifying the loop variable (e.g., `i++`) to ensure the loop progresses and terminates properly.

---

## 3. The `while` Loop

The `while` loop is an **entry-controlled loop** (pre-test loop). It evaluates the condition *before* executing the loop body. If the condition is initially `false`, the body does not execute even once.

### Syntax
```java
// 1. Initialization
int i = 1;

// 2. Condition
while (i <= n) {
    // Loop body statements
    
    // 3. Updation
    i++;
}
```

### Execution Flow
1. Evaluates the condition expression.
2. If `true`, the statements inside the body are executed and the loop control variable is updated.
3. Steps 1 and 2 repeat until the condition evaluates to `false`.

---

## 4. Code Files Overview

| File | Topic / Concept | Description |
|---|---|---|
| [`whileLoop.java`](whileLoop.java) | Basic `while` Loop | Prints numbers from 1 to 10 demonstrating initialization, condition check, and increment. |
| [`while1TOn.java`](while1TOn.java) | Dynamic Range `while` Loop | Takes user input `n` using `Scanner` and prints numbers sequentially from 1 to `n`. |
| [`sumOfn.java`](sumOfn.java) | Accumulator Pattern | Calculates and prints the sum of the first `n` natural numbers using running summation. |

---

## 5. How to Compile & Run

```bash
# Compile any file
javac while1TOn.java

# Run the compiled bytecode
java while1TOn
```

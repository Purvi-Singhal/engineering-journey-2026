# 🔄 Chapter 5: Loops & Iterative Flow Control

Loops in Java execute a block of code repeatedly as long as a specified boolean condition evaluates to `true`. They eliminate code duplication, automate repetitive tasks, and process dynamic sequences efficiently.

---

## 📑 Table of Contents
- [1. Overview](#1-overview)
- [2. Three Essential Components of a Loop](#2-three-essential-components-of-a-loop)
- [3. The `while` Loop (Entry-Controlled Iteration)](#3-the-while-loop-entry-controlled-iteration)
- [4. The `for` Loop (Compact & Count-Controlled Iteration)](#4-the-for-loop-compact--count-controlled-iteration)
- [5. The `do-while` Loop (Exit-Controlled Iteration)](#5-the-do-while-loop-exit-controlled-iteration)
- [6. Jump Statements: `break` & `continue` (with `do-while`)](#6-jump-statements-break--continue-with-do-while)
  - [The `break` Statement](#the-break-statement)
  - [The `continue` Statement](#the-continue-statement)
- [7. Code Files Overview](#7-code-files-overview)
- [8. Practice Questions Overview](#8-practice-questions-overview)
- [9. How to Compile & Run](#9-how-to-compile--run)

---

## 1. Overview

Iteration control structures repeat a sequence of instructions until a termination condition is reached.

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
2. **Condition**: A boolean expression evaluated every cycle (e.g., `i <= n`). When `false`, the loop terminates.
3. **Updation (Increment / Decrement)**: Modifying the loop variable (e.g., `i++`, `num /= 10`) so the loop progresses toward termination.

---

## 3. The `while` Loop (Entry-Controlled Iteration)

The `while` loop is an **entry-controlled loop** (pre-test loop). It evaluates the condition *before* executing the loop body. If the condition is initially `false`, the body does not execute even once. Best suited when the exact number of iterations is not known in advance (such as extracting digits of a number until it reaches `0`).

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

---

## 4. The `for` Loop (Compact & Count-Controlled Iteration)

The `for` loop combines **initialization**, **condition check**, and **updation** into a single header line. It is ideal for **count-controlled iteration** where the number of repetitions is known ahead of time (such as printing patterns, factorials, or multiplication tables).

### Syntax
```java
for (initialization; condition; updation) {
    // Loop body statements
}
```

### Example: Square Pattern Using `for` Loop & `String.repeat(n)`
```java
for (int i = 1; i <= n; i++) {
    System.out.println("* ".repeat(n));
}
```
> [!TIP]
> Unlike Python (`'*' * n`), using `'*' * n` in Java multiplies the ASCII value of `'*'` (`42`) by `n`, while `"*" * n` causes a compilation error. Java 11+ provides `String.repeat(n)` to repeat a string `n` times cleanly inside a single `for` loop.

---

## 5. The `do-while` Loop (Exit-Controlled Iteration)

The `do-while` loop is an **exit-controlled loop** (post-test loop). It executes the loop body **first** and checks the condition **afterward**, guaranteeing that the body runs **at least once** regardless of whether the condition is initially true or false.

### Syntax
```java
do {
    // Loop body statements (executes at least once)
} while (condition);
```

---

## 6. Jump Statements: `break` & `continue` (with `do-while`)

Jump statements alter the normal flow of loop execution based on a runtime condition.

### The `break` Statement
Immediately **terminates** the enclosing loop and transfers control to the statement right after the loop.

```java
do {
    System.out.print("Enter your number: ");
    int num = sc.nextInt();
    if (num % 10 == 0) {
        break; // Exits the do-while loop immediately on a multiple of 10
    }
    System.out.println(num);
} while (true);
```

### The `continue` Statement
**Skips the remaining statements** in the current iteration and jumps straight to the next iteration check.

```java
do {
    System.out.print("Enter your number: ");
    int num = sc.nextInt();
    if (num % 10 == 0) {
        continue; // Skips printing multiples of 10 and starts next iteration
    }
    System.out.println("number was: " + num);
} while (true);
```

---

## 7. Code Files Overview

| File | Topic / Concept | Description |
|---|---|---|
| [`whileLoop.java`](whileLoop.java) | Basic `while` Loop | Prints numbers from `1` to `10` demonstrating initialization, condition check, and increment. |
| [`while1TOn.java`](while1TOn.java) | Dynamic Range `while` Loop | Takes user input `n` via `Scanner` and prints numbers sequentially from `1` to `n`. |
| [`sumOfn.java`](sumOfn.java) | Accumulator Pattern (`while`) | Calculates and prints the sum of the first `n` natural numbers using running summation. |
| [`forLoop.java`](forLoop.java) | `for` Loop & Pattern Printing | Prints an `n × n` square star pattern using a single `for` loop with `"* ".repeat(n)`. |
| [`reverseNum.java`](reverseNum.java) | Digit Extraction (`while`) | Reverses an integer entered by the user using `% 10` (last digit) and `/ 10` (digit removal). |
| [`useOfbreak.java`](useOfbreak.java) | `do-while` + `break` | Continuously reads numbers from the user and exits the loop as soon as a multiple of `10` is entered. |
| [`useOfcontinue.java`](useOfcontinue.java) | `do-while` + `continue` | Continuously reads and displays user numbers while skipping any multiple of `10`. |
| [`primeNum.java`](primeNum.java) | Primality Test (`for` + `break`) | Checks whether a user-entered number is prime by testing divisibility from `2` up to `n - 1` (or `√n`). |

---

## 8. Practice Questions Overview

| File | Topic / Concept | Description |
|---|---|---|
| [`questions/integers.java`](questions/integers.java) | `do-while` + Conditional Sum | Reads a set of integers interactively and computes the separate sums of even and odd integers. |
| [`questions/factorial.java`](questions/factorial.java) | `for` Loop Multiplicative Accumulator | Computes the factorial ($n!$) of a non-negative integer entered by the user. |
| [`questions/multiplication.java`](questions/multiplication.java) | `for` Loop Table Generation | Prints the multiplication table (`1` to `10`) for any user-specified number. |

---

## 9. How to Compile & Run

```bash
# Compile any file in 05-loops
javac primeNum.java

# Run the compiled bytecode
java primeNum

# Compile and run a practice question
javac questions/factorial.java
java -cp questions factorial
```

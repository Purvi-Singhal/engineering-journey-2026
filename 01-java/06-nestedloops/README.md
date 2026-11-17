# 🧩 Chapter 6: Nested Loops & Pattern Printing

A **nested loop** is a loop placed inside the body of another loop. For every single iteration of the **outer loop**, the **inner loop** executes its entire cycle from start to finish. Nested loops are the foundation of 2D grid traversal, matrix operations, and pattern printing.

---

## 📑 Table of Contents
- [1. Overview & Execution Flow](#1-overview--execution-flow)
- [2. Syntax & Core Mechanics](#2-syntax--core-mechanics)
- [3. The 3-Step Golden Rule of Pattern Printing](#3-the-3-step-golden-rule-of-pattern-printing)
- [4. Pattern Categories Covered](#4-pattern-categories-covered)
  - [4.1 Star Patterns (`*`)](#41-star-patterns-)
  - [4.2 Number Patterns](#42-number-patterns)
  - [4.3 Character / Alphabet Patterns (ASCII Arithmetic)](#43-character--alphabet-patterns-ascii-arithmetic)
- [5. Code Files Overview](#5-code-files-overview)
- [6. Practice Questions Overview](#6-practice-questions-overview)
- [7. How to Compile & Run](#7-how-to-compile--run)

---

## 1. Overview & Execution Flow

When an outer loop runs `R` times (rows) and an inner loop runs `C` times (columns) per outer iteration, the innermost statement executes a total of `R × C` times.

```
                ┌──────────────────────────────────┐
                │   Outer Loop: Row (i = 1 to R)   │
                └─────────────────┬────────────────┘
                                  │
                         ┌────────┴────────┐
                      [true]            [false]
                         │                 │
        ┌────────────────▼───────────────┐ │
        │ Inner Loop: Column (j = 1 to C)│ │
        └────────────────┬───────────────┘ │
                         │                 │
                ┌────────┴────────┐        │
             [true]            [false]     │
                │                 │        │
      ┌─────────▼──────────┐      │        │
      │ System.out.print() │      │        │
      │      (j++)         │      │        │
      └─────────┬──────────┘      │        │
                │                 │        │
                └──►(Repeat j)    │        │
                                  │        │
                     ┌────────────▼─────┐  │
                     │System.out.println│  │
                     │  (New Line, i++) │  │
                     └────────────┬─────┘  │
                                  │        │
                                  └──►(Repeat i)
                                           │
                                  ┌────────▼────────┐
                                  │   Exit Loops    │
                                  └─────────────────┘
```

---

## 2. Syntax & Core Mechanics

```java
for (int i = 1; i <= rows; i++) {          // Outer loop -> Controls ROWS (lines)
    for (int j = 1; j <= cols; j++) {      // Inner loop -> Controls COLUMNS (elements per row)
        System.out.print("*");             // Prints within the same row
    }
    System.out.println();                  // Moves cursor to the next line after row completes
}
```

> [!IMPORTANT]
> - Use `System.out.print(...)` inside the **inner loop** so elements stay on the same row.
> - Use `System.out.println()` at the end of the **outer loop** to move to the next line after a row finishes.

---

## 3. The 3-Step Golden Rule of Pattern Printing

Every 2D pattern problem can be solved systematically using three questions:

1. **How many lines (rows) are there?**
   - Determines the **outer loop** range (e.g., `for (int i = 1; i <= n; i++)` or `for (int i = n; i >= 1; i--)`).
2. **How many elements are in each row (`i`)?**
   - Determines the **inner loop** condition:
     - Rectangular grid: `j <= cols`
     - Lower-left triangle (growing): `j <= i`
     - Inverted triangle (shrinking): `j <= i` (when `i` counts down from `n` to `1`) or `j <= n - i + 1`
3. **What needs to be printed at each position?**
   - Fixed symbol: `"*"`
   - Column-changing number: `j` (`1, 2, 3...`)
   - Row-constant number: `i` (`1`, `2 2`, `3 3 3...`)
   - Continuous counter (Floyd's Triangle): `num++`
   - Characters: `ch++` or `(char)('A' + j - 1)`

---

## 4. Pattern Categories Covered

### 4.1 Star Patterns (`*`)
```text
Rectangular Grid (3×5)     Right-Angled Triangle     Inverted Right-Angled Triangle
*****                      *                         *****
*****                      **                        ****
*****                      ***                       ***
                           ****                      **
                           *****                     *
```

### 4.2 Number Patterns
```text
Column Number (j)     Inverted Number (j)   Same Row Number (i)   Floyd's Triangle (num++)
1                     12345                 1                     1
12                    1234                  22                    2 3
123                   123                   333                   4 5 6
1234                  12                    4444                  7 8 9 10
12345                 1                     55555
```

### 4.3 Character / Alphabet Patterns (ASCII Arithmetic)
In Java, `char` values are stored as Unicode/ASCII integers (`'A' = 65`, `'B' = 66`, etc.), allowing direct arithmetic and type casting:
- **Continuous Character (`ch++`)**: `A` → `B C` → `D E F` → `G H I J`
- **Column-Reset Character (`(char)('A' + j - 1)`)**: `A` → `A B` → `A B C` → `A B C D`
- **Row-Constant Character (`(char)('A' + i - 1)`)**: `A` → `B B` → `C C C` → `D D D D`

---

## 5. Code Files Overview

| File | Pattern Type | Description |
|---|---|---|
| [`nestedloop.java`](nestedloop.java) | `3 × 5` Solid Rectangle | Demonstrates how the outer loop controls `3` rows and the inner loop prints `5` stars per row. |
| [`RightAngledTri.java`](RightAngledTri.java) | Right-Angled Star Triangle | Prints a growing star triangle (`1` to `5` stars per row) using `j <= i`. |
| [`reverseRightAngled.java`](reverseRightAngled.java) | Inverted Star Triangle | Prints a shrinking star triangle (`5` down to `1` stars) by decrementing the outer loop (`i = 5` to `1`). |
| [`numbertriangle.java`](numbertriangle.java) | Number Half-Pyramid | Prints `1` to `i` on each row (`1`, `12`, `123`, `1234`, `12345`). |
| [`reverseNumTriangle.java`](reverseNumTriangle.java) | Inverted Number Pyramid | Prints `1` to `i` in decreasing row lengths (`12345` down to `1`). |
| [`sameNumTriangle.java`](sameNumTriangle.java) | Repeating Row Number Triangle | Prints the row index `i` repeatedly on each row (`1`, `22`, `333`, `4444`, `55555`). |

---

## 6. Practice Questions Overview

| File | Pattern Type | Description |
|---|---|---|
| [`questions/q1.java`](questions/q1.java) | Floyd's Triangle | Prints consecutive numbers (`1` to `10`) across `4` rows in a right-angled triangle. |
| [`questions/q2.java`](questions/q2.java) | Continuous Character Triangle | Prints sequential alphabets (`A` to `J`) across `4` rows using `char ch = 'A'; ch++;`. |
| [`questions/q3.java`](questions/q3.java) | Alphabet Half-Pyramid | Resets each row to start from `'A'` (`A`, `A B`, `A B C`, `A B C D`) using `(char)('A' + j - 1)`. |
| [`questions/q4.java`](questions/q4.java) | Repeating Alphabet Triangle | Prints the same letter across each row (`A`, `B B`, `C C C`, `D D D D`) using `(char)('A' + i - 1)`. |

---

## 7. How to Compile & Run

```bash
# Compile and run any main pattern file
javac RightAngledTri.java
java RightAngledTri

# Compile and run a practice question
javac questions/q1.java
java -cp questions q1
```

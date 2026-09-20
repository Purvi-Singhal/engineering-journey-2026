# Module 02: Practice Questions & Solutions

> Hands-on coding exercises, input-handling problem solving, variable scope tracing, and base numeral conversions for Module 02.

---

## Question 1: Literal Inspector & Base Representation

- **File**: [`Q1_LiteralInspector.java`](./Q1_LiteralInspector.java)
- **Concepts**: Decimal, Binary, Octal, Hexadecimal literal parsing, Integer helper functions (`toBinaryString`, `toHexString`, `toOctalString`).

### Problem Statement:
Write a Java program that takes a decimal integer and displays:
1. Its binary representation with prefix `0b`
2. Its octal representation with prefix `0`
3. Its hexadecimal representation with prefix `0x`
4. The value multiplied by $10^6$ using numeric underscore formatting in documentation.

---

## Question 2: Robust Profile Input Form

- **File**: [`Q2_ProfileForm.java`](./Q2_ProfileForm.java)
- **Concepts**: `Scanner` input, avoiding the `nextInt()` -> `nextLine()` buffer truncation bug, handling mixed alphanumeric inputs.

### Problem Statement:
Build a console profile registration form that sequentially inputs:
1. `User ID` (`int`)
2. `Full Name` (`String` containing spaces)
3. `Hourly Wage` (`double`)
4. `Department Name` (`String` containing spaces)

Ensure no input prompts are skipped due to dangling newline characters in the buffer.

---

## Question 3: Fast I/O Multi-line Array Sum

- **File**: [`Q3_FastMatrixSum.java`](./Q3_FastMatrixSum.java)
- **Concepts**: `BufferedReader`, `StringTokenizer`, `Integer.parseInt()`, high-speed data stream processing.

### Problem Statement:
Given multiple space-separated integers across input lines, use `BufferedReader` and `StringTokenizer` to rapidly compute:
1. Total count of numbers
2. Grand sum
3. Maximum and minimum value

---

## Question 4: Scope & Variable Shadowing Tracing

- **File**: [`Q4_ScopeTracer.java`](./Q4_ScopeTracer.java)
- **Concepts**: Block scope, Local vs Member variable shadowing, `this` reference, variable lifetime.

### Problem Statement:
Predict and verify the exact output of nested blocks modifying shadowed variables at field, method, and inner-block levels.

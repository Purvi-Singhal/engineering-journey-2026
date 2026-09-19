# Module 01: Practice Questions & Problem Statements

> Comprehensive problem statements, sample test cases, formulas, and conceptual explanations for Module 01 (Basics & Data Types).

---

## Question 1: Average of 3 Numbers

- **File**: [`q1.java`](./q1.java)
- **Concept**: Arithmetic operations, float vs int division, operator precedence.

### Problem Statement:
In a program, input 3 numbers: `A`, `B`, and `C`. You have to output the average of these 3 numbers.

### Formula:
$$\text{Average} = \frac{A + B + C}{3}$$

### Example:
- **Input**: `A = 25`, `B = 30`, `C = 35`
- **Output**: `30.0`

---

## Question 2: Area of a Square

- **File**: [`q2.java`](./q2.java)
- **Concept**: Integer multiplication, geometric formulas.

### Problem Statement:
In a program, input the side of a square. You have to output the area of the square.

### Formula:
$$\text{Area} = \text{side} \times \text{side}$$

### Example:
- **Input**: `side = 23`
- **Output**: `529`

---

## Question 3: Item Bill with 18% GST

- **File**: [`q3.java`](./q3.java)
- **Concept**: User input with `Scanner.nextFloat()`, percentage calculation, float arithmetic.

### Problem Statement:
Enter cost of 3 items from the user (using `float` data type) — a pencil, a pen, and an eraser. Output the total cost of the items back to the user as their bill, along with an 18% GST tax addition.

### Calculation:
1. $\text{Total} = \text{pencil} + \text{pen} + \text{eraser}$
2. $\text{GST} = \frac{\text{Total} \times 18}{100}$
3. $\text{Final Bill} = \text{Total} + \text{GST}$

---

## Question 4: Type Promotion & Valid Identifiers

- **File**: [`q4.java`](./q4.java)
- **Concept**: Java automatic type promotion rules in mixed expressions, identifier naming rules.

### Problem Statement:
Given the following variables:
```java
byte b = 4;
char c = 'a';
short s = 512;
int i = 1000;
float f = 5.67f;
double d = 0.1234;

double result = (f * b) + (i / c) - (d * s);
```
What will be the data type of `result`, and what is the rule governing this promotion?

### Explanation:
- `(f * b)`: `byte` is promoted to `float` $\rightarrow$ result is `float`.
- `(i / c)`: `char` is promoted to `int` $\rightarrow$ result is `int`.
- `(d * s)`: `short` is promoted to `double` $\rightarrow$ result is `double`.
- `float + int - double`: The entire expression is promoted to `double` (the largest data type in the expression).

---

## Bonus: Temperature Converter

- **File**: [`TemperatureConverter.java`](./TemperatureConverter.java)
- **Concept**: Floating-point precision, temperature conversion formula.

### Formula:
$$\text{Fahrenheit} = (\text{Celsius} \times \frac{9.0}{5.0}) + 32$$

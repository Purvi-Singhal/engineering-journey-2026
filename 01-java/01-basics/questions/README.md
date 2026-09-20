# Module 01: Practice Questions & Problem Statements

> Problem statements, sample test cases, formulas, and conceptual explanations for Module 01 (Basics & Data Types).

---

## Question 1: Type Promotion & Valid Identifiers

- **File**: [`q1.java`](./q1.java)
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

## Question 2: Temperature Converter

- **File**: [`TemperatureConverter.java`](./TemperatureConverter.java)
- **Concept**: Floating-point precision, temperature conversion formula.

### Formula:
$$\text{Fahrenheit} = (\text{Celsius} \times \frac{9.0}{5.0}) + 32$$

---

> [!NOTE]
> All console input-based practice questions (Average, Square Area, GST Bill Calculator) have been moved to [**Module 02: User Input Questions**](../../02-input/questions/README.md).

# Module 02: Practice Questions & Tracing Walkthroughs

> Step-by-step dry runs, problem statements, operator precedence explanations, and expected outputs for Module 02 (Operators & Expressions).

---

## Question 1: Operator Precedence & Integer Division

- **File**: [`q1.java`](./q1.java)
- **Concepts**: Operator associativity (Left-to-Right for `*`, `/`), Integer division truncation.

### Problem Statement:
Trace the values of `exp1` and `exp2`:
```java
int x = 2, y = 5;
int exp1 = (x * y / x);
int exp2 = (x * (y / x));
```

### Dry Run / Trace:
1. `exp1 = (x * y / x)`:
   - `2 * 5` evaluates to `10`
   - `10 / 2` evaluates to `5`
   - **Result**: `5`
2. `exp2 = (x * (y / x))`:
   - `(y / x) -> (5 / 2)` evaluates to `2` (integer division truncates decimal part)
   - `2 * 2` evaluates to `4`
   - **Result**: `4`

---

## Question 2: Logical Operators & Short-Circuit Evaluation

- **File**: [`q2.java`](./q2.java)
- **Concepts**: Logical AND (`&&`), Short-circuiting, Relational conditions.

### Problem Statement:
Determine which strings will be printed by the following code:
```java
int x = 200, y = 50, z = 100;
if (x > y && y > z) {
    System.out.println("Hello");
}
if (z > y && z < x) {
    System.out.println("Java");
}
if ((y + 200) < x && (y = 150) < z) {
    System.out.println("Hello Java");
}
```

### Dry Run / Trace:
1. `(200 > 50 && 50 > 100)` $\rightarrow$ `(true && false)` $\rightarrow$ `false` (Does NOT execute).
2. `(100 > 50 && 100 < 200)` $\rightarrow$ `(true && true)` $\rightarrow$ `true` (**Prints "Java"**).
3. `((50 + 200) < 200)` $\rightarrow$ `(250 < 200)` $\rightarrow$ `false` (Short-circuits, does NOT execute).

---

## Question 3: Compound Assignment Operators

- **File**: [`q3.java`](./q3.java)
- **Concepts**: Chained assignment, `+=`, `-=`, `/=` operators, Integer division.

### Problem Statement:
Determine the final values of `x`, `y`, and `z`:
```java
int x, y, z;
x = y = z = 2;
x += y;
y -= z;
z /= (x + y);
```

### Dry Run / Trace:
1. `x = 2`, `y = 2`, `z = 2`
2. `x += y` $\rightarrow$ `x = 2 + 2 = 4`
3. `y -= z` $\rightarrow$ `y = 2 - 2 = 0`
4. `z /= (x + y)` $\rightarrow$ `z = 2 / (4 + 0) = 2 / 4 = 0`
- **Output**: `4 0 0`

---

## Question 4: Complex Multi-Operator Arithmetic Expression

- **File**: [`q4.java`](./q4.java)
- **Concepts**: High-order precedence parsing, sub-expression grouping.

### Problem Statement:
Evaluate the expression:
```java
int x = 9, y = 12;
int a = 2, b = 4, c = 6;
int exp = 4/3 * (x + 34) + 9 * (a + b + c) + (3 + y * (2 + a)) / (a + b * y);
```

### Dry Run / Trace:
- **Term 1**: `4 / 3 * (9 + 34)` $\rightarrow$ `1 * 43` = `43`
- **Term 2**: `9 * (2 + 4 + 6)` $\rightarrow$ `9 * 12` = `108`
- **Term 3**: `(3 + 12 * 4) / (2 + 4 * 12)` $\rightarrow$ `51 / 50` = `1`
- **Total**: `43 + 108 + 1` = `152`

---

## Question 5: Associativity & Parentheses

- **File**: [`q5.java`](./q5.java)
- **Concepts**: Operator priority of parentheses vs Left-to-Right evaluation.

### Problem Statement:
Evaluate `exp1` and `exp2` given `x = 10` and `y = 5`:
```java
int exp1 = (y * (x / y + x / y));
int exp2 = (y * x / y + y * x / y);
```

### Dry Run / Trace:
- `exp1`: `5 * (10 / 5 + 10 / 5)` $\rightarrow$ `5 * (2 + 2)` $\rightarrow$ `5 * 4` = `20`
- `exp2`: `(5 * 10 / 5) + (5 * 10 / 5)` $\rightarrow$ `(50 / 5) + (50 / 5)` $\rightarrow$ `10 + 10` = `20`

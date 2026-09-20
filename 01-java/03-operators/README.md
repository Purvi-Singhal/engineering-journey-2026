# Module 03: Java Operators & Precedence

> Arithmetic operators (binary & unary prefix/postfix), relational comparisons, logical operators, compound assignments, and operator precedence rules.

---

## 1. Overview of Operators

An **operator** is a special symbol that performs operations on one, two, or three operands and produces a result.
- **Operand**: Data/variable upon which the operation is performed (e.g., in `a + b`, `a` and `b` are operands).
- **Expression**: Combination of operands and operators that evaluates to a single value.

---

## 2. Types of Operators in Java

### 1. Arithmetic Operators

Used for mathematical computations.

#### A. Binary Arithmetic Operators (Takes 2 Operands)
| Operator | Name | Example (`a = 10, b = 5`) | Result |
| :--- | :--- | :--- | :--- |
| `+` | Addition | `a + b` | `15` |
| `-` | Subtraction | `a - b` | `5` |
| `*` | Multiplication | `a * b` | `50` |
| `/` | Division (Quotient) | `a / b` | `2` |
| `%` | Modulo (Remainder) | `a % b` | `0` |

#### B. Unary Arithmetic Operators (Takes 1 Operand)
| Operator | Type | Behavior | Example (`x = 10`) |
| :--- | :--- | :--- | :--- |
| `++x` | Pre-Increment | Value is incremented **first**, then used in expression | `y = ++x;` -> `x=11, y=11` |
| `x++` | Post-Increment | Value is used in expression **first**, then incremented | `y = x++;` -> `y=10, x=11` |
| `--x` | Pre-Decrement | Value is decremented **first**, then used in expression | `y = --x;` -> `x=9, y=9` |
| `x--` | Post-Decrement | Value is used in expression **first**, then decremented | `y = x--;` -> `y=10, x=9` |

---

### 2. Relational (Comparison) Operators

Compares two values and always evaluates to a `boolean` (`true` or `false`).

| Operator | Meaning | Example (`a = 10, b = 5`) | Evaluation |
| :--- | :--- | :--- | :--- |
| `==` | Equal to | `a == b` | `false` |
| `!=` | Not equal to | `a != b` | `true` |
| `>` | Greater than | `a > b` | `true` |
| `<` | Less than | `a < b` | `false` |
| `>=` | Greater than or equal to | `a >= b` | `true` |
| `<=` | Less than or equal to | `a <= b` | `false` |

---

### 3. Logical Operators

Used to combine multiple boolean expressions or invert conditions.

| Operator | Name | Behavior |
| :--- | :--- | :--- |
| `&&` | Logical AND | Returns `true` if **both** statements are true. *(Short-circuits if first is false)* |
| `\|\|` | Logical OR | Returns `true` if **at least one** statement is true. *(Short-circuits if first is true)* |
| `!` | Logical NOT | Inverts the boolean result (`!true` is `false`, `!false` is `true`). |

#### Truth Table:
| A | B | `A && B` | `A \|\| B` | `!A` |
| :--- | :--- | :--- | :--- | :--- |
| `true` | `true` | `true` | `true` | `false` |
| `true` | `false` | `false` | `true` | `false` |
| `false` | `true` | `false` | `true` | `true` |
| `false` | `false` | `false` | `false` | `true` |

---

### 4. Assignment Operators

Used to assign values to variables.

| Operator | Example | Equivalent To |
| :--- | :--- | :--- |
| `=` | `a = b` | Simple assignment |
| `+=` | `a += 5` | `a = a + 5` |
| `-=` | `a -= 5` | `a = a - 5` |
| `*=` | `a *= 5` | `a = a * 5` |
| `/=` | `a /= 5` | `a = a / 5` |
| `%=` | `a %= 5` | `a = a % 5` |

---

## 3. Operator Precedence & Associativity

When an expression has multiple operators, precedence determines the order of evaluation:

| Precedence Order | Operators | Associativity |
| :--- | :--- | :--- |
| **1 (Highest)** | `()`, `[]`, `.` | Left to Right |
| **2** | `++`, `--`, `+` (unary), `-` (unary), `!`, `~` | Right to Left |
| **3** | `*`, `/`, `%` | Left to Right |
| **4** | `+`, `-` | Left to Right |
| **5** | `<<`, `>>`, `>>>` (Bitwise Shifts) | Left to Right |
| **6** | `<`, `<=`, `>`, `>=` | Left to Right |
| **7** | `==`, `!=` | Left to Right |
| **8** | `&` (Bitwise AND) | Left to Right |
| **9** | `^` (Bitwise XOR) | Left to Right |
| **10** | `\|` (Bitwise OR) | Left to Right |
| **11** | `&&` (Logical AND) | Left to Right |
| **12** | `\|\|` (Logical OR) | Left to Right |
| **13** | `? :` (Ternary) | Right to Left |
| **14 (Lowest)** | `=`, `+=`, `-=`, `*=`, `/=`, `%=` | Right to Left |

---

## 4. Code Examples & Implementations

| File | Concepts Covered |
| :--- | :--- |
| [`arithmetic.java`](./arithmetic.java) | Binary arithmetic operators & Unary prefix/postfix increment/decrement. |
| [`relational.java`](./relational.java) | Equality and relational comparison operators. |
| [`Logical.java`](./Logical.java) | Logical AND, Logical OR, Logical NOT expressions. |
| [`Assignment.java`](./Assignment.java) | Standard assignment and compound assignment operators (`+=`, `-=`, `*=`, `/=`). |

---

## 5. Practice Questions

| Question | File | Description |
| :--- | :--- | :--- |
| **Q1: Operator Output Trace 1** | [`questions/q1.java`](./questions/q1.java) | Traces increment/decrement and operator precedence. |
| **Q2: Conditional Evaluation** | [`questions/q2.java`](./questions/q2.java) | Tests complex `if` condition with post-increment and logical operators. |
| **Q3: Multi-variable Expression Trace** | [`questions/q3.java`](./questions/q3.java) | Traces arithmetic evaluation with multiple increment/decrement expressions. |
| **Q4: Precedence & Associativity Evaluation** | [`questions/q4.java`](./questions/q4.java) | Step-by-step arithmetic operator precedence breakdown. |
| **Q5: Complex Precedence Calculation** | [`questions/q5.java`](./questions/q5.java) | Complex expression evaluation trace with division and modulus. |


# Java Learning & Engineering Roadmap

> Core Java, Object-Oriented Design, JVM Internals, Collections, Concurrency, and Modern Java Engineering.

---

## 1. Overview

This directory houses a modular, structured curriculum for mastering the Java programming language from fundamentals to production-grade software engineering.

Each module contains:
- **Theory & Documentation (`README.md`)**: In-depth explanations, execution internals, ASCII architecture diagrams, and syntax references.
- **Runnable Code**: Clean, isolated, runnable `.java` files demonstrating every concept.
- **Practice Questions & Problem Solutions**: Hands-on coding exercises, tracing problems, and solution notes.

---

## 2. Curriculum & Module Index

| Module | Title | Key Topics Covered | Status |
| :---: | :--- | :--- | :---: |
| **01** | [**Basics & Data Types**](./01-basics/README.md) | JVM/JRE/JDK architecture, Program anatomy, Variables, Primitive data types, Type conversion & casting | `COMPLETED` |
| **02** | [**User Input**](./02-input/README.md) | Standard input (`System.in`), `Scanner` methods, Newline buffer trap & flush fix | `COMPLETED` |
| **03** | [**Operators & Precedence**](./03-operators/README.md) | Arithmetic (unary/binary), Relational, Logical, Assignment, Operator precedence & associativity | `COMPLETED` |
| **04** | [**Conditional Statements**](./04-conditionals/README.md) | `if-else`, `else-if`, Nested `if-else`, Ternary operator, `switch-case` | `COMPLETED` |
| **05** | [**Loops & Iterative Flow Control**](./05-loops/README.md) | `while`, `for`, `do-while`, `break`, `continue`, Digit extraction, Primality & Pattern printing | `COMPLETED` |
| **06** | [**Nested Loops & Pattern Printing**](./06-nestedloops/README.md) | Outer vs inner loop mechanics, Star patterns, Number pyramids, Floyd's triangle, Character/ASCII patterns | `COMPLETED` |
| **07** | **Functions & Methods** | Method syntax, Parameters vs arguments, Call by value, Function overloading, Scope | `UPCOMING` |
| **08** | **Arrays & 2D Matrices** | Array creation, Memory representation, Searching/Sorting basics, 2D Arrays, Matrix operations | `UPCOMING` |
| **09** | **Strings & StringBuilder** | String pool, Immutability, `StringBuilder`, String manipulation methods | `UPCOMING` |
| **10** | **Object-Oriented Programming** | Classes, Objects, 4 OOP Pillars (Encapsulation, Inheritance, Polymorphism, Abstraction), Interfaces, Packages | `UPCOMING` |
| **11** | **Recursion & Backtracking** | Base cases, Call stack memory, Divide & Conquer | `UPCOMING` |
| **12** | **Java Collections Framework** | `ArrayList`, `LinkedList`, `HashSet`, `TreeSet`, `HashMap`, `PriorityQueue`, Comparators | `UPCOMING` |
| **13** | **Exception Handling** | `try-catch-finally`, Checked vs Unchecked, Custom exceptions, `throw`/`throws` | `UPCOMING` |
| **14** | **JVM Internals & Memory Model** | ClassLoaders, Stack vs Heap memory, JIT compiler, Garbage Collection algorithms | `UPCOMING` |
| **15** | **Concurrency & Multithreading** | Threads, `Runnable`, `Callable`, Synchronization, Locks, Thread pools (`ExecutorService`) | `UPCOMING` |

---

## 3. Directory Structure

```text
01-java/
├── README.md
├── 01-basics/
│   ├── README.md                          # Theory, JVM architecture & primitive types
│   ├── JavaBasics.java
│   ├── HelloEngineering.java
│   ├── PersonalInfo.java
│   ├── datatypes.java
│   ├── variables.java
│   ├── typec.java
│   └── questions/
│       ├── q1.java                        # Type promotion exercise
│       ├── TemperatureConverter.java
│       └── *.pdf                          # Questions & Solutions
│
├── 02-input/
│   ├── README.md                          # Theory: Scanner, Buffer Flush & Token Parsing
│   ├── input.java                         # Scanner basic inputs & sum
│   ├── product.java                       # Scanner product & Circle area
│   ├── ScannerInputDemo.java              # Scanner newline trap resolution
│   └── questions/
│       ├── README.md
│       ├── q1_average.java                # Average calculation
│       ├── q2_square_area.java            # Square area calculation
│       ├── q3_bill_gst.java               # GST Bill computation
│       └── q4_profile_form.java           # Safe Scanner multi-type form
│
├── 03-operators/
│   ├── README.md                          # Theory, Precedence table & truth tables
│   ├── arithmetic.java
│   ├── relational.java
│   ├── Logical.java
│   ├── Assignment.java
│   ├── Operator Precedence_V1.1.pdf
│   └── questions/
│       ├── q1.java ... q5.java
│       └── *.pdf                          # Questions & Solutions
│
├── 04-conditionals/
│   ├── README.md                          # Theory: Branching, Ternary & Switch-Case
│   ├── ifelse.java
│   ├── elseif.java
│   ├── largestOf2.java
│   ├── largestOf3.java
│   ├── oddOreven.java
│   ├── incomeTax.java
│   ├── login.java
│   ├── ternary.java
│   ├── switchStat.java
│   ├── calculator.java
│   └── questions/
│       └── q1.java ... q3.java
│
├── 05-loops/
│   ├── README.md                          # Theory: while, for, do-while, break & continue
│   ├── whileLoop.java
│   ├── while1TOn.java
│   ├── sumOfn.java
│   ├── forLoop.java
│   ├── reverseNum.java
│   ├── useOfbreak.java
│   ├── useOfcontinue.java
│   ├── primeNum.java
│   └── questions/
│       ├── integers.java
│       ├── factorial.java
│       └── multiplication.java
│
├── 06-nestedloops/
│   ├── README.md                          # Theory: Nested loops & 3-Step Pattern Rule
│   ├── nestedloop.java
│   ├── RightAngledTri.java
│   ├── reverseRightAngled.java
│   ├── numbertriangle.java
│   ├── reverseNumTriangle.java
│   ├── sameNumTriangle.java
│   └── questions/
│       └── q1.java ... q4.java
│
└── [Upcoming Topic Modules: 07-functions, 08-arrays, etc.]
```

---

## 4. How to Run & Verify

To compile and run any Java file from terminal:

```bash
# Compile
javac path/to/FileName.java

# Execute
java -cp path/to FileName
```

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
| **01** | [**Basics & Data Types**](./01-basics/README.md) | JVM/JRE/JDK architecture, Program anatomy, Variables, Primitive data types, Scanner input, Type conversion & casting | `COMPLETED` |
| **02** | [**Operators & Expressions**](./02-operators/README.md) | Arithmetic (unary/binary), Relational, Logical, Assignment, Operator precedence & associativity | `COMPLETED` |
| **03** | **Conditional Statements** | `if-else`, `else-if`, Ternary operator, `switch-case` | `UPCOMING` |
| **04** | **Loops & Flow Control** | `while`, `for`, `do-while`, `break`, `continue`, Nested loops, Pattern printing | `UPCOMING` |
| **05** | **Functions & Methods** | Method syntax, Parameters vs arguments, Call by value, Function overloading, Scope | `UPCOMING` |
| **06** | **Arrays & 2D Matrices** | Array creation, Memory representation, Searching/Sorting basics, 2D Arrays, Matrix operations | `UPCOMING` |
| **07** | **Strings & StringBuilder** | String pool, Immutability, `StringBuilder`, String manipulation methods | `UPCOMING` |
| **08** | **Object-Oriented Programming** | Classes, Objects, 4 OOP Pillars (Encapsulation, Inheritance, Polymorphism, Abstraction), Interfaces, Packages | `UPCOMING` |
| **09** | **Recursion & Backtracking** | Base cases, Call stack memory, Divide & Conquer | `UPCOMING` |
| **10** | **Java Collections Framework** | `ArrayList`, `LinkedList`, `HashSet`, `TreeSet`, `HashMap`, `PriorityQueue`, Comparators | `UPCOMING` |
| **11** | **Exception Handling** | `try-catch-finally`, Checked vs Unchecked, Custom exceptions, `throw`/`throws` | `UPCOMING` |
| **12** | **JVM Internals & Memory Model** | ClassLoaders, Stack vs Heap memory, JIT compiler, Garbage Collection algorithms | `UPCOMING` |
| **13** | **Concurrency & Multithreading** | Threads, `Runnable`, `Callable`, Synchronization, Locks, Thread pools (`ExecutorService`) | `UPCOMING` |

---

## 3. Directory Structure

```text
01-java/
├── README.md
├── 01-basics/
│   ├── README.md                          # Theory, JVM architecture & notes
│   ├── JavaBasics.java
│   ├── HelloEngineering.java
│   ├── PersonalInfo.java
│   ├── datatypes.java
│   ├── variables.java
│   ├── input.java
│   ├── product.java
│   ├── typec.java
│   └── questions/
│       ├── q1.java ... q4.java
│       ├── TemperatureConverter.java
│       └── *.pdf                          # Questions & Solutions
│
├── 02-operators/
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
└── [Upcoming Topic Modules: 03-conditionals, 04-loops, 05-functions, etc.]
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

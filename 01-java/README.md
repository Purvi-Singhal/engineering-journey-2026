# Java Learning & Engineering

> Core Java, Object-Oriented Design, JVM internals, Collections, Concurrency, and modern Java features.

---

## 1. Overview

This directory contains learning notes, code examples, exercises, and deep dives into the Java programming language. The goal is to build strong object-oriented programming foundations and develop an in-depth understanding of the Java Virtual Machine (JVM).

---

## 2. Topics Covered

- **Language Fundamentals**: Syntax, data types, control structures, memory allocation (Stack vs. Heap)
- **Object-Oriented Programming (OOP)**: Encapsulation, inheritance, polymorphism, abstraction, and SOLID principles
- **Java Collections Framework**: Lists, Sets, Maps, Queues, internal implementations, and complexity
- **Generics & Type Systems**: Type bounds, wildcards, and type erasure
- **Exception Handling**: Checked vs. unchecked exceptions, custom exceptions, and resource management (`try-with-resources`)
- **Java Memory Model & JVM Internals**: Class loaders, Garbage Collection algorithms, JIT compiler, and memory profiling
- **Concurrency & Multithreading**: Threads, `Runnable`, `Callable`, `ExecutorService`, synchronization, locks, and concurrent collections
- **Modern Java Features**: Lambdas, Streams API, `Optional`, records, sealed classes, and pattern matching
- **Build Tools & Testing**: Maven, Gradle, JUnit 5, Mockito, and AssertJ

---

## 3. Directory Structure

```text
01-java/
├── README.md
├── 01-basics/            # Core syntax, data types, and control flow
├── 02-oop/               # Classes, interfaces, inheritance, and design principles
├── 03-collections/       # Collections framework practice and custom implementations
├── 04-concurrency/       # Multithreading and concurrent programming examples
└── 05-jvm-internals/     # Memory management, garbage collection, and JVM notes
```

---

## 4. How Progress is Documented

- Each subfolder contains isolated, runnable Java code files or small Gradle/Maven modules.
- Every major concept includes a concise explanation of *how* it works under the hood.
- Unit tests accompany code implementations to verify correctness.

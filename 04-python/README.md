# Python Programming & Tooling

> Python language mastery, asynchronous programming, automation, APIs, and data tooling.

---

## 1. Overview

This directory covers Python as a versatile engineering language for systems automation, API development, data processing, and AI/ML foundations.

---

## 2. Topics Covered

- **Python Fundamentals**: Dynamic typing, control structures, list/dict comprehensions, generators, and iterators
- **Object-Oriented & Functional Python**: Dunder methods, dataclasses, decorators, context managers, and `functools`
- **Typing & Modern Python**: Type hints, `mypy`, `pydantic` schemas, and Python 3.11+ performance improvements
- **Asynchronous Programming**: `asyncio`, event loops, coroutines, and async HTTP clients (`httpx`, `aiohttp`)
- **Backend & APIs**: FastAPI, dependency injection, background tasks, and request validation
- **Tooling & Packaging**: `uv`, `poetry`, virtual environments, `ruff` for linting/formatting, and `pytest` for testing

---

## 3. Directory Structure

```text
04-python/
├── README.md
├── 01-basics/            # Core syntax, data structures, and functional patterns
├── 02-advanced/          # Decorators, generators, context managers, and concurrency
├── 03-apis/              # FastAPI services, Pydantic models, and client libraries
└── 04-automation/        # CLI tools, web scraping, and workflow scripts
```

---

## 4. Engineering Standards

- Maintain strict PEP 8 compliance via `ruff`.
- Use type annotations on all function signatures.
- Isolate project dependencies using modern package management (`uv` or `poetry`).

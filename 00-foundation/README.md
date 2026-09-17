# Foundation & Engineering Workflow

> Essential developer tooling, shell environments, version control, and engineering workflows.

---

## 1. Overview

This directory establishes the foundational development environment, tooling, and workflow standards used across all engineering tracks in this repository. 

Mastery of these fundamentals ensures consistent setup, reproducible workflows, safe secret handling, and professional version control practices.

---

## 2. Core Topics

### Git & Version Control
- Branching strategies and clean commit conventions (`Conventional Commits`)
- Rebasing, merge conflict resolution, and history management
- Submodules, tags, and release management

### GitHub & Remote Workflows
- Pull request workflows, code reviews, and issue templates
- SSH key configuration and authentication security
- GitHub Actions automation basics

### Development Environment & Terminal / CLI
- Shell configuration (Bash / Zsh / PowerShell)
- Core Unix utilities, file permissions, and piping (`grep`, `awk`, `sed`, `find`, `curl`)
- Package managers (Homebrew, Chocolatey, Scoop, APT)
- Environment variable management and `.env` isolation

### VS Code & IDE Setup
- Workspace configurations and recommended extensions
- Keybindings, multi-cursor editing, and debugging configurations
- Linter, formatter, and language server protocol (LSP) setup

### Basic Engineering Workflow
- Step-by-step feature development workflow
- Reproducible project initialization
- Code cleanliness and pre-commit hooks

---

## 3. Directory Structure

```text
00-foundation/
├── README.md
├── git/                  # Git workflows, aliases, and best practice guides
├── terminal/             # Shell scripting, CLI commands, and setup notes
└── ide-configs/          # VS Code and editor configuration templates
```

---

## 4. Documentation Standards

- Document tooling setups with clear, step-by-step commands.
- Keep environment notes cross-platform (Linux / macOS / Windows) where applicable.
- Never commit machine-specific secrets or global credential configurations.

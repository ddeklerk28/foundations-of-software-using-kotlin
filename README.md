# 🧠 Mentoring Curriculum: Foundations of Software Design

This project is a structured mentoring curriculum designed to help junior developers master **foundational software engineering principles** using Kotlin.

📚 Topics covered include:

* Object-Oriented Programming (OOP)
* SOLID Principles
* Composition vs Inheritance
* Clean Code & Software Architecture
* Design Patterns (GoF)
* Real-world software design exercises
  ...and more!

The goal is to build strong, transferable knowledge that applies across **any framework, tool, or language**.

---

## 📁 Project Structure

Each lesson is organized into folders like this:

```
1_2_oop-fundamentals/
├── oop-fundamentals.md
└── exercises/
    └── encapsulation-exercise/
        ├── Main.kt              ← Starter code
        ├── Main-solution.kt     ← Complete solution
        ├── run-example.sh       ← Runs starter version
        └── run-solution.sh      ← Runs solution version
```

* Each lesson lives in a section folder like `1_2_oop-fundamentals/`
* Exercises are Kotlin console applications, runnable via `Makefile` or shell script
* Source files follow the `Main.kt` / `Main-solution.kt` naming convention

---

## 🚀 Running Examples & Solutions

> **Pre-requisite:** Make sure Kotlin is installed
> You must have `kotlinc` and `java` available in your terminal (`brew install kotlin` on macOS)

### ✅ Option 1: Using the global `Makefile`

From the **project root**, run:

```bash
make run path=path/to/exercise-folder
```

Example:

```bash
make run path=1_2_oop-fundamentals/exercises/encapsulation-exercise
```

To run the solution:

```bash
make run-solution path=1_2_oop-fundamentals/exercises/encapsulation-exercise
```

To clean generated `.jar` files in that folder:

```bash
make clean path=1_2_oop-fundamentals/exercises/encapsulation-exercise
```

---

### ✅ Option 2: Using helper shell scripts

Every exercise folder includes two convenience scripts:

```bash
./run-example.sh      # runs Main.kt
./run-solution.sh     # runs Main-solution.kt
```

These call the root Makefile with the correct path automatically.

---

## 🧼 Global Cleanup

To remove all generated `.jar` files across all exercises:

```bash
./scripts/clean-all.sh
```

This finds and deletes all `main-example.jar` and `main-solution.jar` files.

---

## 💡 Developer Utilities

To regenerate the runner scripts (`run-example.sh`, `run-solution.sh`) across all exercises:

```bash
./scripts/generate-runners.sh
```

This ensures each folder has the correct executable scripts without having to manage them manually.

---

## 🙌 Contributing & Using

Feel free to fork this project, contribute your own lessons or patterns, or use it as a mentoring guide for junior engineers on your team.

This curriculum assumes **zero knowledge of frameworks** and emphasizes **core engineering principles** with **real-world examples**.

---

## 💡 License

MIT License — use and adapt freely.

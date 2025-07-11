# Mentoring Curriculum: Foundations of Software Design

In today's fast-paced software landscape, we're constantly inundated with new technologies and layers of abstraction. 
While these advancements offer significant benefits, they can also distract us from mastering the core foundational concepts that underpin solid software development. 
This curriculum is designed to serve as both an intervention strategy for those looking to focus on fundamentals, and a refresher for those who wish to strengthen their understanding of the fundamentals.

The curriculum is organized into four sections:
1. **Foundations**
2. **Design Patterns**
3. **Additional Topics**
4. **Capstone**

---

## Section I: Foundations

### Session 1: [Introduction & Goal Setting](lessons/1_1_introduction-and-goal-setting/introduction-and-goal-setting.md)
- **Objectives:**
    - Establish the mentoring relationship and set expectations.
    - Introduce the importance of foundational principles in software design.
- **Activities:**
    - Review current knowledge.
    - Discuss real-world scenarios emphasizing the value of a strong foundation.

### Session 2: [Object-Oriented Programming (OOP) – Fundamentals](lessons/1_2_oop-fundamentals/oop-fundamentals.md)
- **Topics:**
    - Basic OOP concepts: classes, objects, encapsulation, inheritance, abstraction, and polymorphism.
- **Kotlin Exercises:**
    - Create simple classes and objects.
    - Implement encapsulation using getters and setters.

### Session 3: [Advanced OOP & Introduction to SOLID](lessons/1_3_advanced-oop-and-intro-to-solid/advanced-oop-and-introduction-to-solid.md)
- **Topics:**
    - Advanced OOP concepts: composition vs. inheritance.
    - Brief introduction to SOLID principles as a natural progression of OOP best practices.
- **Discussion:**
    - When and why to favor composition over inheritance.

### Session 4: [SOLID Principles – Single Responsibility & Open/Closed](lessons/1_4_solid-single-responsibility-and-open-closed/solid-single-responsibility-and-open-closed-principle.md)
- **Topics:**
    - **Single Responsibility Principle (SRP):** Each class should have one responsibility.
    - **Open/Closed Principle (OCP):** Software entities should be open for extension but closed for modification.
- **Kotlin Exercises:**
    - Refactor a class to adhere to SRP.
    - Extend functionality without modifying existing code to demonstrate OCP.

### Session 5: SOLID Principles – Liskov Substitution & Interface Segregation
- **Topics:**
    - **Liskov Substitution Principle (LSP):** Derived classes must be substitutable for their base classes.
    - **Interface Segregation Principle (ISP):** Create client-specific interfaces rather than one general-purpose interface.
- **Kotlin Exercises:**
    - Build an inheritance hierarchy to test substitutability.
    - Design specific interfaces for different clients.

### Session 6: SOLID Principles – Dependency Inversion
- **Topics:**
    - **Dependency Inversion Principle (DIP):** Depend on abstractions, not on concrete implementations.
- **Kotlin Exercises:**
    - Refactor code to incorporate dependency injection.
    - Discuss improvements in testability and maintainability.

### Session 7: Software Architecture – Foundations & Patterns
- **Topics:**
    - Introduction to architectural concepts: separation of concerns, layering, modularity, and scalability.
    - Overview of common architectural patterns (e.g., MVC, Clean Architecture, Hexagonal Architecture).
- **Activities:**
    - Discuss trade-offs between architectural styles (monolithic vs. microservices).
    - Sketch a simple architectural design using Kotlin.

---

## Section II: Design Patterns (Each Pattern Gets Its Own Session)

### Creational Patterns

#### Session 8: Singleton
- **Topics:**
    - Concept, benefits, and pitfalls of the Singleton pattern.
- **Kotlin Exercises:**
    - Implement a thread-safe Singleton in Kotlin.
    - Discuss scenarios where Singleton is (and isn’t) appropriate.

#### Session 9: Factory Method
- **Topics:**
    - How the Factory Method pattern provides an interface for creating objects.
- **Kotlin Exercises:**
    - Create a Factory Method example to generate different types of objects.

#### Session 10: Abstract Factory
- **Topics:**
    - Encapsulating a group of individual factories that share a common theme.
- **Kotlin Exercises:**
    - Build an abstract factory that produces families of related objects.

#### Session 11: Builder
- **Topics:**
    - Separating the construction of a complex object from its representation.
- **Kotlin Exercises:**
    - Implement the Builder pattern for constructing a complex data structure.

#### Session 12: Prototype
- **Topics:**
    - Creating new objects by cloning existing ones.
- **Kotlin Exercises:**
    - Develop a prototype example that demonstrates object cloning and customization.

### Structural Patterns

#### Session 13: Adapter
- **Topics:**
    - How to allow incompatible interfaces to work together.
- **Kotlin Exercises:**
    - Implement an Adapter to bridge between two incompatible interfaces.

#### Session 14: Bridge
- **Topics:**
    - Decoupling an abstraction from its implementation.
- **Kotlin Exercises:**
    - Create a Bridge pattern example to separate a platform-independent abstraction from platform-specific implementations.

#### Session 15: Composite
- **Topics:**
    - Organizing objects into tree structures to represent part-whole hierarchies.
- **Kotlin Exercises:**
    - Design a composite structure and traverse it using Kotlin.

#### Session 16: Decorator
- **Topics:**
    - Attaching additional responsibilities to an object dynamically.
- **Kotlin Exercises:**
    - Implement a Decorator to enhance the behavior of an object without modifying its structure.

#### Session 17: Facade
- **Topics:**
    - Providing a simplified interface to a complex subsystem.
- **Kotlin Exercises:**
    - Create a Facade for a multi-component system to streamline client interactions.

#### Session 18: Flyweight
- **Topics:**
    - Using sharing to support large numbers of fine-grained objects efficiently.
- **Kotlin Exercises:**
    - Implement a Flyweight pattern to optimize memory usage in a sample application.

#### Session 19: Proxy
- **Topics:**
    - Controlling access to an object by providing a surrogate.
- **Kotlin Exercises:**
    - Build a Proxy example to control access to a resource or perform lazy loading.

### Behavioral Patterns

#### Session 20: Chain of Responsibility
- **Topics:**
    - Passing a request along a chain of handlers.
- **Kotlin Exercises:**
    - Implement a Chain of Responsibility to handle different types of requests.

#### Session 21: Command
- **Topics:**
    - Encapsulating a request as an object.
- **Kotlin Exercises:**
    - Develop a Command pattern example that supports undo/redo operations.

#### Session 22: Interpreter
- **Topics:**
    - Defining a grammatical representation for a language and interpreting sentences.
- **Kotlin Exercises:**
    - Create a simple interpreter for a mini-language in Kotlin.

#### Session 23: Iterator
- **Topics:**
    - Providing a way to access elements of a collection sequentially.
- **Kotlin Exercises:**
    - Implement a custom Iterator for a collection class.

#### Session 24: Mediator
- **Topics:**
    - Defining an object that encapsulates how a set of objects interact.
- **Kotlin Exercises:**
    - Build a Mediator to manage communication between components in a system.

#### Session 25: Memento
- **Topics:**
    - Capturing and restoring an object’s internal state.
- **Kotlin Exercises:**
    - Implement the Memento pattern to enable state rollback in an application.

#### Session 26: Observer
- **Topics:**
    - Establishing a one-to-many dependency between objects.
- **Kotlin Exercises:**
    - Create an Observer pattern example for event handling in a Kotlin application.

#### Session 27: State
- **Topics:**
    - Allowing an object to alter its behavior when its internal state changes.
- **Kotlin Exercises:**
    - Implement the State pattern to change an object’s behavior based on its state.

#### Session 28: Strategy
- **Topics:**
    - Defining a family of algorithms and making them interchangeable.
- **Kotlin Exercises:**
    - Develop a Strategy pattern example that selects different algorithms at runtime.

#### Session 29: Template Method
- **Topics:**
    - Defining the skeleton of an algorithm, deferring some steps to subclasses.
- **Kotlin Exercises:**
    - Implement a Template Method to outline a generic process with customizable steps.

#### Session 30: Visitor
- **Topics:**
    - Representing an operation to be performed on elements of an object structure.
- **Kotlin Exercises:**
    - Create a Visitor pattern example to add operations to objects without modifying their classes.

---

## Section III: Additional Foundational Topics

### Session 31: Clean Code Principles & Refactoring Techniques
- **Topics:**
    - Best practices for writing clean, readable code.
    - Identifying code smells and applying refactoring techniques.
- **Kotlin Exercises:**
    - Refactor existing code to improve readability and maintainability.

### Session 32: Testing & TDD
- **Topics:**
    - Importance of unit testing and an introduction to Test-Driven Development.
- **Kotlin Exercises:**
    - Write unit tests for prior exercises and refactor code using TDD principles.

### Session 33: Functional Programming in Kotlin
- **Topics:**
    - Exploring Kotlin’s support for functional paradigms (e.g., higher-order functions, immutability).
- **Kotlin Exercises:**
    - Refactor an object-oriented solution using functional programming techniques.

### Session 34 (Optional): Concurrency & Asynchronous Programming
- **Topics:**
    - Basic concepts of handling concurrency and asynchronous operations in Kotlin.
- **Kotlin Exercises:**
    - Experiment with Kotlin coroutines and asynchronous patterns.

### Session 35 (Optional): Documentation & Communication
- **Topics:**
    - Best practices for code documentation and communicating design decisions.
- **Activities:**
    - Review and improve documentation on previous projects.

---

## Section IV: Capstone

### Session 36: Capstone Project & Integration
- **Activities:**
    - Define a small project that integrates OOP, SOLID, architectural principles, design patterns, and clean code practices.
    - Collaborate on designing and building the project in Kotlin.
- **Review:**
    - Discuss challenges, lessons learned, and how foundational concepts have improved the overall design and quality of the code.

---

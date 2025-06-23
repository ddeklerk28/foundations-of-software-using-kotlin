# **Lesson 4: SOLID Principles – Single Responsibility & Open/Closed**

**Section:** Foundations
**Lesson Code/Folder:** `lesson4-solid-srp-ocp`
**Estimated Duration:** 90 minutes

---

## **Description**

This lesson marks the beginning of our deeper exploration into the SOLID principles—five key guidelines that help engineers design software that is modular, scalable, testable, and easy to maintain. We start with the **Single Responsibility Principle (SRP)** and the **Open/Closed Principle (OCP)**.

By the end of this session, you’ll understand how splitting responsibilities improves cohesion and how to design software modules that are stable but open to extension. We'll work through both theoretical foundations and practical Kotlin examples. This foundational knowledge will be crucial in avoiding spaghetti code and paving the way for scalable, maintainable systems.

> 🧠 **Note:** We'll use game development as a guiding theme for our examples—but everything you learn here applies broadly to software in any domain, from financial systems to e-commerce platforms.

---

## **Learning Objectives**

By the end of this lesson, you will:

* Understand the **Single Responsibility Principle (SRP)** and how to recognize violations of it in code.
* Understand the **Open/Closed Principle (OCP)** and how to apply it using abstraction and extension.
* Learn how SRP and OCP improve code maintainability and clarity.
* Apply these principles through Kotlin-based exercises.

---

## **Prerequisites**

* Solid understanding of OOP fundamentals (encapsulation, abstraction, inheritance, and polymorphism).
* Ability to write and refactor basic Kotlin classes.

---

## **Lesson Content**

### **Key Concepts**

* **Single Responsibility Principle (SRP):** A class should have only one reason to change.
* **Open/Closed Principle (OCP):** Software entities (classes, modules, functions) should be open for extension but closed for modification.

---

### **1. Single Responsibility Principle (SRP)**

#### **Definition**

A class should have **one—and only one—reason to change.** In other words, a class should only have one job or responsibility.

#### **Why is SRP Important?**

* Makes classes easier to understand and modify.
* Reduces the risk of bugs caused by changes unrelated to a class’s primary responsibility.
* Improves modularity and enables more targeted unit testing.

#### **Real-World Analogy**

Think of a restaurant. The chef cooks, the waiter serves, and the cashier handles payments. If the chef tried to do all three, they'd be overwhelmed and inefficient. Likewise, your code should clearly separate responsibilities.

#### **Bad Example (Violating SRP)**

```kotlin
class GameManager {
    fun saveGame() { /* file operations */ }
    fun loadGame() { /* file operations */ }
    fun renderUI() { /* UI logic */ }
    fun processGameLogic() { /* game state */ }
}
```

🔴 This class has multiple responsibilities: file I/O, UI rendering, and game logic. A change to one concern (e.g., saving to a different format) could impact unrelated code.

#### **Good Example (SRP-Compliant)**

```kotlin
class GameSaver {
    fun saveGame() { /* file operations */ }
}

class UIManager {
    fun renderUI() { /* UI logic */ }
}

class GameLogic {
    fun processGameLogic() { /* game state */ }
}
```

✅ Each class now handles a distinct responsibility.

---

### **2. Open/Closed Principle (OCP)**

#### **Definition**

Classes should be **open for extension but closed for modification**. This means you should be able to add new functionality without changing existing code.

#### **Why is OCP Important?**

* Minimizes the risk of breaking existing features when requirements change.
* Encourages the use of abstraction and polymorphism.
* Makes systems more maintainable and scalable.

#### **Bad Example (Violating OCP)**

```kotlin
class DamageCalculator {
    fun calculateDamage(type: String): Int {
        return when (type) {
            "fire" -> 30
            "ice" -> 20
            else -> 10
        }
    }
}
```

🔴 If you need to support a new damage type, you must modify the class, risking existing logic.

#### **Good Example (OCP-Compliant)**

```kotlin
interface DamageStrategy {
    fun calculate(): Int
}

class FireDamage : DamageStrategy {
    override fun calculate() = 30
}

class IceDamage : DamageStrategy {
    override fun calculate() = 20
}

class DamageCalculator(private val strategy: DamageStrategy) {
    fun calculateDamage(): Int = strategy.calculate()
}
```

✅ You can now add new damage types (e.g., `LightningDamage`) without touching existing logic.

---

## **Exercise Instructions**

### **1. SRP Refactor Task**

Refactor the following class to adhere to the Single Responsibility Principle:

```kotlin
class PlayerManager {
    fun saveToFile() { /* ... */ }
    fun loadFromFile() { /* ... */ }
    fun calculateScore() { /* ... */ }
    fun updateLevel() { /* ... */ }
}
```

### **2. OCP Refactor Task**

Refactor the following class using the Strategy Pattern to support extension:

```kotlin
class RewardSystem {
    fun calculateReward(type: String): Int {
        return when (type) {
            "gold" -> 100
            "silver" -> 50
            else -> 10
        }
    }
}
```

### **(Optional Challenge)**

Implement a `NotificationSystem` that supports email and SMS notifications. Use OCP to make it extensible for future types (e.g., push notifications).

---

## **Additional Resources**

* [Kotlin Interfaces and Classes](https://kotlinlang.org/docs/classes.html)
* [Single Responsibility Video Pt.1](https://www.youtube.com/watch?v=EDRpKp6UcCg)
* [Single Responsibility Video Pt.2](https://www.youtube.com/watch?v=4iGIRJH5-CY&list=PLlLVSWZQcz2acKtqn-mOz3_IxCCLMVU-A&index=5)
* [Open-Closed Principle Video](https://www.youtube.com/watch?v=BGYXxa_4ef8&list=PLlLVSWZQcz2acKtqn-mOz3_IxCCLMVU-A&index=4)
---

## **Summary / Key Takeaways**

* **SRP** helps isolate functionality into focused, manageable modules.
* **OCP** prevents modification of working code by encouraging extension via abstraction.
* Following these principles results in more maintainable and scalable systems.

---

## **Reflection / Feedback**

* Which parts of your own codebase might benefit from applying SRP or OCP?
* Was the Strategy Pattern easy to apply? Why or why not?
* What difficulties did you face while refactoring the provided examples?

---

*Version 2.0 – Last updated: \[Insert Date]*
*Instructor Notes: Emphasize that SRP and OCP are foundational to achieving modularity in any architecture. Encourage mentees to identify SRP/OCP violations in real projects they’ve worked on.*

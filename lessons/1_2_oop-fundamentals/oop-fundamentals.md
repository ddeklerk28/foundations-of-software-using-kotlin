# **Lesson 2: Object-Oriented Programming (OOP) – Fundamentals**

**Section:** Foundations\
**Lesson Code/Folder:** `lesson2-oop-fundamentals`\
**Estimated Duration:** 90 minutes

---

## **Description**

This lesson introduces the fundamental concepts of Object-Oriented Programming (OOP), a paradigm that organizes software design around objects and data rather than logic and functions. Understanding OOP is crucial for building modular, scalable, and maintainable applications. We will explore the **four pillars of OOP: Encapsulation, Abstraction, Inheritance, and Polymorphism** and how they apply to software development. To make these concepts more relatable, we will use game development as an example, but these principles apply broadly to all types of software engineering. By the end of this lesson, you'll understand how OOP is used to create flexible and reusable software architectures.

---

## **Learning Objectives**

By the end of this lesson, you will:

- Understand the four main principles of OOP: **Encapsulation, Abstraction, Inheritance, and Polymorphism**.
- Learn how to implement OOP principles using Kotlin.
- Recognize the differences and relationships between **Encapsulation, Abstraction, and Data Hiding**.
- Apply OOP concepts to real-world scenarios, using game development as a reference point.

---

## **Prerequisites**

- Basic knowledge of programming concepts such as variables, functions, and control structures.
- A working Kotlin development environment (IntelliJ IDEA or another Kotlin-compatible IDE).

---

## **Lesson Content**

### **Key Concepts**

- **Encapsulation:** Protecting data by restricting direct access to it and exposing only necessary parts.
- **Abstraction:** Hiding implementation details while exposing essential functionalities.
- **Inheritance:** Allowing a class to inherit properties and behaviors from another class.
- **Polymorphism:** Enabling multiple behaviors through the same interface.

### **Detailed Explanation**

#### **1. Encapsulation**

Encapsulation refers to bundling the data (variables) and methods (functions) that operate on the data into a single unit, typically a class. It also involves restricting direct access to some of an object’s components, which is known as **data hiding**.

##### **Why is Encapsulation Important?**

- Prevents unintended interference with an object’s state by restricting direct access to its fields.
- Increases maintainability by making modifications easier without affecting other parts of the application.
- Encourages **information hiding**, allowing controlled access to internal states via getter and setter methods.

##### **Encapsulation Example in Kotlin:**

```kotlin
class PlayerCharacter(private var health: Int) {
    fun takeDamage(damage: Int) {
        health -= damage
        if (health < 0) health = 0
        println("Player took $damage damage. Remaining health: $health")
    }
}
```

---

#### **2. Abstraction**

Abstraction is the process of **hiding the internal details** and showing only the relevant functionalities of an object. It allows developers to work at a higher level of complexity without worrying about implementation details.

##### **Why is Abstraction Important?**

- Reduces complexity by exposing only the essential features.
- Allows changes to implementation without affecting users of the abstraction.
- Makes code easier to read and maintain.

##### **Abstraction Example in Kotlin:**

```kotlin
abstract class GameCharacter(val name: String) {
    abstract fun move()
}

class Warrior(name: String) : GameCharacter(name) {
    override fun move() {
        println("$name moves by running.")
    }
}
```

---

#### **3. Inheritance**

Inheritance is a mechanism that allows a class (child class) to acquire the properties and behaviors of another class (parent class). This promotes **code reuse** and establishes relationships between objects.

##### **Why is Inheritance Important?**

- Eliminates redundant code by allowing child classes to inherit common behavior from a base class.
- Enables hierarchical classification (e.g., a `Character` can be a `PlayerCharacter` or an `Enemy`).
- Enhances maintainability, as changes to the parent class propagate to all child classes.

##### **Inheritance Example in Kotlin:**

```kotlin
open class Character(val name: String, var health: Int) {
    open fun attack() {
        println("$name attacks!")
    }
}

class Enemy(name: String, health: Int) : Character(name, health) {
    override fun attack() {
        println("$name uses a special attack!")
    }
}
```

---

#### **4. Polymorphism**

Polymorphism means **“many forms”** and allows objects to be treated as instances of their parent class while exhibiting different behavior.

##### **Why is Polymorphism Important?**

- Increases flexibility by allowing one interface to be used for multiple data types.
- Reduces coupling by allowing dynamic method execution at runtime.
- Makes code more extendable without modifying existing classes.

##### **Polymorphism Example in Kotlin:**

```kotlin
open class NPC(val name: String) {
    open fun interact() {
        println("$name: Hello, traveler!")
    }
}

class Merchant(name: String) : NPC(name) {
    override fun interact() {
        println("$name: Would you like to buy something?")
    }
}
```

---

## **Exercise Instructions**

1. **Encapsulation Exercise:**

    - Create a `Weapon` class with a private `durability` property.
    - Provide a method called attack that will decrease the durability by 1 each time it is called. Add all necessary checks you think might be important.
    - Provide a getter method to get the current value of the durability property.
    - Bonus: Add a repair method that will restore durability by some amount.

2. **Abstraction Exercise:**

    - Define an abstract class `GameCharacter` with an abstract method `specialMove()`.
    - Implement `Mage`, `Warrior`, and `Rogue` subclasses with unique special moves.

3. **Inheritance & Polymorphism Exercise:**

    - Define a base class `GameEntity` with an `interact()` method.
    - Create subclasses `Merchant`, `QuestGiver`, and `Enemy`, each overriding `interact()`.

*(Optional Challenge)*: Implement a polymorphic function that accepts different `GameEntity` objects and prints their unique interactions.

---

## **Additional Resources**

- [Official Kotlin Documentation on Classes and Objects](https://kotlinlang.org/docs/classes.html)
- [OOP Principles with Game Development](https://bleedingedge.studio/blog/game-development-oop-in-gaming-concept-24/)

---

## **Summary / Key Takeaways**

- **Encapsulation** protects internal object states by restricting direct access.
- **Abstraction** allows us to focus on essential details while hiding complexity.
- **Inheritance** promotes code reuse by allowing one class to derive from another.
- **Polymorphism** enables dynamic method binding, making code more flexible.

---

## **Reflection / Feedback**

- How does OOP improve the organization and structure of a game project?
- Which OOP principle do you find most useful in game development?
- Provide feedback on what worked well and what could be improved in this lesson.

---
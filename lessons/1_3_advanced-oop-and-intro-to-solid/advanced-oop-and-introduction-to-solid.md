# **Lesson 3: Advanced OOP & Introduction to SOLID Principles**

**Section:** Foundations\
**Lesson Code/Folder:** `1-3_advanced-oop-and-intro-to-solid/exercises`\
**Estimated Duration:** 90 minutes

---

## **Description**

This lesson builds upon foundational OOP concepts by introducing more advanced OOP techniques and laying the groundwork for understanding the SOLID principles. SOLID is a set of five design principles intended to make software designs more understandable, flexible, and maintainable. We'll explore common challenges in object-oriented design and show how SOLID helps address them. Game development examples will continue to be used to make these ideas concrete and relatable.

---

## **Learning Objectives**

- Deepen understanding of advanced OOP concepts like composition, coupling, and cohesion.
- Understand the motivation behind the SOLID principles.
- Get a high-level introduction to each SOLID principle and how it improves software design.

---

## **Prerequisites**

- Lesson 2: OOP Fundamentals (Encapsulation, Abstraction, Inheritance, Polymorphism).
- Comfortable writing basic classes and methods in Kotlin.

---

## **Lesson Content**

### **Key Concepts**

- **Composition over Inheritance**: Favoring object composition to increase flexibility.
- **Coupling**: How dependent modules are on each other.
- **Cohesion**: How focused and related a class’s responsibilities are.
- **SOLID Principles Overview**: High-level look at each principle and why they matter.

### **Detailed Explanation**



#### **1. Composition vs Inheritance**

Inheritance can sometimes lead to rigid and fragile designs because it creates a tight coupling between the base and derived classes. When a subclass inherits from a superclass, it is tightly bound to its behavior and structure. Changes to the superclass can unintentionally affect all subclasses, making the code harder to modify or extend safely.

##### **Problems with Inheritance (🚫 BAD EXAMPLE)**

- Inflexible: You’re stuck with whatever behavior is inherited, even if it's not appropriate.
- Fragile: A change in the base class can break behavior in subclasses.
- Deep hierarchies make the code harder to understand and test.

```kotlin
// 🚫 BAD DESIGN: Using inheritance to build feature combinations
open class GameCharacter {
    fun move() = println("Character moves")
}

open class FlyingCharacter : GameCharacter() {
    fun fly() = println("Character flies")
}

class FireBreathingFlyingCharacter : FlyingCharacter() {
    fun breatheFire() = println("Character breathes fire")
}

fun main() {
    val creature = FireBreathingFlyingCharacter()
    creature.move()
    creature.fly()
    creature.breatheFire()
}
```

- The `FireBreathingFlyingCharacter` class inherits all behavior, even if it doesn’t need all of it.
- What if you now need a `SwimmingFireBreathingCharacter`? You’ll end up duplicating or twisting the hierarchy.

✅ Instead, **Composition** allows you to plug in only the behaviors you need, making your system more modular and flexible.

```kotlin
class FlyingAbility {
    fun fly() = println("Flying high!")
}

class FireBreathingAbility {
    fun breatheFire() = println("Breathing fire!")
}

class ArmorComponent(val armorRating: Int)

class Dragon(
    private val flying: FlyingAbility,
    private val fire: FireBreathingAbility,
    private val armor: ArmorComponent
) {
    fun performActions() {
        flying.fly()
        fire.breatheFire()
        println("Armor rating: ${armor.armorRating}")
    }
}
```

#### **2. Coupling and Cohesion**

Coupling and cohesion are critical qualities that influence how modular and maintainable your code is. Together, they help determine how well your code components are structured and how easily you can make changes over time.

##### **Coupling**

- **High Coupling (🚫 BAD):** Classes are tightly dependent on concrete implementations. A small change in one class can ripple through many others.
- **Low Coupling (✅ GOOD):** Classes depend on abstractions (interfaces) and communicate through clean contracts, making the system more flexible and easier to maintain.

🚫 **Bad Example of High Coupling:**

```kotlin
// PlayerManager is tightly coupled to a concrete implementation
class ChatService {
    fun sendMessage(message: String) {
        println("Chat: $message")
    }
}

class PlayerManager(private val chatService: ChatService) {
    fun levelUp() {
        println("Player leveled up!")
        chatService.sendMessage("Player reached new level!")
    }
}
```

- `PlayerManager` is directly tied to `ChatService`. If you want to change the messaging mechanism, you must edit this class.

✅ **Better Example of Low Coupling:**

```kotlin
interface MessageService {
    fun send(message: String)
}

class ChatService : MessageService {
    override fun send(message: String) {
        println("Chat: $message")
    }
}

class PlayerManager(private val messageService: MessageService) {
    fun levelUp() {
        println("Player leveled up!")
        messageService.send("Player reached new level!")
    }
}
```

- `PlayerManager` now depends on an abstraction (`MessageService`) rather than a specific class. This makes it easy to substitute with other implementations like `EmailService`, `LoggerService`, etc., without modifying the existing class.kotlin
  interface MessageService {
  fun send(message: String)
  }



**Cohesion**

- **High Cohesion (✅ GOOD):** A class has a single, well-defined responsibility and related methods.
- **Low Cohesion (🚫 BAD):** A class tries to do many unrelated things.

🚫 **Bad Example of Low Cohesion:**

```kotlin
class GameManager {
    fun manageHealth() {}
    fun manageInventory() {}
    fun spawnEnemies() {}
    fun sendChatMessage() {}
}
```

- This class handles too many responsibilities — it lacks cohesion and becomes hard to test and maintain.

✅ **Better Example of High Cohesion:**

```kotlin
class PlayerStatsManager {
    fun manageHealth() {}
    fun manageStamina() {}
}

class InventoryManager {
    fun addItem() {}
    fun removeItem() {}
}

class EnemySpawner {
    fun spawnEnemy() {}
}
```

- Each class now does one thing and does it well, following the principle of high cohesion.

- **High Cohesion**: A class does one thing and does it well.

- **Low Cohesion**: A class has unrelated responsibilities, making it hard to maintain and reuse.

**Game Example:** A `PlayerStatsManager` that handles only health, stamina, and XP is cohesive. If it also sends chat messages and spawns enemies, it's not.

#### **3. Introduction to SOLID Principles**

A brief overview of each principle with intuitive game analogies:

- **S – Single Responsibility Principle (SRP)**\
  Each class should have one reason to change.

    - *Game Example:* A `ScoreManager` handles score tracking, not player movement.

- **O – Open/Closed Principle (OCP)**\
  Software entities should be open for extension but closed for modification.

    - *Game Example:* A `BonusCalculator` can be extended for new types of bonuses without editing existing logic.

- **L – Liskov Substitution Principle (LSP)**\
  Subtypes must be substitutable for their base types without breaking the app.

    - *Game Example:* A `MagicWand` class should behave like any other `Weapon` without unexpected issues.

- **I – Interface Segregation Principle (ISP)**\
  No client should be forced to depend on methods it doesn’t use.

    - *Game Example:* Don’t make `Enemy` classes implement `Trade()` if only merchants trade.

- **D – Dependency Inversion Principle (DIP)**\
  Depend on abstractions, not concrete implementations.

    - *Game Example:* Game engine code depends on an interface like `AudioService`, not a specific `Mp3AudioPlayer` class.

---

## **Exercise Instructions**

1. **Composition Over Inheritance**

    - Create a `Monster` class composed of `AttackAbility`, `DefenseAbility`, and `MovementAbility`. Implement them as separate classes and inject them into the monster.

2. **Cohesion/Coupling Reflection**

    - Take a `GameManager` class (or create a dummy one) and split it into smaller, more cohesive classes. Identify and reduce coupling.

---

## **Additional Resou**rces

- [Kotlin Composition Guide](https://medium.com/@seungbae2/kotlin-inheritance-vs-composition-which-one-should-you-use-af1bb7cd93bc#:~:text=In%20Kotlin%2C%20composition%20can%20be,is%20an%20instance%20of%20Address%20.)
- [Understanding SOLID Principles](https://www.digitalocean.com/community/conceptual-articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design)

---

## **Summary / Key Takeaways**

- Favor composition over inheritance for flexibility.
- Aim for low coupling and high cohesion in your design.
- SOLID principles are a practical guide to writing maintainable, extensible code.

---

## **Reflection / Feedback**

- What kind of problems have you faced with rigid class hierarchies?
- Which of the SOLID principles do you think will be hardest to apply in your current work?
- Think of a real system you’ve worked on—how would you refactor it using SOLID ideas?

---

*Version 1.0 – Last updated: [Insert Date]*\
*Instructor Notes: Use concrete before/after code examples for SOLID refactoring. Encourage mentees to relate these to real systems they've built or used.*


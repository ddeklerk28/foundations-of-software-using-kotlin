// Base monster class with common behavior

open class Monster(
    val name: String,
    private val attackDamage: Int,
    private val defenseValue: Int
) {
    open fun attack() {
        println("$name attacks and deals $attackDamage damage.")
    }

    open fun defend() {
        println("$name defends and blocks up to $defenseValue damage.")
    }

    fun performActions() {
        println("=== $name's Turn ===")
        attack()
        defend()
        println()
    }
}

// Specialized monster that can fly
open class FlyingMonster(
    name: String,
    attackDamage: Int,
    defenseValue: Int
) : Monster(name, attackDamage, defenseValue) {

    open fun fly() {
        println("$name takes flight!")
    }

    override fun performActions() {
        println("=== $name's Turn ===")
        fly()
        attack()
        defend()
        println()
    }
}

// Specialized monster that walks
open class RunningMonster(
    name: String,
    attackDamage: Int,
    defenseValue: Int
) : Monster(name, attackDamage, defenseValue) {

    open fun walk() {
        println("$name runs forward!")
    }

    override fun performActions() {
        println("=== $name's Turn ===")
        walk()
        attack()
        defend()
        println()
    }
}

// Final creature subclasses

class Goblin : RunningMonster(name = "Goblin", attackDamage = 10, defenseValue = 5)

class Dragon : FlyingMonster(name = "Dragon", attackDamage = 30, defenseValue = 20)

// Entry point

fun main() {
    val goblin = Goblin()
    goblin.performActions()

    val dragon = Dragon()
    dragon.performActions()
}

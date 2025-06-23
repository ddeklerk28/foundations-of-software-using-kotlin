// Define behavior components

class AttackAbility(private val damage: Int) {
    fun attack(name: String) {
        println("$name attacks and deals $damage damage.")
    }
}

class DefenseAbility(private val defenseValue: Int) {
    fun defend(name: String) {
        println("$name defends and blocks up to $defenseValue damage.")
    }
}

class FlyingAbility {
    fun fly(name: String) {
        println("$name takes flight!")
    }
}

class WalkingAbility {
    fun walk(name: String) {
        println("$name runs forward!")
    }
}

// Compose Monster using behavior abilities

class Monster(
    private val name: String,
    private val attackAbility: AttackAbility,
    private val defenseAbility: DefenseAbility,
    private val movementBehavior: (() -> Unit) // Movement behavior injected as a function
) {
    fun performActions() {
        println("=== $name's Turn ===")
        movementBehavior()
        attackAbility.attack(name)
        defenseAbility.defend(name)
        println()
    }
}

// Entry point

fun main() {
    val goblin = Monster(
        name = "Goblin",
        attackAbility = AttackAbility(10),
        defenseAbility = DefenseAbility(5),
        movementBehavior = { WalkingAbility().walk("Goblin") }
    )

    val dragon = Monster(
        name = "Dragon",
        attackAbility = AttackAbility(30),
        defenseAbility = DefenseAbility(20),
        movementBehavior = { FlyingAbility().fly("Dragon") }
    )

    goblin.performActions()
    dragon.performActions()
}

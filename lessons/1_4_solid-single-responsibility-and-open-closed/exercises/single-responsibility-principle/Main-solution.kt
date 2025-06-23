// Refactored solution using SRP: Each class has a distinct responsibility

// Handles player-related actions
class Player(private val name: String, var health: Int = 100) {
    fun takeDamage(damage: Int) {
        health -= damage
        if (health < 0) health = 0
        println("\$name took \$damage damage. Health is now \$health.")
    }

    fun showStatus() {
        println("Player: \$name, Health: \$health")
    }
}

// Manages player's inventory
class InventoryManager {
    private val items = mutableListOf<String>()

    fun addItem(item: String) {
        items.add(item)
        println("$item added to inventory.")
    }

    fun showInventory() {
        println("Inventory: $items")
    }
}

// Responsible for enemy creation
class EnemySpawner {
    fun spawn(enemyType: String) {
        println("Spawning enemy of type: $enemyType")
    }
}

fun main() {
    // Composition of responsibilities
    val player = Player("Hero")
    val inventory = InventoryManager()
    val spawner = EnemySpawner()

    // Game simulation
    player.takeDamage(20)
    inventory.addItem("Health Potion")
    spawner.spawn("Orc")

    // Game status
    player.showStatus()
    inventory.showInventory()
}

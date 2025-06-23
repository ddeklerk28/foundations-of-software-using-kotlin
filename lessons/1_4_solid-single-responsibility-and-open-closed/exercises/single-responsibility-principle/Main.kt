// Initial implementation of GameManager that violates SRP
// Your task is to refactor this into separate classes with distinct responsibilities

class GameManager {
    private var playerName = "Hero"
    private var playerHealth = 100
    private val inventory = mutableListOf<String>()

    // Handles player damage
    fun damagePlayer(amount: Int) {
        playerHealth -= amount
        if (playerHealth < 0) playerHealth = 0
        println("$playerName took $amount damage. Health is now $playerHealth.")
    }

    // Manages inventory actions
    fun addItemToInventory(item: String) {
        inventory.add(item)
        println("$item added to inventory.")
    }

    // Spawns an enemy
    fun spawnEnemy(enemyType: String) {
        println("Spawning enemy of type: $enemyType")
    }

    // Displays overall game status
    fun showStatus() {
        println("Player: $playerName, Health: $playerHealth")
        println("Inventory: $inventory")
    }
}

fun main() {
    // TODO: Refactor GameManager into separate classes with single responsibilities.
    // Step 1: Identify the different responsibilities in GameManager.
    // Step 2: Create classes such as Player, InventoryManager, EnemySpawner, and GameController.
    // Step 3: Inject dependencies into a new version of GameManager or coordinate them from Main.
    // Step 4: Demonstrate usage by interacting with refactored components below.

    val gameManager = GameManager()
    gameManager.damagePlayer(20)
    gameManager.addItemToInventory("Health Potion")
    gameManager.spawnEnemy("Orc")
    gameManager.showStatus()
}

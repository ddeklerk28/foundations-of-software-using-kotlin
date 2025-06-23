// Abstractions for better decoupling
interface MessageService {
    fun send(message: String)
}

// Implementation of a message service
class ChatService : MessageService {
    override fun send(message: String) {
        println("Chat: $message")
    }
}

// Handles player stats only
class PlayerStatsManager {
    private var health: Int = 100
    private var stamina: Int = 50

    fun updateHealth(amount: Int) {
        health += amount
        println("Player health updated to $health")
    }

    fun updateStamina(amount: Int) {
        stamina += amount
        println("Player stamina updated to $stamina")
    }
}

// Handles inventory management only
class InventoryManager {
    private val inventory = mutableListOf<String>()

    fun addItem(item: String) {
        inventory.add(item)
        println("Item '$item' added to inventory.")
    }

    fun removeItem(item: String) {
        inventory.remove(item)
        println("Item '$item' removed from inventory.")
    }
}

// Handles enemy spawning only
class EnemySpawner {
    fun spawn(enemyType: String) {
        println("Spawning enemy of type: $enemyType")
    }
}

// Coordinates the components — lightweight GameCoordinator, no logic
class GameCoordinator(
    private val statsManager: PlayerStatsManager,
    private val inventoryManager: InventoryManager,
    private val enemySpawner: EnemySpawner,
    private val messageService: MessageService
) {
    fun performGameTick() {
        println("=== Game Tick ===")
        statsManager.updateStamina(-5)
        inventoryManager.addItem("Potion")
        enemySpawner.spawn("Goblin")
        messageService.send("Player leveled up!")
        println()
    }
}

fun main() {
    val gameCoordinator = GameCoordinator(
        statsManager = PlayerStatsManager(),
        inventoryManager = InventoryManager(),
        enemySpawner = EnemySpawner(),
        messageService = ChatService()
    )

    gameCoordinator.performGameTick()
}

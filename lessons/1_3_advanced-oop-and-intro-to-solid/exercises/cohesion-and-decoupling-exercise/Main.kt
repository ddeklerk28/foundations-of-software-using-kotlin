class ChatService {
    fun sendMessage(message: String) {
        println("Chat: $message")
    }
}

class GameManager {
    private var playerHealth: Int = 100
    private var playerStamina: Int = 50
    private val inventory = mutableListOf<String>()
    private val chatService = ChatService()

    fun updateHealth(amount: Int) {
        playerHealth += amount
        println("Player health updated to $playerHealth")
    }

    fun updateStamina(amount: Int) {
        playerStamina += amount
        println("Player stamina updated to $playerStamina")
    }

    fun addItem(item: String) {
        inventory.add(item)
        println("Item '$item' added to inventory.")
    }

    fun removeItem(item: String) {
        inventory.remove(item)
        println("Item '$item' removed from inventory.")
    }

    fun spawnEnemy(enemyType: String) {
        println("Spawning enemy of type: $enemyType")
    }

    fun sendLevelUpMessage() {
        chatService.sendMessage("Player leveled up!")
    }

    fun performGameTick() {
        println("=== Game Tick ===")
        updateStamina(-5)
        addItem("Potion")
        spawnEnemy("Goblin")
        sendLevelUpMessage()
        println()
    }
}

fun main() {
    val gameManager = GameManager()
    gameManager.performGameTick()
}

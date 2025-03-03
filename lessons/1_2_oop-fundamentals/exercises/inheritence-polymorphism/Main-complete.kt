// Exercise Solution:
open class GameEntity(val name: String) {
    open fun interact() {
        println("$name interacts in a generic way.")
    }
}

class Merchant(name: String) : GameEntity(name) {
    override fun interact() {
        println("$name: Would you like to buy something?")
    }
}

class QuestGiver(name: String) : GameEntity(name) {
    override fun interact() {
        println("$name: I have a quest for you!")
    }
}

class Enemy(name: String) : GameEntity(name) {
    override fun interact() {
        println("$name: Growls menacingly and prepares to attack!")
    }
}

// Optional Challenge Solution: Polymorphic function that accepts different GameEntity objects
fun interactWithEntities(entities: List<GameEntity>) {
    for (entity in entities) {
        println("${entity.name} appears!")
        entity.interact()
    }
}

fun main() {
    val entities: List<GameEntity> = listOf(
        Merchant("Gregory the Merchant"),
        QuestGiver("Eldrin the Wise"),
        Enemy("Orc Warrior")
    )

    for (entity in entities) {
        println("${entity.name} appears!")
        entity.interact()
    }

    // Calling polymorphic function
    interactWithEntities(entities)
}

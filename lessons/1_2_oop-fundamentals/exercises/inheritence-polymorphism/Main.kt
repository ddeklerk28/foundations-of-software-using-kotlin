// TODO: Add your solution below this line

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
}
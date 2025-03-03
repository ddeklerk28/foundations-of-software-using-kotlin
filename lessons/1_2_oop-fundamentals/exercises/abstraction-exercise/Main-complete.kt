// TODO: Add your solution to below this line:
abstract class GameCharacter(val name: String) {
    abstract fun specialMove()
}

class Mage(name: String) : GameCharacter(name) {
    override fun specialMove() {
        println("$name casts a powerful fireball!")
    }
}

class Warrior(name: String) : GameCharacter(name) {
    override fun specialMove() {
        println("$name swings a mighty sword!")
    }
}

class Rogue(name: String) : GameCharacter(name) {
    override fun specialMove() {
        println("$name performs a deadly backstab!")
    }
}

fun main() {
    val characters: List<GameCharacter> = listOf(
        Mage("Gandalf"),
        Warrior("Aragorn"),
        Rogue("Ezio")
    )

    for (character in characters) {
        println("${character.name} prepares to attack!")
        character.specialMove()
    }
}

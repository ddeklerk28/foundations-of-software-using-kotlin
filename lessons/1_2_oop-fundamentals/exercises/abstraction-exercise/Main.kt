// TODO: Add your solution to below this line:

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

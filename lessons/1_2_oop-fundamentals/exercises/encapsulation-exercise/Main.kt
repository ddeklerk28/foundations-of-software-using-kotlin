// TODO: Implement Weapon class below this comment

fun main() {
    val sword = Weapon(5)

    println("Initial durability: ${sword.getDurability()}")
    sword.attack()
    sword.attack()
    sword.repair(3)
    sword.attack()
    println("Final durability: ${sword.getDurability()}")
}
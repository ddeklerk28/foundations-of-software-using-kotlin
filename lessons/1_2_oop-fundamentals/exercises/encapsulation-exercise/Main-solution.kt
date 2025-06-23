// TODO: Implement Weapon class below this comment
class Weapon(private var durability: Int) {
    fun attack() {
        if (durability > 0) {
            durability -= 1
            println("Weapon used to attack! Remaining durability: $durability")
        } else {
            println("Weapon is broken and can no longer be used!")
        }
    }

    fun repair(amount: Int) {
        durability += amount
        println("Weapon repaired! Current durability: $durability")
    }

    fun getDurability(): Int {
        return durability
    }
}

fun main() {
    val sword = Weapon(5)

    println("Initial durability: ${sword.getDurability()}")
    sword.attack()
    sword.attack()
    sword.repair(3)
    sword.attack()
    println("Final durability: ${sword.getDurability()}")
}
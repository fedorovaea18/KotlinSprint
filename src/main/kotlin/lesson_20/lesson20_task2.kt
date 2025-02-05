package ru.fedorova.spring.lesson_20

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

fun main() {

    val healingPotion: (Player) -> Unit = { player -> player.currentHealth = player.maxHealth
        println("Текущее здоровье игрока ${player.name}: ${player.currentHealth}. Игрок ${player.name} " +
                "исцелен до максимального уровня здоровья") }

        val player = Player("Вася", 20, 100)

    healingPotion(player)

}

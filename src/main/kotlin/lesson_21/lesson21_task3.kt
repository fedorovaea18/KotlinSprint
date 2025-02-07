package ru.fedorova.spring.lesson_21

class GamePlayer(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

fun GamePlayer.isHealthy(): Boolean = currentHealth == maxHealth

fun main() {

    val gamePlayer1 = GamePlayer("Goblin", 100, 100)
    val gamePlayer2 = GamePlayer("Pupsik", 50, 100)

    println(gamePlayer1.isHealthy())
    println(gamePlayer2.isHealthy())


}


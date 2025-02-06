package ru.fedorova.spring.lesson_20

class Gamer(
    var hasKey: Boolean,
)

fun main() {

    val chekingDoor: (Gamer) -> Unit = { gamer ->
        if (gamer.hasKey) println("Игрок открыл дверь")
        else println("Дверь заперта") }

    val gamer1 = Gamer(true)
    val gamer2 = Gamer(false)

    chekingDoor(gamer1)
    chekingDoor(gamer2)

}

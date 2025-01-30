package ru.fedorova.spring.lesson_17

class Ship(
    var name: String,
    val averageSpeed: Int,
    val port: String,
) {

    var shipName: String
        get() = name
        set(value) {
            println("Имя корабля менять нельзя")
    }

}

fun main() {

    val ship = Ship("Аврора", 50, "Санкт-Петербург")

    ship.shipName = "Санта Мария"

}

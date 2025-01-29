package ru.fedorova.spring.lesson_17

class Ship(
    val name: String,
    val averageSpeed: Int,
    val port: String,
) {

    fun changeName(newName: String) {
        println("Имя корабля менять нельзя")
    }

}

fun main() {

    val ship = Ship("Аврора", 50, "Санкт-Петербург")

    ship.changeName("Санта Мария")

}

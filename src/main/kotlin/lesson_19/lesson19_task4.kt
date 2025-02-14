package ru.fedorova.spring.lesson_19

enum class Patron(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),

}

class Tank(private var currentPatron: Patron? = null) {

    fun loadPatron(patron: Patron) {
        currentPatron = patron
        println("Патрон: $patron")
    }

    fun shoot(patron: Patron) {
        println("Урон: ${patron.damage}")
    }

}

fun main() {

    val tank1 = Tank()

    tank1.loadPatron(Patron.BLUE)
    tank1.shoot(Patron.BLUE)

    tank1.loadPatron(Patron.GREEN)
    tank1.shoot(Patron.GREEN)

    tank1.loadPatron(Patron.RED)
    tank1.shoot(Patron.RED)

}

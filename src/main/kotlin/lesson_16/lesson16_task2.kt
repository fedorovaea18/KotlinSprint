package ru.fedorova.spring.lesson_16

class Circle(
    private val radius: Int,
) {

    private val pi: Double = 3.14

    fun circleLength() {
        val length = 2 * pi * radius
        println("Длина окружности: $length")
    }

    fun circleSquare() {
        val square = pi * radius * radius
        println("Площадь окружности: $square")
    }

}

fun main() {

    val circle = Circle(5)

    circle.circleLength()
    circle.circleSquare()

}

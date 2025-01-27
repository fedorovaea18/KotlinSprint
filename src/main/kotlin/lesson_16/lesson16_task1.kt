package ru.fedorova.spring.lesson_16

class Dice {

    private val number: Int = (1..6).random()

    fun showNumber() {
        println("Значение кубика: $number")
    }

}


package ru.fedorova.spring.lesson_5

const val AGE_OF_MAGORITY = 18

fun main() {

    println("Укажите свой год рождения")

    val userYearOfBirth = readLine()!!.toInt()
    val currentYear = 2024

    if ((currentYear - userYearOfBirth) >= AGE_OF_MAGORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран")
    }

}

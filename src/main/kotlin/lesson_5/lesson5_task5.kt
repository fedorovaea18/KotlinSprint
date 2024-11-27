package ru.fedorova.spring.lesson_5

fun main () {

    val winningNumbers = mutableListOf<Int>()

    for (i in 1..3) {
        val numbers = (0..42).random()
        winningNumbers.add(numbers)
    }

    val userNumbers = mutableListOf<Int>()

    println("Введите три числа от 0 до 42")

    for (i in 1..3) {
        val userInputNumber = readln().toInt()
        userNumbers.add(userInputNumber)
    }

    val matches = winningNumbers.intersect(userNumbers)
    val matchCount = matches.size

    when (matchCount) {
        3 -> println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз!")
        0 -> println("Неудача! Вы не угадали ни одного числа.")
    }

    println("Выигрышные числа: $winningNumbers")

}

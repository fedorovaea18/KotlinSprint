package ru.fedorova.spring.lesson_21

fun List<Int>.evenNumbersSum(): Int {

    return this.filter { it % 2 == 0 }.sum()

}

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)

    println("Сумма четных чисел в списке $numbers: ${numbers.evenNumbersSum()}")

}

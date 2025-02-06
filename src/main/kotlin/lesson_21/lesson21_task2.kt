package ru.fedorova.spring.lesson_21

fun List<Int>.evenNumbersSum(): Int {

    var sum = 0

    forEach {
        if (it % 2 == 0) {
            sum += it
        }
    }

    return sum

}

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)

    println("Сумма четных чисел в списке $numbers: ${numbers.evenNumbersSum()}")

}

package ru.fedorova.sprint.lesson_2

import kotlin.math.pow


fun main() {

    val sum: Int = 70_000
    val percent: Double = 16.7
    val countYears: Int = 20

    val finalSum: Double = sum * (1 + percent / 100).pow(countYears)

    println(String.format("%.3f", finalSum))

}

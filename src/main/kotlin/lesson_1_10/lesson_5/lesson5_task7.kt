package ru.fedorova.spring.lesson_1_10.lesson_5

const val DISTANCE_FACTOR = 100

fun main() {

    println("Введите расстояние поездки (в километрах)")
    val inputDistance = readln().toDouble()

    println("Введите расход топлива на 100 км (в литрах)")
    val inputFuelConsumpition = readln().toDouble()

    println("Введите текущую цену за литр топлива")
    val inputFuelPrice = readln().toDouble()

    val totalFuel = inputDistance * inputFuelConsumpition / DISTANCE_FACTOR

    val totalCost = totalFuel * inputFuelPrice

    println("Общее количество необходимого топлива: $totalFuel")
    println("Итоговая стоимость поездки: %.2f".format(totalCost))

}

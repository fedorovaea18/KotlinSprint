package ru.fedorova.spring.lesson_1_10.lesson_5

const val CM_IN_ONE_M = 100

fun main() {

    println("Введите свой вес (в килограммах)")
    val inputUserWeight = readln().toDouble()

    println("Введите свой рост (в сантиметрах)")
    val inputUserHeight = readln().toDouble()

    val userHeight = inputUserHeight / CM_IN_ONE_M

    val userIMT = inputUserWeight / (userHeight * userHeight)

    val categoryWeight = when {
        userIMT < 18.5 -> "Недостаточная масса тела"
        userIMT in 18.5..24.9 -> "Нормальная масса тела"
        userIMT in 25.0..29.9 -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("Ваш ИМТ: %.2f".format(userIMT))
    println("Ваша категория : $categoryWeight")

}

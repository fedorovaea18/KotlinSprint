package ru.fedorova.spring.lesson_5

fun main() {

    val number1 = 2
    val number2 = 6

    val mathExample = number1 + number2

    println("Для авторизации решите пример: $number1 + $number2")

    val userAnswer = readLine()!!.toInt()

    if(userAnswer == mathExample) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}

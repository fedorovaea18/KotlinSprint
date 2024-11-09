package ru.fedorova.spring.lesson_5

fun main() {

    val number1 = 3
    val number2 = 27

    println("Введите число от 0 до 42")

    val userNumber1 = readln().toInt()
    val userNumber2 = readln().toInt()

    if ((userNumber1 == number1 || userNumber1 == number2) && (userNumber2 == number1 || userNumber2 == number2)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((userNumber1 == number1 || userNumber1 == number2) || (userNumber2 == number1 || userNumber2 == number2)) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Правильные числа для победы: $number1 и $number2")
}

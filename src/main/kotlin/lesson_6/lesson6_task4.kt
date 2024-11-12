package ru.fedorova.spring.lesson_6

fun main() {

    val number = (1..9).random()
    var attempt = 5

    println("Угадайте число от 1 до 9. У вас есть $attempt попыток.")

    while (attempt > 0) {

        val userNumber = readln().toInt()

        if (userNumber == number) {
            println("Это была великолепная игра!")
            return
        } else {
            attempt--
            println("Неверно. Осталось попыток: $attempt")
        }

    }

    println("Было загадано число $number")

}

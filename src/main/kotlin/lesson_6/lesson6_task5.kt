package ru.fedorova.spring.lesson_6

fun main() {

    var attempt = 3

    println("Для входа в приложение вам необходимо доказать, что вы не бот. У вас есть $attempt попытки.")

    while (attempt > 0) {

        val number1 = (1..9).random()
        val number2 = (1..9).random()
        val hiddenNumber = number1 + number2

        println("Для авторизации решите пример: $number1 + $number2")

        val userNumber = readln().toInt()

        if (userNumber == hiddenNumber) {
            println("Добро пожаловать!")
            return
        } else {
            attempt--
            println("Неверно. Попробуй решить заново. Осталось попыток: $attempt")
        }

    }

    println("Доступ запрещен")

}

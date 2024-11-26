package ru.fedorova.spring.lesson_6

fun main() {

    var attempt = 3
    var isAuthenticated = false

    println("Для входа в приложение вам необходимо доказать, что вы не бот. У вас есть $attempt попытки.")

    while (attempt > 0) {

        val number1 = (1..9).random()
        val number2 = (1..9).random()
        val hiddenNumber = number1 + number2

        println("Для авторизации решите пример: $number1 + $number2")

        val userNumber = readln().toInt()

        if (userNumber == hiddenNumber) {
            isAuthenticated = true
            break
        } else {
            attempt--
            println("Неверно. Попробуй решить заново. Осталось попыток: $attempt")
        }

    }

    if (isAuthenticated) {
        println("Добро пожаловать!")
        return
    } else {
        println("Доступ запрещен")
    }

}

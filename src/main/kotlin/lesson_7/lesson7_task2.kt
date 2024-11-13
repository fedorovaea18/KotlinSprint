package ru.fedorova.spring.lesson_7

fun main() {

    do {

        val code = (1000..9999).random()
        println("Ваш код авторизации: $code")

        println("Введите код из смс:")
        val userInput = readln().toInt()

        if (userInput == code) {
            println("Приветствую!")
            return
        } else {
            println("Код будет выслан снова. Попробуйте ещё раз.")
        }

    } while(true)

}

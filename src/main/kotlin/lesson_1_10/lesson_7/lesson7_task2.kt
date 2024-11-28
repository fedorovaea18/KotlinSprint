package ru.fedorova.spring.lesson_1_10.lesson_7

fun main() {

    val code = (1000..9999).random()

    do {

        println("Ваш код авторизации: $code")

        println("Введите код из смс:")
        val userInput = readln().toInt()

        if (userInput == code) {
            break
        } else {
            println("Код будет выслан снова. Попробуйте ещё раз.")
        }

    } while(true)

    println("Приветствую!")

}

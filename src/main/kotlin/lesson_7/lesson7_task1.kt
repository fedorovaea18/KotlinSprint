package ru.fedorova.spring.lesson_7

fun main() {

    var password = ""

    for (i in 0 until 6) {
        if (i % 2 == 0) {
            val letter = ('a'..'z').random()
            password += letter
        } else {
            val number = (0..9).random()
            password += number
        }
    }

    println("Сгенерированный пароль: $password")

    }

package ru.fedorova.spring.lesson_1_10.lesson_7

fun main() {

    val lettersRange: CharRange = 'a'..'z'
    val numbersRange: IntRange = 0..9
    var password = ""

    for (i in 0 until 6) {
        if (i % 2 == 0) {
            val letter = lettersRange.random()
            password += letter
        } else {
            val number = numbersRange.random()
            password += number
        }
    }

    println("Сгенерированный пароль: $password")

    }

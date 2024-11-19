package ru.fedorova.spring.lesson_7

fun main() {

    println("Введите длину пароля (минимум 6 символов):")
    val userPasswordLength = readln().toInt()

    val lowercaseLettersRange: CharRange = 'a'..'z'
    val uppercaseLettersRange: CharRange = 'A'..'Z'
    val numbersRange: IntRange = 0..9

    val password: MutableList<Char> = mutableListOf()

    for (i in 0 until userPasswordLength) {
        val randomChar = (0..2).random()
        when (randomChar) {
            0 -> password.add(lowercaseLettersRange.random())
            1 -> password.add(uppercaseLettersRange.random())
            2 -> password.add(numbersRange.random().toString()[0])
        }
    }

    println("Сгенерированный пароль: ${password.joinToString("")}")

}

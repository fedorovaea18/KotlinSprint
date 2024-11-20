package ru.fedorova.spring.lesson_7

fun main() {

    println("Введите длину пароля (минимум 6 символов):")
    val userPasswordLength = readln().toInt()

    val lowercaseLettersRange: CharRange = 'a'..'z'
    val uppercaseLettersRange: CharRange = 'A'..'Z'
    val numbersRange: CharRange = '0'..'9'

    val password: MutableList<Char> = mutableListOf()

    password.add(lowercaseLettersRange.random())
    password.add(uppercaseLettersRange.random())
    password.add(numbersRange.random())

    val allChars = lowercaseLettersRange + uppercaseLettersRange + numbersRange

    for (i in 3 until userPasswordLength) {
        password.add(allChars.random())
    }

    password.shuffle()

    println("Сгенерированный пароль: ${password.joinToString("")}")

}

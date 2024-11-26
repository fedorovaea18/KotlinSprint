package ru.fedorova.spring.lesson_10

const val EVEN_INDEX = 2

fun main() {

    println("Введите длину пароля")
    val inputUserLengthPassword = readln().toInt()

    val password = generatePassword(inputUserLengthPassword)
    println("Сгенерированный пароль: $password")

}

fun generatePassword(length: Int): String {
    val numbers = 48..57
    val specialChars = 32..47
    val password = mutableListOf<Char>()

    for (i in 0 until length) {
        if (i % EVEN_INDEX == 0) {
            password.add(numbers.random().toChar())
        } else {
            password.add(specialChars.random().toChar())
        }
    }

    return password.joinToString("")

}

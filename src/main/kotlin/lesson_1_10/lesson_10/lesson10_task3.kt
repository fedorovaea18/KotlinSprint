package ru.fedorova.spring.lesson_1_10.lesson_10

const val EVEN_INDEX = 2

fun main() {

    println("Введите длину пароля")
    val inputUserLengthPassword = readln().toInt()

    val password = generatePassword(inputUserLengthPassword)
    println("Сгенерированный пароль: $password")

}

fun generatePassword(length: Int): String {
    val numbers = '0'..'9'
    val specialChars =  ' '..'/'
    val password = mutableListOf<Char>()

    for (i in 0 until length) {
        if (i % EVEN_INDEX == 0) {
            password.add(numbers.random())
        } else {
            password.add(specialChars.random())
        }
    }

    return password.joinToString("")

}

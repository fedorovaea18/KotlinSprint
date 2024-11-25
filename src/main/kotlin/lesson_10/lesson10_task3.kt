package ru.fedorova.spring.lesson_10

fun main() {

    println("Введите длину пароля")
    val inputUserLengthPassword = readln().toInt()

    val password = generatePassword(inputUserLengthPassword)
    println("Сгенерированный пароль: $password")

}

fun generatePassword(length: Int): String {
    val numbers = "0123456789"
    val specialChars = "!#$%&'()*+,-./ "
    val password = mutableListOf<Char>()

    for (i in 0 until length) {
        if (i % 2 == 0) {
            password.add(numbers.random())
        } else {
            password.add(specialChars.random())
        }
    }

    return password.joinToString("")

}

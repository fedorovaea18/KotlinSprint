package ru.fedorova.spring.lesson_16

class User(
    private val login: String,
    private val password: String,
) {

    fun validate(inputPassword: String): Boolean {
        return inputPassword == password
    }

}

fun main() {

    val user = User("user", "qwerty")

    println("Введите пароль")
    val inputPassword = readln().toString()

    val isValid = user.validate(inputPassword)

    if (isValid) {
        println("Пароль введен верно")
    } else {
        println("Пароль введен неверно")
    }

}


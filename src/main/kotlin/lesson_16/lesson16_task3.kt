package ru.fedorova.spring.lesson_16

class User(
    val login: String,
    private val password: String,
) {

    fun validation(inputPassword: String): Boolean {
        return inputPassword == password
    }

}

fun main() {

    val user = User("user", "qwerty")

    println("Введите пароль")
    val inputPassword = readln().toString()

    val isValid = user.validation(inputPassword)

    if (isValid) {
        println("Пароль введен верно")
    } else {
        println("Пароль введен неверно")
    }

}


package ru.fedorova.spring.lesson_1_10.lesson_10

const val MIN_PASSWORD_LENGTH = 4

fun main() {

    println("Введите логин")
    val inputUsername = readln().toString()

    println("Введите пароль")
    val inputUserPassword = readln().toString()

    isValidUsernameAndPassword(username = inputUsername, password = inputUserPassword)

}

fun isValidUsernameAndPassword(username: String, password: String) {
    if (username.length < MIN_PASSWORD_LENGTH  || password.length < MIN_PASSWORD_LENGTH ) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Привет, $username!")
    }
}


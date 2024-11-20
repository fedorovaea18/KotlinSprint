package ru.fedorova.spring.lesson_10

fun main() {

    println("Введите логин")
    val inputUsername = readln().toString()

    println("Введите пароль")
    val inputUserPassword = readln().toString()

    isValidUsernameAndPassword(username = inputUsername, password = inputUserPassword)

}

fun isValidUsernameAndPassword(username: String, password: String) {
    if (username.length < 4 || password.length < 4) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Привет, $username!")
    }
}


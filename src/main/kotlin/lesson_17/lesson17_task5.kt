package ru.fedorova.spring.lesson_17

class User(
    private var _login: String,
    private var _password: String,
) {

    var login: String
        get() = _login
        set(value) {
            _login = value
            println("Логин успешно изменен")
        }

    var password: String
        get() = "*".repeat(_password.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }

}

fun main() {

    val user = User("login", "password")

    user.password = "password123"

    println("Текущий пароль: ${user.password}")

    user.login = "login123"

}

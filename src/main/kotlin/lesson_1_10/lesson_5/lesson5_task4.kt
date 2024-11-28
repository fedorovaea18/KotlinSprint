package ru.fedorova.spring.lesson_1_10.lesson_5

fun main() {

    val registeredUsername = "Zaphod"
    val registeredPassword = "PanGalactic"

    println("Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля \"Heart of Gold\". " +
            "Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа.")
    val inputUsername = readln().toString()

    if (inputUsername != registeredUsername) {
        println("Пользователь не зарегистрирован. Пожалуйста, зарегистрируйтесь.")
        return
    }

    println("Введите ваш пароль")
    val inputPassword = readln().toString()

    if (inputPassword == registeredPassword) {
        println("Ваши данные проверены, и о, чудо, они верны... Пользователь \"$registeredUsername\", вам разрешено входить на борт корабля \"Heart of Gold\". " +
                "Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов...")
    } else {
        println("Пароль неверный. Доступ запрещен.")
    }
}

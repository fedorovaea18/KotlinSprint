package ru.fedorova.spring.lesson_11

fun main() {

    val user1: User = User(
        id = 1,
        login = "Krakozyabra",
        password = "pass1word",
        email = "krakozyabra@yandex.ru",
    )

    val user2: User = User(
        id = 2,
        login = "Zeliboba",
        password = "pass2word",
        email = "zeli@mail.ru",
    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)
    println()
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.email)

}


package ru.fedorova.spring.lesson_11

fun main() {

    val room: Room = Room(
        cover = "Картинка комнаты",
        name = "Комната любителей фэнтези",
        users = mutableListOf(),
    )

    val user1: User3 = User3(
        name = "Маша",
        avatar = "Картинка аватара Маши",
        status = "Разговаривает",
    )

    val user2: User3 = User3(
        name = "Петя",
        avatar = "Картинка аватара Пети",
        status = "Микрофон выключен",
    )

    room.addUser(user1)
    room.addUser(user2)

    room.updateUserStatus("Маша", "Пользователь заглушен")
    room.updateUserStatus("Петя", "Разговаривает")

}

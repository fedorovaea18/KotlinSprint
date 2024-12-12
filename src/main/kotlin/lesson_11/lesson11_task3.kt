package ru.fedorova.spring.lesson_11

class ChatUser(
    val name: String,
    val avatar: String,
    var status: String,
) {

}

class ChatRoom(
    val cover: String,
    val name: String,
    val users: MutableList<ChatUser>,
) {

    fun addUser(user: ChatUser) {
        users.add(user)
        println("Пользователь ${user.name} добавлен в $name")
    }

    fun updateUserStatus(username: String, status: String) {
        users.forEach { user ->
            if (user.name == username) {
                user.status = status
            }
        }
        println("Пользователь $username обновил статус на $status")
    }

}

fun main() {

    val room: ChatRoom = ChatRoom(
        cover = "Картинка комнаты",
        name = "Комната любителей фэнтези",
        users = mutableListOf(),
    )

    val user1: ChatUser = ChatUser(
        name = "Маша",
        avatar = "Картинка аватара Маши",
        status = "Разговаривает",
    )

    val user2: ChatUser = ChatUser(
        name = "Петя",
        avatar = "Картинка аватара Пети",
        status = "Микрофон выключен",
    )

    room.addUser(user1)
    room.addUser(user2)

    room.updateUserStatus("Маша", "Пользователь заглушен")
    room.updateUserStatus("Петя", "Разговаривает")

}

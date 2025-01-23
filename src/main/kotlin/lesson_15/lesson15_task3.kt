package ru.fedorova.spring.lesson_15

abstract class ForumUser(
    val username: String,
) {

    fun readMessage() {
        println("$username читает сообщение")
    }

    abstract fun writeMessage()

}

class User(username: String) : ForumUser(username) {
    override fun writeMessage() {
        println("$username пишет сообщение: Всем привет!")
    }

}

class Admin(username: String) : ForumUser(username) {
    override fun writeMessage() {
        println("$username пишет сообщение: Добро пожаловать на форум!")
    }

    fun deleteMessage() {
        println("$username удаляет сообщение: Привет всем!")
    }

    fun deleteUser(user: User) {
        println("$username удаляет пользователя ${user.username}")
    }

}

fun main() {

    val user1 = User("Пользователь1")

    val admin1 = Admin("Администратор1")

    user1.readMessage()
    user1.writeMessage()

    admin1.readMessage()
    admin1.writeMessage()
    admin1.deleteMessage()
    admin1.deleteUser(user1)

}

package ru.fedorova.spring.lesson_11

class ForumUser(
    val userId: Int,
    val userName: String,
)

class Message(
    val authorId: Int,
    val message: String,
)

class Forum(
    private val users: MutableList<ForumUser> = mutableListOf(),
    private val messages: MutableList<Message> = mutableListOf(),
    private var userIdCounter: Int = 1,
) {

    fun createNewUser(userName: String): ForumUser {
        val newUser = ForumUser(userIdCounter++, userName)
        users.add(newUser)
        return newUser
    }

    fun createNewMessage(authorId: Int, message: String) {
        if (authorId in users.map { it.userId }) {
            messages.add(Message(authorId, message))
        }
    }

    fun printThread() {
        for (message in messages) {
            for(user in users) {
                if (message.authorId == user.userId) {
                    println("${user.userName}: ${message.message}")
                }
            }
        }
    }

}

fun main() {

    val forum = Forum()

    val user1 = forum.createNewUser("Глаша")
    val user2 = forum.createNewUser("Даша")

    forum.createNewMessage(user1.userId, "Привет! Я Глаша. Как дела?!")
    forum.createNewMessage(user2.userId,"Привет, Глаша! А я Даша. У меня всё хорошо!")

    forum.printThread()

}

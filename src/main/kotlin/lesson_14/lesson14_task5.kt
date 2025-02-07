package ru.fedorova.spring.lesson_14

open class Message(
    val id: Int,
    val author: String,
    val text: String,
)

class ChildMessage(
    id: Int,
    author: String,
    text: String,
    val parentMessageId: Int,
) : Message(id, author, text)

class Chat {
    private val messages = mutableListOf<Message>()
    private var currentId = 1

    fun addMessage(text: String, author: String) {
        val message = Message(currentId++, author, text)
        messages.add(message)
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        val message = ChildMessage(currentId++, author, text, parentMessageId)
        messages.add(message)
    }

    fun printChat() {
        val groupedMessages = messages.groupBy {
            if (it is ChildMessage) it.parentMessageId else it.id
        }

        for ((_, messages) in groupedMessages) {
            for (message in messages) {
                if (message is ChildMessage) {
                    print("\t")
                }
                println("id: ${message.id}, Автор: ${message.author}, Сообщение: ${message.text}")
            }
        }

    }

}

fun main() {

    val chat = Chat()

    chat.addMessage("Привет", "Маша")

    chat.addThreadMessage("Привет", "Паша", 1)
    chat.addThreadMessage("Как дела?", "Вася", 1)

    chat.printChat()

}

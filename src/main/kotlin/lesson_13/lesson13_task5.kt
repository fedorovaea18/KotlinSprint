package ru.fedorova.spring.lesson_13

class PhoneBookFifth(
    private val name: String,
    private val company: String? = null,
    private val phoneNumber: String,
)

fun main() {

    try {
        println("Введите номер телефона:")
        val inputPhoneNumber = readln().toLong()
    } catch (e: Exception) {
        println("Произошла ошибка: ${e.message}")
    }

}
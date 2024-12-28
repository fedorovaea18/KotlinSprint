package ru.fedorova.spring.lesson_13

class PhoneBookSecond(val name: String, val company: String? = null, val phoneNumber: Long) {

    fun printInfo() {
        println("- Имя: $name")
        println("- Номер: $phoneNumber")
        println("- Компания: ${company ?: "<не указано>"}")
    }

}

fun main() {

    val phoneBookSecond = PhoneBookSecond("Ростислав", "Reddit", 89123456789)

    phoneBookSecond.printInfo()

}

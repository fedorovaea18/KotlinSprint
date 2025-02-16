package ru.fedorova.spring.lesson_13

class PhoneBookFourth(
    private val name: String,
    private val company: String? = null,
    private val phoneNumber: Long,
) {

    fun contactInfo() {
        println("Имя: $name, Компания: $company, Номер: $phoneNumber")
    }

}

fun main() {

    val phoneBookContacts = mutableListOf<PhoneBookFourth>()

    for (i in 1..5) {

        println("Введите имя:")
        val inputName = readln().toString()

        println("Введите название компании:")
        val inputCompany = readln().takeIf { it.isNotEmpty() }

        println("Введите номер телефона:")
        val inputPhoneNumber = readln().toLongOrNull()

        if (inputPhoneNumber != null) {
            phoneBookContacts.add(PhoneBookFourth(inputName, inputCompany, inputPhoneNumber))
        } else {
            println("Номер не введён")
        }

    }

    println("Список контактов:")
    for (contact in phoneBookContacts) {
        contact.contactInfo()
    }

}

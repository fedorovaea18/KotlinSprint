package ru.fedorova.spring.lesson_13

class PhoneBookThird(val name: String, val company: String? = null, val phoneNumber: Long) {

}

fun main() {

    val phoneBookContacts = listOf(
        PhoneBookThird("Антон", phoneNumber = 89056989487),
        PhoneBookThird("Елена", phoneNumber = 89214569887),
        PhoneBookThird("Иван", "null", 89601234789),
        PhoneBookThird("Мария", "Сбер", 89205673497),
        PhoneBookThird("Анна", "Яндекс", 89623336699)
    )

    phoneBookContacts.mapNotNull { it.company }.forEach { println(it) }

}

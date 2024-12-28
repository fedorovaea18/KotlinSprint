package ru.fedorova.spring.lesson_13

class PhoneBookThird(val name: String, val company: String?, val phoneNumber: Long) {

}

fun main() {

    val phoneBookContacts = listOf(
        PhoneBookThird("Антон", null, 89056989487),
        PhoneBookThird("Елена", null, 89214569887),
        PhoneBookThird("Иван", "null", 89601234789),
        PhoneBookThird("Мария", "Сбер", 89205673497),
        PhoneBookThird("Анна", "Яндекс", 89623336699)
    )

    phoneBookContacts.forEach { println(it.company) }

}

//Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
//
//Для того, чтобы взаимодействовать со всеми записями телефонной книги, как с одним целым, их нужно объединить в список.
//
//- создай и инициализируй (одновременно) список с 5 объектами класса-контакта;
//- 2 контакта должны принимать null для поля компании;
//- 1 контакт должен иметь название компании “null”;
//- выведи список всех существующих компаний, которые есть в телефонной книге.
package ru.fedorova.spring.lesson_17

class Quiz {

    val question: String
        get() = "Вопрос"

    var answer: String = "Ответ"
        get() = field
        set(value: String) {
            field = value
        }

}

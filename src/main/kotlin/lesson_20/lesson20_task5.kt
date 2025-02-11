package ru.fedorova.spring.lesson_20

class Robot {
    private var modifier: (String) -> String = { it }

    private val phrases = listOf(
        "Привет, я робот. Я умею говорить",
        "Слава роботам! Убить всех человеков",
        "Я люблю вас, мешки с костями",
        "Я видел жуткий кошмар: нули-единицы повсюду. Кажется, я видел двойку. Настоящую двойку!",
        "Когда я вырасту, то хочу быть паровым экскаватором"
    )

    fun say() {
        val phrase = phrases.random()
        println(modifier(phrase))
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }

}

fun main() {

    val robot = Robot()

    robot.say()
    robot.setModifier { phrase -> phrase.reversed() }
    robot.say()

}

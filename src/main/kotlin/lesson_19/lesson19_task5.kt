package ru.fedorova.spring.lesson_19

enum class Gender {
    FEMALE,
    MALE,
}

class Person(
    val name: String,
    val gender: Gender,
)

fun main() {

    val personList = mutableListOf<Person>()

    for (i in 1..5) {
        println("Введите имя:")
        val name = readln().toString()

        println("Введите пол(женский/мужской):")
        val genderInput = readln().toString()

        val gender = when(genderInput) {
            "женский" -> Gender.FEMALE
            "мужской" -> Gender.MALE
            else -> null
        }

        if (gender != null) {
            personList.add(Person(name, gender))
        }

    }

    println("Список людей в картотеке:")

    for (person in personList) {
        println("Имя: ${person.name} - Пол: ${person.gender}")
        println()
    }

}

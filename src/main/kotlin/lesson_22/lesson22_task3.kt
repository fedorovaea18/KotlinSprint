package ru.fedorova.spring.lesson_22

data class Person(
    val name: String,
    val age: Int,
    val gender: String,
)

fun main() {

    val person = Person("Геннадий", 28, "мужской")

    val (name, age, gender) = person
    println("Имя: $name, Возраст: $age, Пол: $gender")

}

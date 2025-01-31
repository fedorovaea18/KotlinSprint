package ru.fedorova.spring.lesson_19

enum class Aquarium(val fish: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),

}

fun main() {

    println("Ты можешь добавить в аквариум следующих рыб:")

    for (i in Aquarium.values()) println(i.fish)

}

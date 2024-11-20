package ru.fedorova.spring.lesson_9


fun main() {

    println("Введите пять названий ингредиентов блюда, разделяя их запятыми с пробелом:")
    val userIngredient = readln().toString()

    val sortedListOfUserIngredients: List<String> = userIngredient.split(", ").sorted()

    println("Отсортированный список ингредиентов по алфавиту:")
    sortedListOfUserIngredients.forEach {
        it -> println(it)
    }

}
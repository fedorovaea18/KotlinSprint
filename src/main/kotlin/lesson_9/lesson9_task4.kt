package ru.fedorova.spring.lesson_9


fun main() {

    println("Введите пять названий ингредиентов блюда, разделяя их запятыми с пробелом:")
    val userIngredient = readln().toString()

    val listOfUserIngredients: List<String> = userIngredient.split(", ")

    val sortedIngredients: List<String> = listOfUserIngredients.sorted()

    println("Отсортированный список ингредиентов по алфавиту:")
    sortedIngredients.forEach {
        it -> println(it)
    }

}

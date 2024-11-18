package ru.fedorova.spring.lesson_9


fun main() {

    val listOfIngredients: List<String> = listOf("мука", "яйцо", "молоко" , "сахар", "масло")

    println("В рецепте есть следующие ингредиенты:")

    for (ingredient in listOfIngredients) {
        println(ingredient)
    }

}

package ru.fedorova.spring.lesson_1_10.lesson_8

fun main() {

    val arrayOfIngredients: Array<String> = arrayOf("колбаса", "зелёный горошек", "картофель" , "морковь", "яйцо", "майонез")

    println("Введите ингредиент для поиска:")
    val userIngredient = readln().toString()

    if (arrayOfIngredients.indexOf(userIngredient) != -1) {
        println("Ингредиент $userIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }

}

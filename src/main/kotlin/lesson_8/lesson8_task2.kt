package ru.fedorova.spring.lesson_8

fun main() {

    val arrayOfIngredients: Array<String> = arrayOf("колбаса", "зелёный горошек", "картофель" , "морковь", "яйцо", "майонез")

    println("Введите ингредиент для поиска:")
    val userIngredient = readln().toString()

    var isIngredientExist = false

    for (ingredient in arrayOfIngredients) {
        if (ingredient == userIngredient) {
            println("Ингредиент $userIngredient в рецепте есть")
            isIngredientExist = true
            break
        }
    }

        if (!isIngredientExist) {
            println("Такого ингредиента в рецепте нет")
        }

    }

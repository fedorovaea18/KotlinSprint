package ru.fedorova.spring.lesson_1_10.lesson_8

fun main() {

    val arrayOfIngredients: Array<String> = arrayOf("колбаса", "зелёный горошек", "картофель" , "морковь", "яйцо", "майонез")

    println("Список ингредиентов:")
    for (ingredient in arrayOfIngredients) {
        println(ingredient)
    }

    println("Введите ингредиент, который вы хотите заменить:")
    val userChangedIngredient = readln().toString()

    val index = arrayOfIngredients.indexOf(userChangedIngredient)

    if (index == -1) {
        println("Ингредиента $userChangedIngredient в рецепте нет")
    } else {
        println("Введите ингредиент на замену:")
        val userNewIngredient = readln().toString()
        arrayOfIngredients[index] = userNewIngredient
        println("Готово! Вы сохранили следующий список:")
        for (ingredient in arrayOfIngredients) {
            println(ingredient)
        }
    }

}

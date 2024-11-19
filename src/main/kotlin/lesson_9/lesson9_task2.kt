package ru.fedorova.spring.lesson_9


fun main() {

    val listOfIngredients =  mutableListOf("мухомор", "помидор", "майонез")

    println("В рецепте есть базовые ингредиенты: $listOfIngredients")

    println("Желаете добавить ещё?")
    var userIngredient = readln().toString()

    if (userIngredient.equals("нет", ignoreCase = true)) {
        return
    } else {
        println("Какой ингредиент вы хотите добавить?")
        userIngredient = readln().toString()
        listOfIngredients.add(userIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: $listOfIngredients")
    }

}


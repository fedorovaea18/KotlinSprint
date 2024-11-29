package ru.fedorova.spring.lesson_1_10.lesson_9


fun main() {

    val ingredients = mutableSetOf<String>()

    for (i in 1..5) {
        println("Введите название ингредиента $i:")
        val userIngredient = readln().toString()
        ingredients.add(userIngredient)
    }

    val sortedListOfIngredients = ingredients.sorted().joinToString(", ")
    val firstCharOfIngredient = sortedListOfIngredients.substring(0, 1).toUpperCase()

    val finalList = firstCharOfIngredient + sortedListOfIngredients.substring(1)

    println("Список ингредиентов: $finalList")

}

//Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).
//
//- результат должен исключать повторы;
//- список должен выводиться в алфавитном порядке;
//- все элементы списка выведены в одну строку, разделяя слова запятыми;
//- первый элемент должен быть распечатан с заглавной буквы.
package ru.fedorova.spring.lesson_1_10.lesson_9


fun main() {

    val listOfIngredientsForOneDish =  listOf("яйцо", "молоко", "сливочное масло")
    val listOfCountIngredientsForOneDish = listOf(2, 50, 15)

    println("Введите количество порций омлета:")
    val userCountDishes = readln().toInt()

    val newListOfIngredients = listOfCountIngredientsForOneDish.map { it * userCountDishes }


    println("На $userCountDishes порций вам понадобится: Яиц – ${newListOfIngredients[0]}, молока – ${newListOfIngredients[1]}, сливочного масла – ${newListOfIngredients[2]}")

}

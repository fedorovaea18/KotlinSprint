package ru.fedorova.spring.lesson_8

fun main() {

    println("Введите количество плнируемых ингредиентов:")
    val userIngredientCount = readln().toInt()

    val userIngredients = Array(userIngredientCount) { "" }

    for (i in 0 until userIngredientCount) {
        println("Введите название ингредиента ${i + 1}:")
        userIngredients[i] = readln().toString()
    }

    println("Список ингредиентов: ${userIngredients.joinToString(", ")}")

}

//Напиши программу, которая должна создавать массив из определенного количества ингредиентов, которые будет вводить пользователь.
//
//- элементы вводятся по одному;
//- перед вводом элементов сначала запрашивается количество планируемых ингредиентов;
//- запрещено использовать список или динамический массив.
//
//Выведи полученные ингредиенты в консоль через запятую.

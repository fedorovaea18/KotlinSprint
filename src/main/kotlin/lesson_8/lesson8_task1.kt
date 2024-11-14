package ru.fedorova.spring.lesson_8

fun main() {

    val weekViews: IntArray = intArrayOf(10, 20, 30, 40, 5, 10, 7)

    var totalViews = 0

    for (views in weekViews) {
        totalViews += views
    }

    println("Всего просмотров за неделю: $totalViews")
}

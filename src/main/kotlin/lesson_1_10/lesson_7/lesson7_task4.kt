package ru.fedorova.spring.lesson_1_10.lesson_7

fun main() {

    println("Введите количество секунд, которые необходимо засечь:")
    val userSeconds = readln().toInt()

    for (i in userSeconds downTo 1) {
        println("Осталось секунд: $i")
        Thread.sleep(1000)
    }

    println("Время вышло!")
}

package ru.fedorova.spring.lesson_6

fun main() {

    println("Введите количество секунд")
    val seconds = readln().toInt()

    Thread.sleep(seconds * 1000L)
    println("Прошло $seconds секунд")

}

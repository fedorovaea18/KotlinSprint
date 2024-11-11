package ru.fedorova.spring.lesson_6

fun main() {

    println("Введите количество секунд")
    var seconds = readln().toInt()

    while (seconds > 0) {
        println("Прошло $seconds секунд")
        Thread.sleep(1000)
        seconds--
    }

}

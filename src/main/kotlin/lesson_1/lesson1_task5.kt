package ru.fedorova.sprint.lesson_1

fun main() {

    val countOfSeconds: Int = 6480

    val hours: Int = countOfSeconds / 3600
    val minutes: Int = (countOfSeconds - hours * 3600) / 60
    val seconds: Int = countOfSeconds - hours * 3600 - minutes * 60

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))

}

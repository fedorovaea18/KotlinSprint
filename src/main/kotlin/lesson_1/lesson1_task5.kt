package ru.fedorova.sprint.lesson_1

const val SECONDS_IN_MINUTE: Int = 60
const val SECONDS_IN_HOUR: Int = 3600

fun main() {

    val countOfSeconds: Int = 6480

    val hours: Int = countOfSeconds / SECONDS_IN_HOUR
    val minutes: Int = (countOfSeconds - hours * SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val seconds: Int = countOfSeconds - hours * SECONDS_IN_HOUR - minutes * SECONDS_IN_MINUTE

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))

}

package ru.fedorova.sprint.lesson_1

const val SECONDS_IN_MINUTE: Int = 60
const val MINUTES_IN_HOUR: Int = 60

fun main() {

    val countOfSeconds: Int = 6480

    val hours: Int = countOfSeconds / (MINUTES_IN_HOUR * SECONDS_IN_MINUTE)
    val minutes: Int = (countOfSeconds % (MINUTES_IN_HOUR * SECONDS_IN_MINUTE)) / SECONDS_IN_MINUTE
    val seconds: Int = countOfSeconds % SECONDS_IN_MINUTE

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))

}

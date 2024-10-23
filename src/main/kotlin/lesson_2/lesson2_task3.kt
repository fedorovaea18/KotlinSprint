package ru.fedorova.sprint.lesson_2

const val MINUTES_IN_HOUR: Int = 60

fun main() {

    val departureHour: Int = 9
    val departureMinute: Int = 39

    val travelTimeInMinutes: Int = 457

    val totalDepartureMinutes: Int = departureHour * MINUTES_IN_HOUR + departureMinute
    val arrivalMinutes: Int = totalDepartureMinutes + travelTimeInMinutes

    val arrivalHour: Int = arrivalMinutes / MINUTES_IN_HOUR
    val arrivalMinute: Int = arrivalMinutes % MINUTES_IN_HOUR

    print(arrivalHour)
    print(":")
    print(arrivalMinute)

}

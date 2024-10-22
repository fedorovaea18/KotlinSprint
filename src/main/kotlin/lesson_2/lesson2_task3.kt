package ru.fedorova.sprint.lesson_2

fun main() {

    val departureHour: Int = 9
    val departureMinute: Int = 39

    val travelTimeInMinutes: Int = 457

    val totalDepartureMinutes: Int = departureHour * 60 + departureMinute
    val arrivalMinutes: Int = totalDepartureMinutes + travelTimeInMinutes

    val arrivalHour: Int = arrivalMinutes / 60
    val arrivalMinute: Int = arrivalMinutes % 60

    print(arrivalHour)
    print(":")
    print(arrivalMinute)

}

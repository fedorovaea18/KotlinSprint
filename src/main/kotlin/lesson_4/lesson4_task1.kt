package ru.fedorova.sprint.lesson_4

fun main() {

    val totalTables: Int = 13

    val reservedToday: Int = 13
    val reservedTomorrow: Int = 9

    val availableToday: Boolean = totalTables > reservedToday
    val availableTomorrow: Boolean = totalTables > reservedTomorrow

    println("Доступность столиков на сегодня: $availableToday\nДоступность столиков на завтра: $availableTomorrow")

}

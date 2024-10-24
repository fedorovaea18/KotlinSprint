package ru.fedorova.sprint.lesson_4

fun main() {

    val trainingDay: Int = 5

    val handsAndPress: Boolean = trainingDay % 2 != 0
    val legsAndBack: Boolean = trainingDay % 2 == 0

    println("""
        Упражнения для рук:       $handsAndPress
        Упражнения для ног:       $legsAndBack
        Упражнения для спины:  $legsAndBack
        Упражнения для пресса: $handsAndPress
    """.trimIndent())

}

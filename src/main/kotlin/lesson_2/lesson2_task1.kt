package ru.fedorova.sprint.lesson_2

fun main() {

    val countStudents: Int = 4

    val point1: Int = 3
    val point2: Int = 4
    val point3: Int = 3
    val point4: Int = 5

    val sumPoints: Int = point1 + point2 + point3 + point4

    val averagePoints: Float = sumPoints.toFloat() / countStudents

    println(averagePoints)

}
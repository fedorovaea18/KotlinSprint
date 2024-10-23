package ru.fedorova.sprint.lesson_3

fun main() {

    val playerMove: String = "D2-D4;0"
    val parts = playerMove.split("-", ";")

    val stepFrom: String = parts[0]
    val stepTo: String = parts[1]
    val numberOfStep: Int = parts[2].toInt()

    println("$stepFrom")
    println("$stepTo")
    println("$numberOfStep")

}

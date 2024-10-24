package ru.fedorova.sprint.lesson_4

fun main() {

    val isSunny: Boolean = true
    val isTentOpen: Boolean = true
    val humidity: Int = 20
    val currentSeason: String = "winter"

    val goodConditions: Boolean = isSunny && isTentOpen && (humidity == 20) && (currentSeason != "winter")

    println("Благоприятные ли условия сейчас для роста бобовых? $goodConditions")

}

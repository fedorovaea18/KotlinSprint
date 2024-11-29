package ru.fedorova.sprint.lesson_4

const val IS_SUNNY: Boolean= true
const val IS_TENT_OPEN: Boolean = true
const val REQUIRED_HUMIDITY: Int = 20
const val BAD_SEASON: String = "зима"

fun main() {

    val isSunny = true
    val isTentOpen = true
    val humidity = 20
    val currentSeason = "зима"

    val goodConditions = (isSunny == IS_SUNNY) && (isTentOpen == IS_TENT_OPEN) && (humidity == REQUIRED_HUMIDITY) && (currentSeason != BAD_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $goodConditions")

}

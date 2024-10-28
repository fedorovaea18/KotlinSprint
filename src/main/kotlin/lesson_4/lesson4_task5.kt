package ru.fedorova.sprint.lesson_4

const val MIN_CREW_COUNT = 55
const val MAX_CREW_COUNT = 70
const val REQUIRED_CREW_FOR_DAMAGE = 70
const val MIN_FOOD_BOXES = 50

fun main() {

    println("Наличие повреждений корпуса (true/false)")
    val hasDamage = readln().toBoolean()

    println("Текущий состав экипажа")
    val crewCount = readln().toInt()

    println("Количество ящиков с провизией на борту")
    val foodBoxes = readln().toInt()

    println("Благоприятность метеоусловий (true/false)")
    val isWeatherGood = readln().toBoolean()

    if (!hasDamage && (crewCount >= MIN_CREW_COUNT && crewCount <= MAX_CREW_COUNT) && foodBoxes > MIN_FOOD_BOXES) {
        println("Корабль может отправиться в долгосрочное плавание")
    } else if (hasDamage && crewCount == REQUIRED_CREW_FOR_DAMAGE && isWeatherGood && foodBoxes >= MIN_FOOD_BOXES) {
        println("Корабль может отправиться в плавание")
    } else {
        println("Корабль не может приступить к плаванию")
    }

}

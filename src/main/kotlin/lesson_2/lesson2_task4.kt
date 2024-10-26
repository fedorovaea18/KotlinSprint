package ru.fedorova.sprint.lesson_2

const val FULL_PERCENTAGE = 100

fun main() {

    val crystalOre: Int =7
    val ironOre: Int = 11
    val buff: Int = 20

    val buffOfCrystalOre: Int = (crystalOre * buff / FULL_PERCENTAGE)
    val bufOfIronOre: Int = (ironOre * buff / FULL_PERCENTAGE)

    println(buffOfCrystalOre)
    println(bufOfIronOre)

}

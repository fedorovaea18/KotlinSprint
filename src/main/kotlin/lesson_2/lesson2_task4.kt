package ru.fedorova.sprint.lesson_2


fun main() {

    val crystalOre: Int =7
    val ironOre: Int = 11
    val buff: Double = 0.20

    val buffOfCrystalOre: Int = (crystalOre * buff).toInt()
    val bufOfIronOre: Int = (ironOre * buff).toInt()

    println(buffOfCrystalOre)
    println(bufOfIronOre)

}

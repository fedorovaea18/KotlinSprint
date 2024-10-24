package ru.fedorova.sprint.lesson_2


fun main() {

    val crystalOre: Int =7
    val ironOre: Int = 11
    val buff: Int = 20

    val buffOfCrystalOre: Int = (crystalOre * buff / 100)
    val bufOfIronOre: Int = (ironOre * buff / 100)

    println(buffOfCrystalOre)
    println(bufOfIronOre)

}

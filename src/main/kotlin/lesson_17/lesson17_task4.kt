package ru.fedorova.spring.lesson_17


class Package(
    private val numberOfPackage: Int,
    val location: String,
) {

    var currentLocation: String = location
        set(value) {
            field = value
            moveCount++
        }

    private var moveCount: Int = 0

    fun printInfo() {
        println("Номер посылки: $numberOfPackage")
        println("Текущее местоположение: $currentLocation")
        println("Количество перемещений: $moveCount")
    }

}

fun main() {

    val package1 = Package(123456, "Склад 1")

    package1.currentLocation = "Пункт обработки 1"
    package1.printInfo()
    println()
    package1.currentLocation = "Пункт обработки 2"
    package1.printInfo()

}

package ru.fedorova.spring.lesson_22

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: String,
    val distanceFromEarth: Double,
)

fun main() {

    val alphaCentauri = GalacticGuide(
        name = "Альфа Центавра",
        description = "Ближайшая к Земле звёздная система, состоящая из 3 звёзд",
        dateTime = "01.03.2025 12:00",
        distanceFromEarth = 4.3)

    val name = alphaCentauri.component1()
    val description = alphaCentauri.component2()
    val dateTime = alphaCentauri.component3()
    val distanceFromEarth = alphaCentauri.component4()

    println("Название места: $name")
    println("Описание места: $description")
    println("Дата и время события: $dateTime")
    println("Расстояние от Земли в световых годах: $distanceFromEarth")

}

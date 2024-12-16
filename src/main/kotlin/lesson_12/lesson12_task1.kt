package ru.fedorova.spring.lesson_12

class Weather {

    var dayTemperature: Int = 50
    var nightTemperature: Int = -50
    var isRaining: Boolean = false

    fun displayWeather() {
        println("Дневная температура: $dayTemperature")
        println("Ночная температура: $nightTemperature")
        println("Наличие осадков в течение суток: $isRaining")
    }

}

fun main() {

    val weather1 = Weather()
    weather1.dayTemperature = 25
    weather1.nightTemperature = 20
    weather1.isRaining = false

    val weather2 = Weather()
    weather2.dayTemperature = 10
    weather2.nightTemperature = 2
    weather2.isRaining = true

    println("Погода в первый день")
    weather1.displayWeather()

    println()

    println("Погода во второй день")
    weather2.displayWeather()

}

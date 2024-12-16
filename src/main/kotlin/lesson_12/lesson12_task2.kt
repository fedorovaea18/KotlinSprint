package ru.fedorova.spring.lesson_12

class WeatherSecond(val dayTemperature: Int, val nightTemperature: Int, val isRaining: Boolean) {

    fun displayWeather() {
        println("Дневная температура: $dayTemperature")
        println("Ночная температура: $nightTemperature")
        println("Наличие осадков в течение суток: $isRaining")
    }

}

fun main() {

    val weather = WeatherSecond(38, 10, true)

    println("Погода на сегодня")
    weather.displayWeather()

}

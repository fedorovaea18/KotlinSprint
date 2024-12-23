package ru.fedorova.spring.lesson_12

class WeatherThird(dayTemperatureInKelvin: Int, nightTemperatureInKelvin: Int, _isRaining: Boolean) {

    val dayTemperature : Int = dayTemperatureInKelvin - 273
    val nightTemperature : Int = nightTemperatureInKelvin - 273
    val isRaining = _isRaining

    fun displayWeather() {
        println("Дневная температура: $dayTemperature")
        println("Ночная температура: $nightTemperature")
        println("Наличие осадков в течение суток: $isRaining")
    }

}

fun main() {

    val weather = WeatherThird(300, 280, true)

    println("Погода на сегодня")
    weather.displayWeather()

}

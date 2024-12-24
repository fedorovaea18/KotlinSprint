package ru.fedorova.spring.lesson_12

const val KELVIN_TO_CELSIUS = 273

class WeatherFourth(dayTemperatureInKelvin: Int, nightTemperatureInKelvin: Int, _isRaining: Boolean) {

    val dayTemperature : Int = dayTemperatureInKelvin - KELVIN_TO_CELSIUS
    val nightTemperature : Int = nightTemperatureInKelvin - KELVIN_TO_CELSIUS
    val isRaining = _isRaining

    init {
        println("Дневная температура: $dayTemperature")
        println("Ночная температура: $nightTemperature")
        println("Наличие осадков в течение суток: $isRaining")
        }

    }


fun main() {

    val weather = WeatherFourth(320, 310, false)

}

package ru.fedorova.spring.lesson_12

import kotlin.random.Random

const val KELVIN_TO_CELSIUS = 273

class WeatherFifth(dayTemperatureInKelvin: Int, nightTemperatureInKelvin: Int, _isRaining: Boolean) {

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

    val weatherList = mutableListOf<WeatherFifth>()

    for (i in 1..30) {
        val dayTemperatureInKelvin = (250..300).random()
        val nightTemperatureInKelvin = (250..300).random()
        val isRaining = Random.nextBoolean()
        val weather = WeatherFifth(dayTemperatureInKelvin, nightTemperatureInKelvin, isRaining)
        weatherList.add(weather)
    }

    val dayTemperatures = weatherList.map { it.dayTemperature }
    val nightTemperatures = weatherList.map { it.nightTemperature }
    val isRaining = weatherList.map { it.isRaining }

    val averageDayTemperature = dayTemperatures.average()
    val averageNightTemperature = nightTemperatures.average()
    val isRainingCount = isRaining.count { it }

    println("Средняя дневная температура: $averageDayTemperature")
    println("Средняя ночная температура: $averageNightTemperature")
    println("Количество дней с осадками: $isRainingCount")

}

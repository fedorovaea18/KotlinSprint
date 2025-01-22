package ru.fedorova.spring.lesson_15

abstract class WeatherStationStats {

    abstract fun getData(): String

}

class Temperature(val temp: Int) : WeatherStationStats() {
    override fun getData(): String {
        return "Температура $temp градусов"
    }

}

class PrecipitationAmount(val precipitation: Int) : WeatherStationStats(){
    override fun getData(): String {
        return "Количество осадков $precipitation мм"
    }

}

class WeatherServer {

    fun sendData(stats : WeatherStationStats) {
        println("Отправка данных на сервер...")
        println(stats.getData())
    }

}

fun main() {

    val temperatureData = Temperature(10)

    val precipitationData = PrecipitationAmount(200)

    val weatherServer = WeatherServer()

    weatherServer.sendData(temperatureData)
    weatherServer.sendData(precipitationData)

}

package ru.fedorova.spring.lesson_14

open class CelestialBody(
    val name: String,
    val isAtmosphere: Boolean,
    val isLanding: Boolean,
) {

}

class Planet(
    name: String,
    isAtmosphere: Boolean,
    isLanding: Boolean,
) : CelestialBody(name, isAtmosphere, isLanding) {

    val satellites = mutableListOf<Satellite>()

    fun addSattelite(sattelite: Satellite) {
        satellites.add(sattelite)
    }

}

class Satellite(
    name: String,
    isAtmosphere: Boolean,
    isLanding: Boolean,
) : CelestialBody(name, isAtmosphere, isLanding) {

}

fun main() {

    val planet = Planet("Земля", true, true)

    val sattelite1 = Satellite("Луна", true, true)
    val sattelite2 = Satellite("Ганимед", true, false)

    planet.addSattelite(sattelite1)
    planet.addSattelite(sattelite2)

    println("Планета: ${planet.name}")
    println("Спутники: ${planet.satellites.joinToString { it.name }}")

}

//В компьютерной игре существуют планеты. У некоторых из них есть спутники.
//
//Планеты и спутники могут иметь атмосферу и могут быть пригодными для высадки.
//
//Создай родительский класс, описывающий небесные тела, и подклассы, описывающие планеты и спутники.
//
//- планета должна хранить список спутников.
//
//Создай планету с двумя спутниками и выведи в консоль название планеты и названия всех ее спутников.
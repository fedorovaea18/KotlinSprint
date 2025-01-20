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

package lesson_14

open class Liner(
    val name: String = "Лайнер",
    val speed: Int = 60,
    val countOfPassengers: Int = 500,
) {

}

class CargoShip(
    name: String,
    speed: Int,
    countOfPassengers: Int,
    val cargoCapacity: Int,
) : Liner(name, speed, countOfPassengers) {

}

class Icebreaker(
    name: String,
    speed: Int,
    countOfPassengers: Int,
    val isBreakIce: Boolean = true,
) : Liner(name, speed, countOfPassengers) {

}

fun main() {

    val liner1  = Liner()

    val cargoShip1 = CargoShip("Грузовой", 20, 15,1000)

    val icebreaker1 = Icebreaker("Ледокол", 10, 5)

}

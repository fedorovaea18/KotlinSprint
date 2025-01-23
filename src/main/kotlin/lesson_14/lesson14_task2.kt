package ru.fedorova.spring.lesson_14

open class CruiseShip(
    val name: String = "Лайнер",
    val speed: Int = 60,
    val countOfPassengers: Int = 500,
) {

    open fun load() {
        println("$name выдвигает горизонтальный трап со шкафута")
    }

    open fun shipInfo() {
        println("Название корабля: $name")
        println("Скорость корабля: $speed")
        println("Вместимость: $countOfPassengers пассажиров")
        println("Способ погрузки:")
        load()

    }

}

class Freighter(
    name: String,
    speed: Int,
    countOfPassengers: Int,
    val cargoCapacity: Int,
) : CruiseShip(name, speed, countOfPassengers) {

    override fun load() {
        println("$name активирует погрузочный кран")
    }

    override fun shipInfo() {
        super.shipInfo()
        println("Грузоподъемность: $cargoCapacity\n")
    }

}

class IcebreakerShip(
    name: String,
    speed: Int,
    countOfPassengers: Int,
    val isBreakIce: Boolean = true,
) : CruiseShip(name, speed, countOfPassengers) {

    override fun load() {
        println("$name открывает ворота со стороны кормы")
    }

    override fun shipInfo() {
        super.shipInfo()
        println("Возможность колоть лёд: $isBreakIce")
    }

}

fun main() {

    val liner1  = CruiseShip()

    val cargoShip1 = Freighter("Грузовой корабль", 20, 15,1000)

    val icebreaker1 = IcebreakerShip("Ледокол", 10, 5)

    liner1.shipInfo()
    cargoShip1.shipInfo()
    icebreaker1.shipInfo()

}


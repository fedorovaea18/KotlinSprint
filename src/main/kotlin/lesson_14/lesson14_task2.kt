package ru.fedorova.spring.lesson_14


open class ShipFirst(
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

class ShipSecond(
    name: String,
    speed: Int,
    countOfPassengers: Int,
    val cargoCapacity: Int,
) : ShipFirst(name, speed, countOfPassengers) {

    override fun load() {
        println("$name активирует погрузочный кран")
    }

    override fun shipInfo() {
        super.shipInfo()
        println("Грузоподъемность: $cargoCapacity\n")
    }

}

class ShipThird(
    name: String,
    speed: Int,
    countOfPassengers: Int,
    val isBreakIce: Boolean = true,
) : ShipFirst(name, speed, countOfPassengers) {

    override fun load() {
        println("$name открывает ворота со стороны кормы")
    }

    override fun shipInfo() {
        super.shipInfo()
        println("Возможность колоть лёд: $isBreakIce")
    }

}

fun main() {

    val liner1  = ShipFirst()

    val cargoShip1 = ShipSecond("Грузовой корабль", 20, 15,1000)

    val icebreaker1 = ShipThird("Ледокол", 10, 5)

    liner1.shipInfo()
    cargoShip1.shipInfo()
    icebreaker1.shipInfo()

}


package ru.fedorova.spring.lesson_15

interface Drivable {

    fun drive() {
    }

}

interface PassengerTransportable {

    fun loadPassengers(count: Int)
    fun unloadPassengers(count: Int)

}

interface CargoTransportable {

    fun loadCargo(weight: Int)
    fun unloadCargo(weight: Int)

}

class Truck(
    private val maxCargo: Int = 2,
    private val maxPassengers: Int = 1,
) : Drivable, PassengerTransportable, CargoTransportable {

    private var currentCargo: Int = 0
    private var currentPassengers: Int = 0

    override fun drive() {
        println("Грузовой автомобиль едет с $currentPassengers пассажирами и $currentCargo тоннами груза")
    }

    override fun loadPassengers(count: Int) {
        if (currentPassengers + count <= maxPassengers) {
            currentPassengers += count
            println("Загружен $count пассажир в грузовой автомобиль")
        }
    }

    override fun unloadPassengers(count: Int) {
        if (currentPassengers - count >= 0) {
            currentPassengers -= count
            println("Разгружен $count пассажир из грузового автомобиля")
        }
    }

    override fun loadCargo(weight: Int) {
        if (currentCargo + weight <= maxCargo) {
            currentCargo += weight
            println("Загружено $weight тонн груза в грузовой автомобиль")
        }
    }

    override fun unloadCargo(weight: Int) {
        if (currentCargo - weight >= 0) {
            currentCargo -= weight
            println("Разгружено $weight тонн груза из грузового автомобиля")
        }
    }

}

class Car(
    private val maxPassengers: Int = 3,
) : Drivable, PassengerTransportable {

    private var currentPassengers: Int = 0

    override fun drive() {
        println("Легковой автомобиль едет с $currentPassengers пассажирами")
    }

    override fun loadPassengers(count: Int) {
        if (currentPassengers + count <= maxPassengers) {
            currentPassengers += count
            println("Загружено $count пассажиров в легковой автомобиль")
        }
    }

    override fun unloadPassengers(count: Int) {
        if (currentPassengers - count >= 0) {
            currentPassengers -= count
            println("Разгружено $count пассажиров из легкового автомобиля")
        }
    }

}

fun main() {

    val truck = Truck()

    val car = Car()

    truck.loadPassengers(1)
    truck.loadCargo(2)

    car.loadPassengers(3)

    truck.drive()
    car.drive()

    truck.unloadPassengers(1)
    truck.unloadCargo(2)

    car.unloadPassengers(3)

    car.loadPassengers(2)
    car.drive()
    car.unloadPassengers(2)

}

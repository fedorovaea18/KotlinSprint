package ru.fedorova.spring.lesson_15

interface Swimmable {

    fun swim() {
    }

}

interface Flyable {

    fun fly() {
        println()
    }

}

class CrucianCarp : Swimmable {
    override fun swim() {
        println("Карась плавает в воде")
    }

}

class Seagull : Flyable {
    override fun fly() {
        println("Чайка летает в небе")
    }

}

class Duck : Swimmable, Flyable {
    override fun swim() {
        println("Утка плавает в озере")
    }

    override fun fly() {
        println("Утка летает над озером")
    }

}

fun main() {

    val crucianCarp = CrucianCarp()

    val seagull = Seagull()

    val duck = Duck()

    crucianCarp.swim()
    seagull.fly()
    duck.swim()
    duck.fly()

}

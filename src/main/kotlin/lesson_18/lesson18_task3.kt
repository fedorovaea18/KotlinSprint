package ru.fedorova.spring.lesson_18

open class Animal (val name: String) {

    open fun eat() {}

    open fun sleep() {
        println("$name -> спит")
    }

}

class Fox(name: String) : Animal(name) {

    override fun eat() {
        println("$name -> ест ягоды")
    }

}

class Dog(name: String) : Animal(name) {

    override fun eat() {
        println("$name -> ест кости")
    }

}

class Cat(name: String) : Animal(name) {

    override fun eat() {
        println("$name -> ест рыбу")
    }

}

fun main() {

    val fox = Fox("Лиса")
    val dog = Dog("Собака")
    val cat = Cat("Кошка")

    val animals: List<Animal> = listOf(fox, dog, cat)

    for (animal in animals) {
        animal.eat()
    }

}

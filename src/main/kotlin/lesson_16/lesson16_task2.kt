package ru.fedorova.spring.lesson_16

class Circle(
    private val radius: Int,
) {

    private val pi: Double = 3.14

    fun circleLength() {
        val length = 2 * pi * radius
        println("Длина окружности: $length")
    }

    fun circleSquare() {
        val square = pi * radius * radius
        println("Длина окружности: $square")
    }

}

fun main() {

    val circle = Circle(5)

    circle.circleLength()
    circle.circleSquare()

}
//Создай класс, описывающий круг. У него должны быть методы, вычисляющие длину окружности и площадь круга, используя радиус.
//
//Число Pi должно быть равным 3.14, быть недоступным в других файлах и защищенным от изменений извне.
//Радиус передается через конструктор и не виден из внешнего по отношению к классу кода.
//
//Создай объект, вызови у него методы для расчета окружности и площади и выведи данные в консоль.
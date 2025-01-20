package ru.fedorova.spring.lesson_14

abstract class Figure(
    val color: String,
) {

    abstract fun square(): Double

    abstract fun perimeter(): Double

}

class Circle(
    color: String,
    val radius: Int,
) : Figure(color) {

    override fun square(): Double {
        return 2 * Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }

}

class Rectangle(
    color: String,
    val width: Int,
    val height: Int,
) : Figure(color) {

    override fun square(): Double {
        return (width * height).toDouble()
    }

    override fun perimeter(): Double {
        return (2 * (width + height)).toDouble()
    }

}

fun main() {

    val figures = mutableListOf<Figure>()

    figures.add(Circle("black",5))
    figures.add(Circle("black",10))
    figures.add(Circle("white",17))

    figures.add(Rectangle("white",1, 100))
    figures.add(Rectangle("white",2, 5))
    figures.add(Rectangle("black",100, 1000))

    val sumOfBlackPerimeter = figures.filter { it.color == "black" }.sumOf { it.perimeter() }

    val sumOfWhiteSquare = figures.filter { it.color == "white" }.sumOf { it.square() }

    println("Сумма периметров черных фигур: $sumOfBlackPerimeter")
    println("Сумма площадей всех белых фигур: $sumOfWhiteSquare")

}

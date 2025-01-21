package ru.fedorova.spring.lesson_14

const val BLACK_COLOR = "black"
const val WHITE_COLOR = "white"

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

    figures.add(Circle(BLACK_COLOR,5))
    figures.add(Circle(BLACK_COLOR,10))
    figures.add(Circle(WHITE_COLOR,17))

    figures.add(Rectangle(WHITE_COLOR,1, 100))
    figures.add(Rectangle(WHITE_COLOR,2, 5))
    figures.add(Rectangle(BLACK_COLOR,100, 1000))

    val sumOfBlackPerimeter = figures.filter { it.color == BLACK_COLOR }.sumOf { it.perimeter() }

    val sumOfWhiteSquare = figures.filter { it.color == WHITE_COLOR }.sumOf { it.square() }

    println("Сумма периметров черных фигур: $sumOfBlackPerimeter")
    println("Сумма площадей всех белых фигур: $sumOfWhiteSquare")

}

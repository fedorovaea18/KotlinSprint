package ru.fedorova.spring.lesson_18

class Screen {

    fun draw(x: Int, y: Int): String {
        return "Нарисован круг с координатами ($x, $y)"
    }

    fun draw(x1: Int, y1: Int, x2: Int, y2: Int): String {
        return "Нарисован квадрат с координатами ($x1, $y1) и ($x2, $y2)"
    }

    fun draw(x1: Float, y1: Float, x2: Float, y2: Float): String {
        return "Нарисован квадрат с координатами ($x1, $y1) и ($x2, $y2)"
    }

    fun draw(x: Float, y: Float): String {
        return "Нарисована точка с координатами ($x, $y)"
    }

}

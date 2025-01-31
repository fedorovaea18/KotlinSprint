package ru.fedorova.spring.lesson_18

open class Box {

    open fun getSurfaceArea(): Int {
        return 0
    }

}

class RectangleBox(private val length: Int, private val width: Int, private val height: Int) : Box() {

    override fun getSurfaceArea(): Int {
        return 2 * (length * width + width * height + length * height)
    }

}

class CubeBox(private val length: Int) : Box() {

    override fun getSurfaceArea(): Int {
        return 6 * length * length
    }

}

package ru.fedorova.spring.lesson_18

open class Dice(private val side: Int) {

    open fun roll(): Int {
        return (1..side).random()
    }

}

class FourSidesDice : Dice(4) {

    override fun roll(): Int {
        val result = super.roll()
        println("Бросок 4-гранной игральной кости: $result")
        return result
    }

}

class SixSidesDice : Dice(6) {

    override fun roll(): Int {
        val result = super.roll()
        println("Бросок 6-гранной игральной кости: $result")
        return result
    }

}

class EightSidesDice : Dice(8) {

    override fun roll(): Int {
        val result = super.roll()
        println("Бросок 8-гранной игральной кости: $result")
        return result
    }

}

fun main() {

    val dice1 = FourSidesDice()
    val dice2 = SixSidesDice()
    val dice3 = EightSidesDice()

    val diceList: List<Dice> = listOf(dice1, dice2, dice3)

    for (dice in diceList) {
        dice.roll()
    }

}


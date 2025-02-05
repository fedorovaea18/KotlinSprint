package ru.fedorova.spring.lesson_20

fun main() {

    val elements = listOf("Элемент1", "Элемент2", "Элемент3", "Элемент4", "Элемент5")

    val lambdaElements = elements.map { element -> { println("Нажат элемент $element") } }

    lambdaElements.forEachIndexed { i, lambda ->
        if (i % 2 == 0) {
            lambda()
        }
    }

}

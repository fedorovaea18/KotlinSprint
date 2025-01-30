package ru.fedorova.spring.lesson_18

class Order(val orderNumber: Int) {

    fun printOrderInfo(item: String) {
        println("Заказан товар: $item")
    }

    fun printOrderInfo(items: List<String>) {
        println("Заказаны следующие товары: ${items.joinToString(", ")}")
    }

}

fun main() {

    val order1 = Order(1)
    val order2 = Order(2)

    order1.printOrderInfo("Телефон")
    order2.printOrderInfo(listOf("Холодильник", "Микроволновка", "Телевизор"))

}

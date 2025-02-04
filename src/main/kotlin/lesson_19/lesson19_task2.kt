package ru.fedorova.spring.lesson_19

enum class Category {
    CLOTHING,
    OFFICE_SUPPLIES,
    OTHER,
}

fun getNameCategory(category: Category): String {
    return when (category) {
        Category.CLOTHING -> "Одежда"
        Category.OFFICE_SUPPLIES -> "Канцелярские товары"
        Category.OTHER -> "Разное"
    }

}

class Product(
    val name: String,
    private val id: Int,
    private val category: Category,
) {

    fun productInfo() {
        println("Название товара: $name")
        println("ID товара: $id")
        println("Категория товара: ${getNameCategory(category)}")
    }

}

fun main() {

    val product1 = Product("Футболка", 1, Category.CLOTHING)
    val product2 = Product("Карандаш", 2, Category.OFFICE_SUPPLIES)
    val product3 = Product("Огурец", 3, Category.OTHER)

    product1.productInfo()
    product2.productInfo()
    product3.productInfo()

}

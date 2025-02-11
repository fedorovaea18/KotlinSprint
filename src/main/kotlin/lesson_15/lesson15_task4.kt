package ru.fedorova.spring.lesson_15

open class Product(
    val name: String,
    val count: Int,
)

interface Searchable {
    fun search(request: String): List<Product>
}

class Instrument(
    name: String,
    count: Int
) : Product(name, count), Searchable {

    private val accessories = mutableListOf<Accessory>()

    override fun search(request: String): List<Product> {
        println("Выполняется поиск")
        return accessories
    }

}

class Accessory(
    name: String,
    count: Int
) : Product(name, count)

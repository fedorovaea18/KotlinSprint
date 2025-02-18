package ru.fedorova.spring.lesson_22

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)

fun main() {

    val regularBook1 = RegularBook("Книга", "Автор")
    val regularBook2 = RegularBook("Книга", "Автор")

    val dataBook1 = DataBook("Другая книга", "Другой автор")
    val dataBook2 = DataBook("Другая книга", "Другой автор")

    println(regularBook1 == regularBook2)
    println(dataBook1 == dataBook2)

}

// При сравнении обычных классов сравниваются ссылки на объекты в памяти.
// regularBook1 и regularBook2 - это разные экземпляры класса (объекты), они занимают разные участки в памяти,
// поэтому даже имея одинаковые свойства, ответ будет false.
// А при сравнении data class сравниваются значения свойств (проиницилиизирвоанные данные), а не ссылки.
// dataBook1 и dataBook2 - это тоже разные экземпляры класса, имеющие разные участки в памяти, но с одинаковыми свойствами, поэтому ответ будет true.

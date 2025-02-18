package ru.fedorova.spring.lesson_22

class RegularBookSecond(
    val name: String,
    val author: String,
)

data class DataBookSecond(
    val name: String,
    val author: String,
)

fun main() {

    val regularBook1 = RegularBookSecond("Книга", "Автор")

    val dataBook1 = DataBookSecond("Книга", "Автор")

    println("Вывод экземпляра обычного класса: $regularBook1")
    println("Вывод экземпляра data класса: $dataBook1")

}

// Экземляр data класса выводится в консоль с использованием по умолчанию метода toString(),
// который возвращает представление объекта в виде понятной строки.
// А для обычного класса по умолчанию используется стандартный метод toString(). Он выводит строковое представление объекта.
// Для вывода строки в понятном виде необходимо переопределить метод toString().

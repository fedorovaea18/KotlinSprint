package ru.fedorova.spring.lesson_20

fun main() {

    val greeting: (String) -> String = { username -> "С наступающим Новым Годом, $username!" }
    println(greeting("Катя"))

}

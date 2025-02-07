package ru.fedorova.spring.lesson_21

fun String.vowelCount(): Int {

    val vowels = "aeiouAEIOU"
    return this.count { it in vowels }

}

fun main() {

    println("Количество гласных букв для строки \"hello\": ${"hello".vowelCount()}")

}

package ru.fedorova.spring.lesson_21

fun String.vowelCount(): Int {

    val vowels = "aeiouAEIOU"
    var count = 0

    forEach {
        if (it in vowels) {
            count++
        }
    }

    return count

}

fun main() {

    println("Количество гласных букв для строки \"hello\": ${"hello".vowelCount()}")
}

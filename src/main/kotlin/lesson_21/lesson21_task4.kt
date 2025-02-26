package ru.fedorova.spring.lesson_21

import java.io.File

fun File.prependLowercaseWord(word: String) {
    this.writeText(word.lowercase() + " " + this.readText())
}


package ru.fedorova.spring.lesson_10

fun main() {

    println("Компьютер бросает кости")
    val computerMove = getMove()

    println("Пользователь бросает кости")
    val userMove = getMove()

    val result = when {
        userMove > computerMove -> "Победило человечество"
        computerMove > userMove -> "Победила машина"
        else -> "Победила дружба"
    }

    println(result)

}

fun getMove(): Int {
    val move = (1..6).random()
    println("Выпало: $move")
    return move
}


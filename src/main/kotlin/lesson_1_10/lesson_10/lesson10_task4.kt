package ru.fedorova.spring.lesson_1_10.lesson_10

fun main() {

    var countUserWins = 0

    do {
        val result = playRound()

        if (result == "user") {
            countUserWins++
        }

        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val userContinueAnswer = readLine().toString()

    } while (userContinueAnswer == "Да")

    println("Количество выигранных партий: $countUserWins")

}

    fun getMove(): Int {
        val move = (1..6).random()
        println("Выпало: $move")
        return move
    }

    fun playRound(): String {

        println("Компьютер бросает кости")
        val computerMove = getMove()

        println("Пользователь бросает кости")
        val userMove = getMove()

        return when {
            userMove > computerMove -> "user"
            computerMove > userMove -> "computer"
            else -> "draw"
        }

    }

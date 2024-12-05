package lesson_1_10.lesson_10

const val VALID_LOGIN = "login"
const val VALID_PASSWORD = "password"

fun main() {

    println("Введите логин")
    val inputUsername = readLine().toString()

    println("Введите пароль")
    val inputUserPassword = readLine().toString()

    val token = authorize(inputUsername, inputUserPassword)

    if (token != null) {
        val basket = getBasket(token)
        if (basket != null) {
            println("Содержимое корзины:")
            basket.forEach { it -> println(it) }
        }
    } else {
        println("Неудачная авторизация")
    }

}

fun authorize(inputUsername: String, inputUserPassword: String): String? {
    return if (inputUsername == VALID_LOGIN && inputUserPassword == VALID_PASSWORD) {
        generateToken()
    } else {
        null
    }
}

fun generateToken(): String {
    val ch = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    return (1..32).map { ch.random() }.joinToString("")
}

fun getBasket(token: String): List<String>? {
    return if (token.isNotEmpty()) {
        listOf("Товар 1", "Товар 2", "Товар 3")
    } else {
        null
    }
}

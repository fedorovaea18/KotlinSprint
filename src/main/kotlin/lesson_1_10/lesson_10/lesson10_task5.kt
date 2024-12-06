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
    val number = '0'..'9'
    val symbolsUpper = 'a'..'z'
    val symbolsLower = 'A'..'Z'
    val allowedChars = number + symbolsLower + symbolsUpper
    return (1..32).map { allowedChars.random() }.joinToString("")
}

fun getBasket(token: String): List<String>? {
    return if (token.isNotEmpty()) {
        listOf("Товар 1", "Товар 2", "Товар 3")
    } else {
        null
    }
}

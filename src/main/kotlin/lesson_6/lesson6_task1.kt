package lesson_6

fun main() {

    println("Создать логин")
    val registeredUsername = readln().toString()

    println("Создать пароль")
    val registeredPassword = readln().toString()

    var isAuthenticated: Boolean

    do {
        println("Введите ваш логин:")
        val inputUsername = readln().toString()

        println("Введите ваш пароль:")
        val inputPassword = readln().toString()

        isAuthenticated = inputUsername == registeredUsername && inputPassword == registeredPassword

        if (!isAuthenticated) {
            println("Неверный логин или пароль. Попробуйте снова.")
        }

    } while (!isAuthenticated)

    println("Авторизация прошла успешно.")

}

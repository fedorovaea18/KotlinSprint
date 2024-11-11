package lesson_6

fun main() {

    println("Создать логин")
    val registeredUsername = readln().toString()

    println("Создать пароль")
    val registeredPassword = readln().toString()

    var isAuthenticated = false

    while (!isAuthenticated) {
        println("Введите ваш логин:")
        val inputUsername = readln().toString()

        println("Введите ваш пароль:")
        val inputPassword = readln().toString()

        if (inputUsername == registeredUsername && inputPassword == registeredPassword) {
            isAuthenticated = true
            println("Авторизация прошла успешно.")
        } else {
            println("Неверный логин или пароль. Попробуйте снова.")
        }
    }

}

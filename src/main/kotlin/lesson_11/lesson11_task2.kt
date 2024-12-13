package lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String,
) {

    fun infoUser() {
        println("id: $id")
        println("Логин: $login")
        println("Пароль: $password")
        println("Email: $email")
        println("О себе: $bio")
    }

    fun changeUserBio() {
        println("Введите информацию о себе:")
        val newBio = readln().toString()
        bio = newBio
    }

    fun changeUserPassword() {
        println("Введите текущий пароль:")
        val currentPassword = readln().toString()

        if (currentPassword == password) {
            println("Введите новый пароль:")
            val newPassword = readln().toString()
            password = newPassword
            println("Пароль изменен!")
        }

    }

}

fun main() {

    val user: User2 = User2(
        id = 1,
        login = "Катя",
        password = "password123",
        email = "katyaaa@yandex.ru",
        bio = "-",
    )

    user.infoUser()
    user.changeUserBio()
    user.changeUserPassword()
    println("Информация о пользователе после изменений:")
    user.infoUser()

}

package lesson_11

import ru.fedorova.spring.lesson_11.User2

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

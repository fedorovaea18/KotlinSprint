package ru.fedorova.spring.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {

}

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

class User3(
    val name: String,
    val avatar: String,
    var status: String,
) {

}

class Room(
    val cover: String,
    val name: String,
    val users: MutableList<User3>,
) {

    fun addUser(user: User3) {
        users.add(user)
        println("Пользователь ${user.name} добавлен в $name")
    }

    fun updateUserStatus(username: String, status: String) {
        users.forEach(
            { user ->
                if (user.name == username) {
                    user.status = status
                }
            }
        )
        println("Пользователь $username обновил статус на $status")
    }

}

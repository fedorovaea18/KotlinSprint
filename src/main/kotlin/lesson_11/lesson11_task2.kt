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
    println(user.id)
    println(user.login)
    println(user.password)
    println(user.email)
    println(user.bio)

}

//Скопируй класс User из первой задачи и назови User2. Добавь к классу новое необязательное свойство bio и несколько методов:
//
//- вывод информации о пользователе в консоль;
//- считывание из консоли текста и запись в поле bio;
//- изменение пароля — сначала запросить текущий пароль, и, если он введен верно, запросить новый. Записать его в поле и сообщить, что пароль изменен;
//
//Далее создай объект, заполни информацию “о себе” и замени пароль. В конце выведи обновленную информацию о пользователе.
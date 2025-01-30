package ru.fedorova.spring.lesson_17

class Folder(
    private val name: String,
    private val fileCount: Int,
    private val isSecret: Boolean,
) {

    val nameFolder: String
        get() = if (isSecret) "Скрытая папка" else name

    val fileCountFolder: Int
        get() = if (isSecret) 0 else fileCount

}

fun main() {

    val secretFolder = Folder("Папка", 10, true)

    println("Название папки: ${secretFolder.nameFolder}")
    println("Количество файлов в папке: ${secretFolder.fileCountFolder}")

}

//В приложении для хранения облачных файлов есть папки и файлы.
//
//Создай класс папки, который имеет имя, количество файлов и флаг “секретно”.
//Если флаг имеет значение true, то при попытке прочитать имя, возвращать строку “скрытая папка” и количество файлов – 0.
//В ином случае возвращать ее название и реальное количество файлов. Для реализации должны использоваться геттеры.
//
//Создай экземпляр “скрытой” папки. Протестируй попытку чтения ее данных.
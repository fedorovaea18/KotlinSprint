package ru.fedorova.sprint.lesson_2

fun main() {

    val countPermanentEmployees: Int = 50
    val salaryOfEmployees: Int = 30000

    val countInterns: Int = 30
    val salaryOfInterns: Int = 20000

    val totalEmployees: Int = countPermanentEmployees + countInterns

    val totalSalaryOfEmployees: Int = countPermanentEmployees * salaryOfEmployees
    val totalSalary: Int = totalSalaryOfEmployees + (salaryOfInterns * countInterns)
    val averageSalaryOfPermanentEmployee: Int = totalSalary / totalEmployees

    println(totalSalaryOfEmployees)
    println(totalSalary)
    println(averageSalaryOfPermanentEmployee)

}


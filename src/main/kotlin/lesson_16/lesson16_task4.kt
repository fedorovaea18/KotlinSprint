package ru.fedorova.spring.lesson_16

class Order(
    private val orderNumber: Int,
    private var status: String,
) {

    private fun updateStatus(newStatus: String) {
        status = newStatus
    }

    fun requestChangeStatus(newStatus: String) {
        updateStatus(newStatus)
    }

}


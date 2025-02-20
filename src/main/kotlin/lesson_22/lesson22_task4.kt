package ru.fedorova.spring.lesson_22

class MainScreenViewModel(
    private var mainScreenState: MainScreenState = MainScreenState(),
) {

    data class MainScreenState(
    val data: String? = null,
    val isLoading: Boolean = false,
)

    fun loadData() {
        mainScreenState = mainScreenState.copy(data = null)
        mainScreenState = mainScreenState.copy(isLoading = true)
        mainScreenState = mainScreenState.copy(data = "Загруженные данные", isLoading = false)
    }

}

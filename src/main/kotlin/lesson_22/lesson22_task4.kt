package ru.fedorova.spring.lesson_22

data class MainScreenState(
    val data: String? = null,
    val isLoading: Boolean = false,
)

class MainScreenViewModel(
    private var mainScreenState: MainScreenState = MainScreenState(),
) {

    fun loadData() {
        mainScreenState = mainScreenState.copy(data = null)
        mainScreenState = mainScreenState.copy(isLoading = true)
        mainScreenState = mainScreenState.copy(data = "Загруженные данные", isLoading = false)
    }

}

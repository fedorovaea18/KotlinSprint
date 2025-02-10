package ru.fedorova.spring.lesson_16

class Player(
    private val name: String,
    private var _health: Int,
    private var attackPower: Int,
) {

    private var health: Int
        get() = _health
        set(value) {
            _health = value
            if (_health <= 0) {
                die()
            }
        }

    fun attack(attackPower: Int) {
        if (_health > 0) {
            health -= attackPower
            println("$name получил $attackPower урона. Осталось $health здоровья")
        }
    }

    fun heal(heal: Int) {
        if (_health > 0) {
            health += heal
            println("$name восстанавливает здоровье на $heal. Осталось $health здоровья")
        }
    }

    private fun die() {
        _health = 0
        attackPower = 0
        println("$name умер. Сила удара обнулена. Лечение невозможно.")
    }

}

fun main() {

    val player = Player("Игрок", 100, 10)

    player.attack(40)
    player.heal(20)
    player.attack(50)
    player.heal(10)
    player.attack(50)

}

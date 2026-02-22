package oop_00000109253_AurickTantyrone.week03

class Player(val username: String) {

    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val Level = this.level

            xp += amount

            if (this.level > Level) {
                println("Level Up! Selamat $username naik ke level ${this.level}")
            } else {
                println("+$amount XP ditambahkan ke $username.")
            }
        } else {
            println("Jumlah XP yang ditambahkan harus lebih dari 0!")
        }
    }
}
package oop_00000109253_AurickTantyrone.week03

class Weapon(val name: String) {

    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Damage tidak boleh negatif! Damage tidak berubah.")
            } else if (value > 1000) {
                println("Damage tidak boleh melebihi batas. Damage di-set ke 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() = if (damage > 800) {
            "Legendary"
        } else if (damage > 500) {
            "Epic"
        } else {
            "Common"
        }
}
package oop_00000109253_AurickTantyrone.week07

class Weapon private constructor(
    val item: GameItem,
    val durability: Int
) {
    companion object {
        // Factory Method untuk Pedang Kayu (Starter)
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        // Factory Method untuk Pedang Epic
        fun forgeEpicSword(): Weapon {
            val epicItem = GameItem("Excalibur KW Super", 75, ItemRarity.EPIC)
            return Weapon(epicItem, 150)
        }
    }

    override fun toString(): String {
        return "Weapon(item=$item, durability=$durability)"
    }
}
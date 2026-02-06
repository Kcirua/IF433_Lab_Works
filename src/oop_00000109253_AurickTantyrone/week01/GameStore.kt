package oop_00000109253_AurickTantyrone.week01

fun main() {
    val gameTitle = "SteamKW"
    val price = 1000000

    println(calculateDiscount(price))
}

fun calculateDiscount(price: Int): Int = if (price > 500000) {
    (price * 0.8).toInt()
} else {
    (price * 0.9).toInt()
}
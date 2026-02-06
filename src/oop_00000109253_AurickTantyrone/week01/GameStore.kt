package oop_00000109253_AurickTantyrone.week01

fun main() {
    val gameTitle = "SteamKW"
    val price = 1000000
    val userNote: String? = null
//    val userNote = "test"


    val finalPrice = calculateDiscount(price)

    printReceipt(title = gameTitle, finalPrice = finalPrice, note = userNote)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) {
    (price * 0.8).toInt()
} else {
    (price * 0.9).toInt()
}

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("Judul Game : $title")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan    : ${note ?: "Tidak ada catatan"}")
}
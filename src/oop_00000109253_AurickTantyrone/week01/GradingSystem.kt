package oop_00000109253_AurickTantyrone.week01

fun main() {
    var name: String = "John Thor"
    var score: Int = 80

    // Concatenation gaya lama
    println("Nama: $name, Nilai: $score")

    // Tambahkan di bawah println
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")
}
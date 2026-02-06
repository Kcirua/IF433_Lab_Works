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
    println("Status: ${calculateStatus(score)}")

    // Tambahkan di akhir main()
    val studentId: String? = null

    // Jika null, gunakan nilai default 0
    val idLength = studentId?.length ?: 0

    println("Panjang ID: $idLength")

}

// Tulis Di Luar main()
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"

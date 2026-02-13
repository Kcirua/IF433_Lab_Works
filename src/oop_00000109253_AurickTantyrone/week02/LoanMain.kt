package oop_00000109253_AurickTantyrone.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- Perpustakaan UMN ---")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (Hari): ")
    var days = scanner.nextInt()

    if (days < 0) {
        println("Lama pinjam tidak boleh minus. Otomatis diubah ke 1 hari.")
        days = 1
    }

    val loanData = Loan(title, borrower, days)

    println("--- DETAIL PEMINJAMAN ---")
    println("Judul: ${loanData.bookTitle}")
    println("Nama: ${loanData.borrower}")
    println("Durasi: ${loanData.loanDuration} Hari")

    val fine = loanData.calculateFine()
    println("Denda: Rp $fine")
}
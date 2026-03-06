package oop_00000109253_AurickTantyrone.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        println("Pembayaran E-Wallet dari $accountName")
        if (balance >= amount) {
            balance -= amount
            println("BERHASIL. Rp $amount telah dibayar.")
            println("Sisa Saldo: Rp $balance")
        } else {
            println("GAGAL. Saldo tidak cukup (Saldo saat ini: Rp $balance).")
        }
    }

    fun topUp(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("[$accountName] Top Up Rp $amount berhasil! Saldo sekarang: Rp $balance")
        } else {
            println("[$accountName] Gagal Top Up. Nominal harus lebih dari 0.")
        }
    }
}
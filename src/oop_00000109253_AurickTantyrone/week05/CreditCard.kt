package oop_00000109253_AurickTantyrone.week05

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        println("Memproses Pembayaran Kartu Kredit untuk $accountName")

        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Status: BERHASIL. Rp $amount telah dibayar.")
            println("Sisa Limit Kartu: Rp ${limit - usedAmount}")
        } else {
            println("Status: DITOLAK. Transaksi melebihi limit kartu!")
            println("(Limit: Rp $limit, Terpakai: Rp $usedAmount, Coba bayar: Rp $amount)")
        }
    }
}
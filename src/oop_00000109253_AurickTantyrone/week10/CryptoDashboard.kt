package oop_00000109253_AurickTantyrone.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Response Status: ${response.status}")
    println("--- Coin Details ---")

    response.data.forEach { coin ->
        println("Coin Name: ${coin.name} | Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TXN001", 0.05))
    txRepo.add(Transaction("TXN002", 1.5))
    txRepo.add(Transaction("TXN003", 250.0))

    println("Berhasil menambahkan ${txRepo.getAll().size} transaksi ke repositori.")
}
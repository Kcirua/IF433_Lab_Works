package oop_00000109253_AurickTantyrone.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw FeederException.DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FeederException.FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    try {
        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
    } catch (e: FeederException.DispenserJamException) {
        println(e.message)
    } catch (e: FeederException.FoodEmptyException) {
        println(e.message)
    } catch (e: Exception) {
        println("Error umum: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    val result = runCatching {
        dispenseKibble(requestedGram = 30, availableGram = 1000, isJammed = false)
    }.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }.onFailure { error ->
        println("Peringatan ke Pemilik: ${error.message}")
        println("(Opsional: Berikan chicken jerky secara manual)")
    }
}
package oop_00000109253_AurickTantyrone.week13

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            id = parts[0].toInt(),
            symbol = parts[1],
            type = parts[2],
            margin = parts[3].toDouble(),
            pnl = parts[4].toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { out ->
        trades.forEach {
            out.println(it.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("(Log) File tidak ditemukan di path: $path")
        emptyList()
    }
}

fun main() {
    val mockTrades = listOf(
        TradeRecord(id = 1, symbol = "BTCUSDT", type = "Long", margin = 500.0, pnl = 45.5),
        TradeRecord(id = 2, symbol = "ETHUSDT", type = "Short", margin = 200.0, pnl = -12.0),
        TradeRecord(id = 3, symbol = "SOLUSDT", type = "Long", margin = 150.0, pnl = 25.0)
    )

    saveTrades(mockTrades, "crypto_trades.csv")
    File("crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")

    val loadedData = loadTrades("crypto_trades.csv")
    val totalPnl = loadedData.sumOf { it.pnl }

    println("=== HASIL LOAD TRADES ===")
    loadedData.forEach { println(it) }
    println("\nTotal PnL Bersih: $totalPnl")
}
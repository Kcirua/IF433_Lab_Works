package oop_00000109253_AurickTantyrone.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog(pair = "BTCUSDT", position = "Long", leverage = 20, roe = 45.5, status = "CLOSED"),
        TradeLog(pair = "ETHUSDT", position = "Short", leverage = 10, roe = -12.3, status = "CLOSED"),
        TradeLog(pair = "BTCUSDT", position = "Short", leverage = 50, roe = 110.0, status = "OPEN"),
        TradeLog(pair = "SOLUSDT", position = "Long", leverage = 5, roe = -5.0, status = "CLOSED"),
        TradeLog(pair = "ETHUSDT", position = "Long", leverage = 15, roe = 18.2, status = "OPEN"),
        TradeLog(pair = "BTCUSDT", position = "Long", leverage = 25, roe = -8.7, status = "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    val winningTrades = closedTrades.filter { it.roe > 0 }

    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position.uppercase()}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position.uppercase()}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")
    topPerformersString.forEach { println(it) }

    worstPerformersString.forEach { println(it) }
    println(uniquePairs)

    ////
}
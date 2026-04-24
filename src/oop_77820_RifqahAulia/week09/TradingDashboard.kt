package oop_77820_RifqahAulia.week09


fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 15, 8.1, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 25, 12.0, "CLOSED"),
        TradeLog("BNBUSDT", "SHORT", 5, -2.5, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 10, 3.4, "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val uniquePairs = tradeHistory.map { it.pair }.toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")

    println("\n--- TOP PERFORMERS ---")
    topPerformersString.forEach { println(it) }

    println("\n--- WORST PERFORMERS ---")
    worstPerformersString.forEach { println(it) }

    println("\n--- UNIQUE PAIRS ---")
    println(uniquePairs)
}
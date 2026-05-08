package oop_77820_RifqahAulia.week10

fun main() {

    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 2500.0))

    val response = ApiResponse(
        "200 OK",
        coinRepo.getAll()
    )

    println("Status Response: ${response.status}")

    response.data.forEach {

        println("Coin: ${it.name}, Balance: ${it.balance}")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 50000.0))
    txRepo.add(Transaction("TX002", 120000.0))
}
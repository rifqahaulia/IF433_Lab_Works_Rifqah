package oop_77820_RifqahAulia.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")
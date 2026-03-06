package oop_77820_RifqahAulia.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran sebesar Rp$amount berhasil menggunakan Credit Card milik $accountName. Total terpakai: Rp$usedAmount dari limit Rp$limit")
        } else {
            println("Transaksi ditolak")
        }
    }
}
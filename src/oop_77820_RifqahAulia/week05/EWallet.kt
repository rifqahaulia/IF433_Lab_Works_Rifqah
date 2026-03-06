package oop_77820_RifqahAulia.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran sebesar Rp$amount berhasil menggunakan E-Wallet milik $accountName. Sisa saldo: Rp$balance")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("$accountName melakukan top up sebesar Rp$amount. Saldo sekarang: Rp$balance")
    }
}
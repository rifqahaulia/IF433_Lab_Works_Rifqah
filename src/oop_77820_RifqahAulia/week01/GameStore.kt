package oop_77820_RifqahAulia.week01

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price * 20 / 100
    else price * 10 / 100

fun printReceipt(title: String, finalPrice: Int, userNote: String?) {

    println("=== STRUK PEMBELIAN ===")
    println("Judul Game : $title")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan    : ${userNote ?: "Tidak ada catatan"}")
}

fun main() {

    val gameTitle = "Cyber Adventure"
    val price = 750000
    val userNote: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        userNote = userNote
    )
}

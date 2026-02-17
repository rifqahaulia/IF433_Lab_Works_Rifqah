package oop_77820_RifqahAulia.week01

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price * 20 / 100
    else price * 10 / 100

fun main() {

    val gameTitle = "Cyber Adventure"
    val price = 750000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount
}

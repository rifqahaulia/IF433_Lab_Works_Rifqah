package oop_77820_RifqahAulia.week08

//lupa kasih commit 5 di keterangan pas mau push
fun main() {

    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name
        ?: "Kota Tidak Diketahui"

    println("Tujuan pengiriman: $destination")
}
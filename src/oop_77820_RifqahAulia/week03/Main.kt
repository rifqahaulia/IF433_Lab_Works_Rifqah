package oop_77820_RifqahAulia.week03

fun main() {
    val e = Employee("Budi")

    println("----- Test Normal -----")
    e.salary = 5000
    println("Gaji sekarang: ${e.salary}")

    println("\n----- Test Negatif -----")
    e.salary = -1000
    println("Gaji sekarang: ${e.salary}")
}
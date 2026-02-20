package oop_77820_RifqahAulia.week03

fun main() {

    val weapon = Weapon("Excalibur")

    weapon.damage = -50     // Harus gagal
    println("Damage sekarang: ${weapon.damage}")

    weapon.damage = 9999    // Harus jadi 1000
    println("Damage sekarang: ${weapon.damage}")

    println("Tier weapon: ${weapon.tier}")
}
package oop_77820_RifqahAulia.week04
open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }
    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
}
package oop_77820_RifqahAulia.week03

class Employee(val name: String) {

    var salary: Int = 0
        set(value) {
            field = if (value < 0) 0 else value
        }

    private var performanceRating: Int = 3

    fun increasePerformance() {
        performanceRating++
    }

    fun printStatus() {
        println("Karyawan: $name")
        println("Gaji: $salary")
        println("Rating: $performanceRating")
        println("Pajak (10%): $tax")
    }

    val tax: Double
        get() = salary * 0.1
}
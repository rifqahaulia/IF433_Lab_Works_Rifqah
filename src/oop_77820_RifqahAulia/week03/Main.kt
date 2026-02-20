package oop_77820_RifqahAulia.week03

fun main() {
    val e = Employee("Budi")

    // 1. Test Validasi Salary
    e.salary = -1000   // Harusnya print error
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // 2. Test Encapsulation
    e.increasePerformance()
    // e.performanceRating = 5  // Kalau di-uncomment pasti error (karena private)

    // 3. Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")
}
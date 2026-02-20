package oop_77820_RifqahAulia.week03

class Employee(val name: String) {

    // Salary dengan validasi
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }

    // Private property (Encapsulation)
    private var performanceRating: Int = 3

    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }

    // Computed Property (Custom Getter)
    // Pajak 10% dari salary
    val tax: Double
        get() = salary * 0.1
}
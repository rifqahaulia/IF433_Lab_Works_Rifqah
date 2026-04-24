package oop_77820_RifqahAulia.week09


fun main() {
    println("=== TEST MAP ===")

    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A"
    )

    println("Nilai Bob: ${studentGrades["Bob"]}")

    val inventory = mutableMapOf("Apples" to 50, "Bananas" to 30)
    inventory["Oranges"] = 20
    inventory["Apples"] = 45

    println("Inventory: $inventory")
}
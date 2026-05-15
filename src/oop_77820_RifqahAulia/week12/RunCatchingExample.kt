package oop_77820_RifqahAulia.week12

fun main() {

    println("=== TEST RUNCATCHING ===")

    val result: Result<Int> = runCatching {
        "42X".toInt()
    }

    val safeValue = result.getOrElse { -1 }

    println("Safe Value (getOrElse): $safeValue")

    val recovered = result.recover { 0 }.getOrNull()

    println("Recovered Value: $recovered")
}
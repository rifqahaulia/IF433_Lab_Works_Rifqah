package oop_77820_RifqahAulia.week12

fun main() {

    println("=== TEST RUNCATCHING ===")

    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}
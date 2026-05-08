package oop_77820_RifqahAulia.week10

class MathBox<T : Number>(
    val value1: T,
    val value2: T
) {

    fun sum(): Double {

        return value1.toDouble() + value2.toDouble()
    }
}

fun <T> compareValues(a: T, b: T): T
        where T : Comparable<T> {

    return if (a > b) a else b
}
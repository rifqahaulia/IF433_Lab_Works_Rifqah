package oop_77820_RifqahAulia.week01

fun calculateStatus(score: Int) =
    if (score > 75) "Lulus" else "Tidak Lulus"

fun main() {

    val name: String = "Aulia"
    val score: Int = 95

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Nama: $name, Nilai: $score, Grade User: $grade, Status: ${calculateStatus(score)}")

    val studentId: String? = null

    val idLength = studentId?.length ?: 0

    println("Panjang ID: $idLength")
}

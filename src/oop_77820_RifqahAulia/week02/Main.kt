package oop_77820_RifqahAulia.week02

import java.util.Scanner

fun main() {

    val input = Scanner(System.`in`)

    println("=== Sistem Pendaftaran Mahasiswa ===")
    println("1. Daftar dengan jurusan")
    println("2. Daftar tanpa jurusan")
    print("Pilih menu: ")
    val choice = input.nextInt()
    input.nextLine()

    print("Masukkan NIM: ")
    val nim = input.nextLine()

    print("Masukkan Nama: ")
    val name = input.nextLine()

    val student = if (choice == 1) {
        print("Masukkan Jurusan: ")
        val major = input.nextLine()
        Student(nim, name, major)
    } else {
        Student(nim, name)
    }

    println("\nData Mahasiswa:")
    println("NIM: ${student.nim}")
    println("Nama: ${student.name}")
    println("Jurusan: ${student.major}")
    println("IPK: ${student.gpa}")

    println("\n=== Sistem Peminjaman Buku ===")

    print("Judul Buku: ")
    val title = input.nextLine()

    print("Nama Peminjam: ")
    val borrower = input.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = input.nextInt()
    input.nextLine()

    // Validasi: tidak boleh minus
    if (duration < 0) {
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("\nDetail Peminjaman:")
    println("Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Durasi: ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")
}

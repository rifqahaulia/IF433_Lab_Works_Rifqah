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

    // ======================================
    // TASK 1 - LIBRARY SYSTEM
    // ======================================

    println("\n=== Sistem Peminjaman Buku ===")

    print("Judul Buku: ")
    val title = input.nextLine()

    print("Nama Peminjam: ")
    val borrower = input.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = input.nextInt()
    input.nextLine()

    if (duration < 0) {
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("\nDetail Peminjaman:")
    println("Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Durasi: ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")

    // ======================================
    // TASK 2 - MINI RPG BATTLE (CHECKPOINT 10)
    // ======================================

    println("\n=== MINI RPG BATTLE ===")

    print("Masukkan Nama Hero: ")
    val heroName = input.nextLine()

    print("Masukkan Base Damage Hero: ")
    val damage = input.nextInt()
    input.nextLine()

    val hero = Hero(heroName, damage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("\n1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        val action = input.nextInt()
        input.nextLine()

        if (action == 1) {

            hero.attack("Enemy")

            enemyHp -= hero.baseDamage
            if (enemyHp < 0) {
                enemyHp = 0
            }

            println("HP Enemy: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Enemy menyerang balik sebesar $enemyDamage!")
                hero.takeDamage(enemyDamage)
                println("HP Hero: ${hero.hp}")
            }

        } else if (action == 2) {
            println("Kamu kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")

    if (hero.isAlive() && enemyHp == 0) {
        println("${hero.name} MENANG!")
    } else if (!hero.isAlive()) {
        println("${hero.name} KALAH!")
    } else {
        println("Pertarungan dihentikan.")
    }
}

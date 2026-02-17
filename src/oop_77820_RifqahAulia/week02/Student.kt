package oop_77820_RifqahAulia.week02

class Student(
    val nim: String,
    var name: String,
    var major: String,
    var gpa: Double = 0.0
) {

    init {
        if (nim.length != 10) {
            println("WARNING: NIM harus 10 digit!")
        }

        if (name.isBlank()) {
            println("WARNING: Nama tidak boleh kosong!")
        }

        if (major.isBlank()) {
            println("WARNING: Jurusan tidak boleh kosong!")
        }
    }

    constructor(nim: String, name: String) : this(nim, name, "Non-Matriculated")
}

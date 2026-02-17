package oop_<nim>_<nama>.week02

class Student(
    val nim: String,
    var name: String,
    var major: String
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

    // Secondary Constructor
    constructor(nim: String, name: String) : this(nim, name, "Non-Matriculated")
}

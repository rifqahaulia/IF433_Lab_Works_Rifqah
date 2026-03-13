package oop_77820_RifqahAulia.week06

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol $name berhasil diklik!")
    }
}
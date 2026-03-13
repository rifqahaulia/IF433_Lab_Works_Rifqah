package oop_77820_RifqahAulia.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Smart speaker $name dinyalakan.")
    }

    override fun turnOff() {
        println("Smart speaker $name dimatikan.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}
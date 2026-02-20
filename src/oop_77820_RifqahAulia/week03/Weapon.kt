package oop_77820_RifqahAulia.week03

class Weapon(val name: String) {

    var damage: Int = 0
        set(value) {
            when {
                value < 0 -> {
                    println("Damage tidak boleh negatif! Nilai tidak diubah.")
                }
                value > 1000 -> {
                    println("Damage terlalu besar! Di-set ke 1000.")
                    field = 1000
                }
                else -> {
                    field = value
                }
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}
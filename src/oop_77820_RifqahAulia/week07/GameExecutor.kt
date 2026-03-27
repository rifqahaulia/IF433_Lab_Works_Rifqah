package oop_77820_RifqahAulia.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Musuh muncul: ${event.monsterName}")
        }
        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Loot didapat: $name | Damage: $damage | Rarity: $rarity")
        }
        is BattleState.GameOver -> {
            println("Game Over: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Berada di zona aman")
        }
    }
}
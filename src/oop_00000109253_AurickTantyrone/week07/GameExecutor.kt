package oop_00000109253_AurickTantyrone.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Waspada! Muncul monster: ${event.monsterName}!")
        }
        is BattleState.LootDropped -> {
            val item = event.item
            println("HOKI! Kamu mendapatkan [${item.name}]")
            println("Rarity: ${item.rarity} (Drop Chance: ${item.rarity.dropChance}%)")
            println("Stat: Damage +${item.damage}")
        }
        is BattleState.GameOver -> {
            println("GAME OVER: ${event.reason}")
            GameManager.isGameRunning = false
        }
        BattleState.SafeZone -> {
            println("Kamu memasuki Safe Zone. Silakan beristirahat.")
        }
    }
}
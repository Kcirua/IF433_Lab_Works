package oop_00000109253_AurickTantyrone.week07

fun main() {
    println("=== Test SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // Instansiasi lewat Factory
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1) // Akan mencetak memori hash
    println("Sama? ${reg1 == reg2}") // False

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1) // Otomatis readable format
    println("Sama? ${data1 == data2}") // True (Structural Equality)

    val data3 = data1.copy(age = 32)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1 // Destructuring Declaration
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    // ERROR: 'when' expression must be exhaustive
    val uiMessage = when(response) {
        ApiResponse.Loading -> "Tampilkan Spinner"
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
    }
    println(uiMessage)

    //////////////////////////////////////////////////////////////
    println("Pemanggilan Pertama")
    GameManager.startGame()

    println("Pemanggilan Kedua")
    GameManager.startGame()

    println("Current Game Status: ${GameManager.isGameRunning}")

    val legendaryChance = ItemRarity.LEGENDARY.dropChance
    println("Drop Chance Item LEGENDARY: $legendaryChance%")

    val myStarterWeapon = Weapon.forgeStarterSword()

    println("Senjata Diterima: ${myStarterWeapon.item.name}")
    println("Rarity: ${myStarterWeapon.item.rarity}")
    println("Durability Awal: ${myStarterWeapon.durability}")

    val myEpicWeapon = Weapon.forgeEpicSword()
    println("Senjata Cadangan: ${myEpicWeapon.item.name} (Damage: ${myEpicWeapon.item.damage})")

    val upgradedItem = myStarterWeapon.item.copy(
        name = "Pedang Kayu Legendaris (Upgraded)",
        damage = 25,
        rarity = ItemRarity.RARE
    )
    println("Berhasil Upgrade! Damage lama: ${myStarterWeapon.item.damage} -> Baru: ${upgradedItem.damage}")

    println("\nJalannya Pertualangan")

    processEvent(BattleState.SafeZone)

    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))

    processEvent(BattleState.LootDropped(upgradedItem))

    processEvent(BattleState.GameOver("Terkena jebakan racun"))

    println("Status Engine Akhir: ${GameManager.isGameRunning}")
}
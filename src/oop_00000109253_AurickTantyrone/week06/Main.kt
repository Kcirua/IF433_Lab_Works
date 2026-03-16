package oop_00000109253_AurickTantyrone.week06

// Fungsi ini decoupled! Tidak peduli kelas aslinya apa.
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount) // Dynamic polymorphism in action
}

fun main() {
    val myWatch = Smartwatch ()
    myWatch.showTime()

    val myPhone = Smartphone ()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)

    /////////////////////////////////////////
    val lampuKamar = SmartLamp(id = "Lampu1", name = "Kamar")

    val speakerDapur = SmartSpeaker(id = "Speaker1", name = "JBL")

    val cctvGarasi = SmartCCTV(id = "Camera1", name = "Canon")

    println("Berhasil menginisialisasi 3 perangkat:")
    println("- ${lampuKamar.name} (ID: ${lampuKamar.id})")
    println("- ${speakerDapur.name} (ID: ${speakerDapur.id})")
    println("- ${cctvGarasi.name} (ID: ${cctvGarasi.id})")
}
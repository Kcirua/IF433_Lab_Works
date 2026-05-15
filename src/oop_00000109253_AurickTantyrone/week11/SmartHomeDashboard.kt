package oop_00000109253_AurickTantyrone.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice(name = "", category = "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    val acUnit = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(acUnit)

    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    val searchResult = homeDevices.find { it.category == "Camera" }

    searchResult?.let {
        println(it.diagnose())
    }

    println("\n=== DASHBOARD SUMMARY ===")
    with(homeDevices) {
        println("Total perangkat terdaftar: ${this.size}")
    }

    val totalPower = homeDevices.run { sumOf { it.powerLoad } }
    println("Total daya keseluruhan: $totalPower Watt")
}
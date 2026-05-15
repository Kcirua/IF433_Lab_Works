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
}
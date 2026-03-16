package oop_00000109253_AurickTantyrone.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Lampu pintar '$name' (ID: $id) DINYALAKAN. Ruangan menjadi terang.")
    }

    override fun turnOff() {
        println("Lampu pintar '$name' (ID: $id) DIMATIKAN. Ruangan menjadi gelap.")
    }
}
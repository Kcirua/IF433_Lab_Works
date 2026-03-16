package oop_00000109253_AurickTantyrone.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("CCTV '$name' (ID: $id) DINYALAKAN. Sistem keamanan aktif.")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV '$name' (ID: $id) DIMATIKAN.")
        stopRecord()
    }

    override fun startRecord() {
        println("Sedang merekam video keamanan...")
    }
}
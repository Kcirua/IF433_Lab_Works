package oop_00000109253_AurickTantyrone.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("[Hub] Perangkat '${device.name}' (ID: ${device.id}) ditambahkan ke sistem.")
    }

    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            } else {
                println("=> [Hub] Mengabaikan '${device.name}' (Bukan Switchable).")
            }
        }
    }
}
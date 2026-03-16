package oop_00000109253_AurickTantyrone.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Smart Speaker '$name' (ID: $id) MENYALA. Siap menerima perintah suara.")
    }

    override fun turnOff() {
        println("Smart Speaker '$name' (ID: $id) MATI. Masuk ke mode standby.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}
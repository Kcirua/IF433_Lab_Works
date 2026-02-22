package oop_00000109253_AurickTantyrone.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    ///////////////////////////////////////////////////////////////

    val myWeapon = Weapon("Pedang")

    myWeapon.damage = -50
    println("Damage saat ini: ${myWeapon.damage}")

    myWeapon.damage = 9999
    println("Damage saat ini: ${myWeapon.damage}")

    println("Nama Senjata: ${myWeapon.name}")
    println("Tier Senjata: ${myWeapon.tier}")
}
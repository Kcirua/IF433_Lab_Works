package oop_00000109253_AurickTantyrone.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- Game Hero ---")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage: ")
    val heroDamage = scanner.nextInt()

    val myHero = Hero(heroName, heroDamage)

    var enemyHp = 100
    val enemyName = "Avengers"

    println("$heroName VS $enemyName")

    while (myHero.isAlive() && enemyHp > 0) {
        println("Status Hero:")
        println("${myHero.name} HP: ${myHero.hp}")
        println("$enemyName HP: $enemyHp")

        println("Menu: 1. Serang, 2. Kabur")
        print("Pilihan: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            myHero.attack(enemyName)
            enemyHp -= myHero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("$enemyName hit ${myHero.baseDamage} HP!")

            if (enemyHp > 0) {
                val damageToHero = (10..20).random()

                println("$enemyName menyerang")
                myHero.takeDamage(damageToHero)
                println("${myHero.name} hit $damageToHero HP!")
            }

        } else if (choice == 2) {
            println("${myHero.name} lari dari pertarungan")
            break
        } else {
            println("Tidak ada pilihan")
        }
    }

    println("--- Hasil ---")
    if (enemyHp <= 0) {
        println("Menang! ${myHero.name} berhasil kalahkan $enemyName!")
    } else if (!myHero.isAlive()) {
        println("GAME OVER. ${myHero.name} gagal dalam pertarungan.")
    } else {
        println("Kamu Kabur dari pertarungan.")
    }
}
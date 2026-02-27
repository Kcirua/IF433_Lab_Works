package oop_00000109253_AurickTantyrone.week04

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        val standardBonus = super.calculateBonus()
        return standardBonus + 500000
    }
}
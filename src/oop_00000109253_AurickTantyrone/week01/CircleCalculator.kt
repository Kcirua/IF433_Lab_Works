package oop_00000109253_AurickTantyrone.week01

fun main() {

    val radius = 7.0
    val pi = 3.14

    var area: Double = pi * radius * radius

    println("Radius: $radius, Area: $area")
    println(checkSize(area))
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}

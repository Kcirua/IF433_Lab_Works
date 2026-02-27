package oop_00000109253_AurickTantyrone.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()   // Memanggil method milik sendiri
    myCar.honk()        // Memanggil method yang sudah di-override
    myCar.accelerate()  // Memanggil gabungan method Parent dan Child

    ///////////////////

    val mycars = ElectricCar(brand = "BYD", numberOfDoors = 4, batteryCapacity = 100)
    mycars.accelerate()
    mycars.honk()
    mycars.openTrunk()

    //////////////////
    val myManager = Manager(name = "Aurick", baseSalary = 15000000)
    myManager.work()
    println("Bonus kepada ${myManager.name} sebesar: Rp ${myManager.calculateBonus()}")

    val myDeveloper = Developer(name = "Tan", baseSalary = 8000000, programmingLanguage = "Kotlin")
    myDeveloper.work()
    println("Bonus kepada ${myDeveloper.name} sebesar: Rp ${myDeveloper.calculateBonus()}")
}
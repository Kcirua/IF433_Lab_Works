package oop_00000109253_AurickTantyrone.week12

sealed class FeederException(msg: String) : Exception(msg) {
    class EmptyFoodStockException(msg: String = "Peringatan: Stok makanan kibble habis!") : FeederException(msg)

    class MotorJammedException(msg: String = "Error Mekanik: Motor dispenser tersangkut!") : FeederException(msg)
}
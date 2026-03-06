package oop_00000109253_AurickTantyrone.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}
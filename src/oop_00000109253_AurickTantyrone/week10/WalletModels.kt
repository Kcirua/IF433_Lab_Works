package oop_00000109253_AurickTantyrone.week10

interface Searchable {
    val searchKey: String
}

data class Coin(val name: String, val balance: Double) : Searchable {
    override val searchKey: String = name
}

data class Transaction(val id: String, val amount: Double) : Searchable {
    override val searchKey: String = id
}
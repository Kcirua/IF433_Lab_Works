package oop_00000109253_AurickTantyrone.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByQuery(query: String): T? {
        return items.find { it.searchKey.equals(query, ignoreCase = true) }
    }
}
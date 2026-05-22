package oop_00000109253_AurickTantyrone.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw FeederException.DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FeederException.FoodEmptyException(requestedGram, availableGram)
    }

    return availableGram - requestedGram
}
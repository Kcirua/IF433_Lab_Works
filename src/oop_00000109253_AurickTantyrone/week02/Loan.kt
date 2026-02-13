package oop_00000109253_AurickTantyrone.week02

class Loan(
    var bookTitle: String,
    var borrower: String,
    var loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}
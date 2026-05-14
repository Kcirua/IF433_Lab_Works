package oop_00000109253_AurickTantyrone.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)
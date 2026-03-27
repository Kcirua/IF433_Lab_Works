package oop_00000109253_AurickTantyrone.week07

enum class AppState {
    STARTING,RUNNING, STOOPED
}

sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}
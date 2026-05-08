package oop_77820_RifqahAulia.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)
package com.example.myfitnessapp.model

data class User(
    val id: Int,
    val name: String,
    val age: Int,
    val weight: Float,
    val height: Float,
    val email: String,
    val password: String
) {
    fun calculateBMI(): Float {
        return weight / ((height / 100) * (height / 100))
    }
}
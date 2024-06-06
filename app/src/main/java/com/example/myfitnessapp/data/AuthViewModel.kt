package com.example.myfitnessapp.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData



import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel() {

    // LiveData for authentication state
    private val _isAuthenticated = MutableLiveData<Boolean>()
    val isAuthenticated: LiveData<Boolean>
        get() = _isAuthenticated

    // Function to authenticate user
    fun authenticateUser(username: String, password: String) {
        // Your authentication logic here
        // For example, validating username and password
        val isAuthenticated = validateCredentials(username, password)
        _isAuthenticated.value = isAuthenticated
    }

    // Dummy authentication logic (replace with your actual logic)
    private fun validateCredentials(username: String, password: String): Boolean {
        // Dummy logic: Check if username and password are not empty
        return username.isNotBlank() && password.isNotBlank()
    }

    // Function to log out user
    fun logout() {
        _isAuthenticated.value = false
    }
}
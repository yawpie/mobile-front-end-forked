package com.dicoding.snapp_smartnutritionapp.data.response

data class RegisterResponse(
	val error: String? = null,
	val message: String? = null,
	val statusCode: Int? = null
)
data class RegisterRequest(
    val username: String,
    val email: String,
    val password: String
)


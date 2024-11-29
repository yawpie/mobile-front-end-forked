package com.dicoding.snapp_smartnutritionapp.data.response

import com.google.gson.annotations.SerializedName
data class Response(
	@SerializedName("message")
	val message: String
)
data class RegisterRequest(
	val username: String,
	val email: String,
	val password: String
)



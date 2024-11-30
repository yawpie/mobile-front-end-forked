package com.dicoding.snapp_smartnutritionapp.data.retrofit


import com.dicoding.snapp_smartnutritionapp.data.response.LoginRequest
import com.dicoding.snapp_smartnutritionapp.data.response.RegisterRequest
import com.dicoding.snapp_smartnutritionapp.data.response.RegisterResponse
import retrofit2.Call
import retrofit2.http.Body


import retrofit2.http.POST

interface ApiService {
    @POST("register")
    fun register(@Body request: RegisterRequest): Call<RegisterResponse>
    @POST("login")
    fun login(@Body request: LoginRequest): Call<RegisterResponse>
}
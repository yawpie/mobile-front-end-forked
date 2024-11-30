package com.dicoding.snapp_smartnutritionapp.data.retrofit


import com.dicoding.snapp_smartnutritionapp.data.response.RegisterRequest
import com.dicoding.snapp_smartnutritionapp.data.response.RegisterResponse
import retrofit2.Call

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded

import retrofit2.http.POST

interface ApiService {

    @FormUrlEncoded
    @POST("/register")
    fun register(
        @Field("username") username: String,
        @Field("email") email: String,
        @Field("password") password: String
    ): Call<RegisterResponse>
//    @POST("register")
//    fun register(@Body requestBody: RegisterRequest):Call<RegisterResponse>
}
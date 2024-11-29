package com.dicoding.snapp_smartnutritionapp.data.retrofit

import com.dicoding.snapp_smartnutritionapp.data.response.BaseResponse
import com.dicoding.snapp_smartnutritionapp.data.response.RegisterRequest
import com.dicoding.snapp_smartnutritionapp.data.response.Response
import okhttp3.Call
import okhttp3.ResponseBody
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {

    @POST("user")
    suspend fun createUser(@Body registerRequest: RegisterRequest): retrofit2.Response<BaseResponse<Response>>
}
package com.dicoding.snapp_smartnutritionapp.data.response

import com.google.gson.annotations.SerializedName

data class BaseResponse<T>(
    @SerializedName("status_code") val status_code: Int,
    @SerializedName("message") val message: String,
    @SerializedName("data") val data: T?
)
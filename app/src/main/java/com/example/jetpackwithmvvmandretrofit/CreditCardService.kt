package com.example.jetpackwithmvvmandretrofit

import retrofit2.http.GET

interface CreditCardService {
    @GET("photos")
    suspend fun getCreditCards(): List<CreditCard>
}
package com.example.jetpackwithmvvmandretrofit

import retrofit2.http.GET

interface CreditCardService {
    @GET("credit-cards")
    suspend fun getCreditCards(): List<CreditCard>
}
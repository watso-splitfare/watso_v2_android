package com.example.taxiwatsso

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitBuilder {
    var api: API = Retrofit.Builder()
        .baseUrl("만들어야함")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(API::class.java)
}
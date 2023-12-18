package com.example.taxiwatsso

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface API {
    @GET("링크")
    fun getData(): Call<List<Taxi>>

    //@FormUrlEncoded
    //@POST("링크")
    //fun getPostList(@Field("userId") userId: Int,
    //                @Field("id") id: Int,
    //                @Field("title") title: String,
    //                @Field("body") body: String): Call<Taxi>
}
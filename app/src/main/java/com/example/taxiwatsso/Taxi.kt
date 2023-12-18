package com.example.taxiwatsso

import com.google.gson.annotations.SerializedName

data class Taxi(@SerializedName("time") val time: String,
           @SerializedName("dep") val dep: String,
           @SerializedName("arv") val arv: String,
           @SerializedName("count") val count: String,
           @SerializedName("state") val state: Int)


//class Taxi (val time: String, val dep: String, val arv: String, val count: String, val state: Int)

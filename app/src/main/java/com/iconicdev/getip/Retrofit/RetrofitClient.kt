package com.iconicdev.getip.Retrofit

import com.iconicdev.getip.Retrofit.ApiServices
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

public class RetrofitClient {
    fun getClient(): ApiServices {
        val httpClient = OkHttpClient.Builder()
        val builder = Retrofit.Builder()
            .baseUrl("http://ip-api.com/")
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())

        val retrofit = builder
            .client(httpClient.build())
            .build()
        return retrofit.create(ApiServices::class.java)
    }
}
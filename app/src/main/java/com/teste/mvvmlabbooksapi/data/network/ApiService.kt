package com.teste.mvvmlabbooksapi.data.network

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ApiService {

    private fun initRetrofit():Retrofit{
       return Retrofit.Builder()
            .baseUrl("https://api.nytimes.com/svc/books/v3/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
    var service = initRetrofit().create(NytServices::class.java)
}
package com.teste.mvvmlabbooksapi.data.network

import com.teste.mvvmlabbooksapi.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NytServices {

    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey: String = "HRV4b7ilNr9YdCnIa5mQGDeGGWrvKcr2",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<List<BookBodyResponse>>

}
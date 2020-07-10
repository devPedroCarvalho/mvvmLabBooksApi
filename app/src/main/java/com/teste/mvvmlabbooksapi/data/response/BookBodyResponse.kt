package com.teste.mvvmlabbooksapi.data.response

import com.google.gson.annotations.SerializedName


data class BookBodyResponse(
    @SerializedName("results")
    val bookResult: List<BookResultsResponse>
)


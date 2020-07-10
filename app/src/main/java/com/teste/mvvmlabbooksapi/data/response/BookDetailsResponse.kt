package com.teste.mvvmlabbooksapi.data.response

import com.google.gson.annotations.SerializedName

data class BookDetailsResponse(
    @SerializedName("title")
    val title: String,
    @SerializedName("author")
    val author: String

)
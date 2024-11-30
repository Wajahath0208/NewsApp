package com.wajahath.newsapp.api

import com.wajahath.newsapp.models.NewsResponse
import com.wajahath.newsapp.util.Constants.Companion.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Response

interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun getHeadlines(
        @Query("country")
        countryCode: String="us",
        @Query("page")
        pageNumber: Int=1,
        @Query("apiKey")
        apiKey: String=API_KEY

    ):Response<NewsResponse>
    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery: String,
        @Query("page")
        pageNumber: Int=1,
        @Query("apiKey")
        apiKey: String=API_KEY

    ):Response<NewsResponse>
}
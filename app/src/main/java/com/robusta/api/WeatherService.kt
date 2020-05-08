package com.robusta.api

import com.robusta.ui.home.data.model.WeatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

    @GET("forecast")
    suspend fun getWeatherData(
        @Query("id") id: String? = "",
        @Query("APPID") APPID: String
    ): Response<WeatherResponse>
}

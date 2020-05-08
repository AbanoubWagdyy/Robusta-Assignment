package com.robusta.ui.home.data.remoteDataSource


import com.robusta.BuildConfig
import com.robusta.api.BaseDataSource
import com.robusta.api.WeatherService
import com.robusta.testing.OpenForTesting
import javax.inject.Inject

@OpenForTesting
class WeatherRemoteDataSource @Inject constructor(private val service: WeatherService) :
    BaseDataSource() {

    suspend fun getWeatherData(id: String, appId: String) =
        getResult { service.getWeatherData(BuildConfig.id, BuildConfig.APPID) }
}
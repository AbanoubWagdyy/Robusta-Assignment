package com.robusta.ui.home.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.robusta.ui.home.data.remoteDataSource.WeatherRemoteDataSource
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.robusta.data.Result
import com.robusta.ui.home.data.model.WeatherResponse

class WeatherRepository @Inject constructor(
    private val remoteSource: WeatherRemoteDataSource
) {

    fun getCurrentWeatherData(): LiveData<Result<WeatherResponse>> {
        return liveData(Dispatchers.IO) {
            emit(Result.loading(null))
            val updatedCurrencyResponse = remoteSource.getWeatherData("", "")
            if (updatedCurrencyResponse.status == Result.Status.SUCCESS) {
                emit(Result.success(updatedCurrencyResponse.data!!))
            } else {
                emit(Result.error("Fetch Error", null))
            }
        }
    }
}
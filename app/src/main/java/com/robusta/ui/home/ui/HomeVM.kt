package com.robusta.ui.home.ui

import androidx.lifecycle.ViewModel
import com.robusta.ui.home.data.WeatherRepository
import javax.inject.Inject

class HomeVM @Inject constructor(var weatherRepository: WeatherRepository) : ViewModel() {

}
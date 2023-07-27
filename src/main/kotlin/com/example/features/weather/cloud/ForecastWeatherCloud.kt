package com.example.features.weather.cloud

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForecastWeatherCloud(@SerialName("forecastday") val forecastday: List<ForecastWeatherDayCloud?>?)
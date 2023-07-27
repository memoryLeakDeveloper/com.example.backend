package com.example.features.weather.cloud

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CurrentWeatherComposeCloud(
    @SerialName("current") val current: WeatherCloud?,
    @SerialName("forecast") val forecast: ForecastWeatherCloud?,
    @SerialName("location") val location: LocationCloud?
)
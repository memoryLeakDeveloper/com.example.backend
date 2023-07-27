package com.example.features.weather.cloud

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForecastWeatherDayCloud(
    @SerialName("date") val date: String?,
    @SerialName("date_epoch") val dateEpoch: Int?,
    @SerialName("day") val day: WeatherDayCloud?,
    @SerialName("astro") val astro: AstroCloud?,
    @SerialName("hour") val hour: List<HoursCloud?>?
)
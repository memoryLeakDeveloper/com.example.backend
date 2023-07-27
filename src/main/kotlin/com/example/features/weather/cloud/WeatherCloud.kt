package com.example.features.weather.cloud

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherCloud(
    @SerialName("last_updated") val lastUpdated: String?,
    @SerialName("last_updated_epoch") val lastUpdatedEpoch: Int?,
    @SerialName("temp_c") val tempC: Float?,
    @SerialName("temp_f") val tempF: Float?,
    @SerialName("feelslike_c") val feelslikeC: Float?,
    @SerialName("feelslike_f") val feelslikeF: Float?,
    @SerialName("condition") val condition: ConditionCloud?,
    @SerialName("wind_mph") val windMph: Float?,
    @SerialName("wind_kph") val windKph: Float?,
    @SerialName("wind_degree") val windDegree: Int?,
    @SerialName("wind_dir") val windDir: String?,
    @SerialName("pressure_mb") val pressureMb: Float?,
    @SerialName("pressure_in") val pressureIn: Float?,
    @SerialName("precip_mm") val precipMm: Float?,
    @SerialName("precip_in") val precipIn: Float?,
    @SerialName("humidity") val humidity: Int?,
    @SerialName("cloud") val cloud: Int?,
    @SerialName("is_day") val isDay: Int?,
    @SerialName("uv") val uv: Float?,
    @SerialName("gust_mph") val gustMph: Float?,
    @SerialName("gust_kph") val gustKph: Float?
)


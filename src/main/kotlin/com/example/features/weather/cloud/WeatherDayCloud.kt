package com.example.features.weather.cloud

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherDayCloud(
    val avghumidity: Int?,
    @SerialName("avgtemp_c") val avgtempC: Double?,
    @SerialName("avgtemp_f") val avgtempF: Double?,
    @SerialName("avgvis_km") val avgvisKm: Double?,
    @SerialName("avgvis_miles") val avgvisMiles: Int?,
    @SerialName("condition") val condition: ConditionCloud?,
    @SerialName("daily_chance_of_rain") val dailyChanceOfRain: Int?,
    @SerialName("daily_chance_of_snow") val dailyChanceOfSnow: Int?,
    @SerialName("daily_will_it_rain") val dailyWillItRain: Int?,
    @SerialName("daily_will_it_snow") val dailyWillItSnow: Int?,
    @SerialName("maxtemp_c") val maxtempC: Double?,
    @SerialName("maxtemp_f") val maxtempF: Double?,
    @SerialName("maxwind_kph") val maxwindKph: Double?,
    @SerialName("maxwind_mph") val maxwindMph: Double?,
    @SerialName("mintemp_c") val mintempC: Double?,
    @SerialName("mintemp_f") val mintempF: Double?,
    @SerialName("totalprecip_in") val totalprecipIn: Double?,
    @SerialName("totalprecip_mm") val totalprecipMm: Double?,
    @SerialName("totalsnow_cm") val totalsnowCm: Int?,
    @SerialName("uv") val uv: Int?
)


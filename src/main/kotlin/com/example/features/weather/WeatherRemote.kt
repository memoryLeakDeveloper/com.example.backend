package com.example.features.weather

import com.example.features.weather.cloud.CurrentWeatherComposeCloud
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherReceiveRemote(@SerialName("city") val city: String)

@Serializable
data class WeatherResponseRemote(val data: CurrentWeatherComposeCloud?)
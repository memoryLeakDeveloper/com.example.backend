package com.example.features.weather

class WeatherRepository(private val fetchWeatherDataSource: FetchWeatherDataSource) {

    suspend fun fetchWeather(token: String, city: String?) = fetchWeatherDataSource.fetch(token, city)

}
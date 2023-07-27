package com.example.features.weather

import com.example.features.weather.cloud.CurrentWeatherComposeCloud
import com.google.gson.Gson
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.accept
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.contentType

class FetchWeatherDataSource {

    suspend fun fetch(token: String, city: String?): CurrentWeatherComposeCloud? {
        return try {
            val httpClient = HttpClient(CIO) {
                defaultRequest {
                    contentType(ContentType.Application.Json)
                    accept(ContentType.Application.Json)
                }
            }
            val request =
                httpClient.get("https://api.weatherapi.com/v1/forecast.json?q=${city}&days=3&key=${token}") {
                    accept(ContentType.Application.Json)
                }
            Gson().fromJson(request.bodyAsText(), CurrentWeatherComposeCloud::class.java)
        } catch (e: Exception) {
            println("e  = $e")
            return null
        }
    }

}
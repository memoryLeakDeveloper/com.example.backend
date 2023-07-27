package com.example.features.weather

import com.example.cloud.Api
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.ApplicationCall
import io.ktor.server.request.receive
import io.ktor.server.response.respond

class WeatherController(private val call: ApplicationCall) {

    private val repository = WeatherRepository(FetchWeatherDataSource())

    suspend fun fetch() {
        val receive = call.receive<WeatherReceiveRemote>()
        repository.fetchWeather(Api.API_KEY, receive.city)?.let {
            call.respond(HttpStatusCode.OK, WeatherResponseRemote(it))
        } ?: run {
            call.respond(HttpStatusCode.BadRequest, "СЛАМАЛАСЯ")
        }
    }

}
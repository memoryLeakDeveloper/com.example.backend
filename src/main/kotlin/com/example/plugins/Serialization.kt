package com.example.plugins

import com.example.features.login.LoginController
import com.example.features.register.RegisterController
import com.example.features.weather.WeatherController
import io.ktor.http.ContentType
import io.ktor.serialization.kotlinx.KotlinxSerializationConverter
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.application.install
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import io.ktor.server.routing.get
import io.ktor.server.routing.post
import io.ktor.server.routing.routing
import kotlinx.serialization.json.Json

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        val converter = KotlinxSerializationConverter(Json {
            prettyPrint = true
            ignoreUnknownKeys = true
            explicitNulls = false
        })
        register(ContentType.Application.Json, converter)
    }
    routing {
        post("/register") {
            val registerController = RegisterController(call)
            registerController.registerNewUser()
        }
        post("/login") {
            val loginController = LoginController(call)
            loginController.performLogin()
        }
        get("/weather") {
            val weatherController = WeatherController(call)
            weatherController.fetch()
        }
    }
}
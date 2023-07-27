package com.example.plugins

import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Привет игорёк")
        }

        get("/test") {
            call.respondText("Test Hello World")
        }
    }
}
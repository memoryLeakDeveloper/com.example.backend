package com.example.features.games

import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.routing.post
import io.ktor.server.routing.routing

fun Application.configureGameRouting() {

    routing {
        post("/games/create") {
            GamesController(call).createGame()
        }

        post("/games/search") {
            GamesController(call).performSearch()
        }
    }
}
package com.example

import com.example.plugins.configureRouting
import com.example.plugins.configureSerialization
import io.ktor.server.application.Application
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main() {

    embeddedServer(Netty, port = 8080, host = "192.168.31.68") {
        modules()
    }.start(wait = true)

}

fun Application.modules() {
    com.example.DatabaseFactory.init()
    configureRouting()
    configureSerialization()
}

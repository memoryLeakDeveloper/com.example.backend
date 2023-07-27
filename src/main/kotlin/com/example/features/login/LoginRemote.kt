package com.example.features.login

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LoginReceiveRemote(@SerialName("login") val login: String, @SerialName("password") val password: String)

@Serializable
data class LoginResponseRemote(val token: String)

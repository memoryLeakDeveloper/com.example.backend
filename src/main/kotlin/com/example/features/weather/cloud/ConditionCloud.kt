package com.example.features.weather.cloud

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ConditionCloud(
    @SerialName("code") val code: Int?,
    @SerialName("icon") val icon: String?,
    @SerialName("text") val text: String?
)


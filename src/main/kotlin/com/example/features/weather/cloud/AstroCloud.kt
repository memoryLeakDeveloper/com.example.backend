package com.example.features.weather.cloud

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AstroCloud(
    @SerialName("moon_illumination") val moonIllumination: String?,
    @SerialName("moon_phase") val moonPhase: String?,
    @SerialName("moonrise") val moonrise: String?,
    @SerialName("moonset") val moonset: String?,
    @SerialName("sunrise") val sunrise: String?,
    @SerialName("sunset") val sunset: String?,
    @SerialName("is_moon_up") var isMoonUp: Int?,
    @SerialName("is_sun_up") var isSunUp: Int?
)

package com.hiraok.smartcompass

import com.hiraok.smartcompass.response.EventResponse
import retrofit2.http.GET

interface CompassApi {
    @GET("/api/v1/event/")
    suspend fun getEventAll(): EventResponse

}

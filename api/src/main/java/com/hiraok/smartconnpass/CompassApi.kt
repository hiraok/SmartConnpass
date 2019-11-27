package com.hiraok.smartconnpass

import com.hiraok.smartconnpass.response.EventListResponse
import retrofit2.http.GET

interface CompassApi {
    @GET("api/v1/event")
    suspend fun getEventAll(): EventListResponse
}

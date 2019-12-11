package com.hiraok.smartconnpass

import com.hiraok.smartconnpass.response.EventListResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface CompassApi {
    @GET("api/v1/event")
    suspend fun getEventAll(@Query("count") count: Int = 100): EventListResponse
}

package com.hiraok.smartcompass

import com.hiraok.smartcompass.response.EventListResponse
import retrofit2.Retrofit
import javax.inject.Inject

class CompassApiImpl @Inject constructor(
    retrofit: Retrofit
) : CompassApi {
    private val client = retrofit.create(CompassApi::class.java)
    override suspend fun getEventAll(): EventListResponse = client.getEventAll()
}
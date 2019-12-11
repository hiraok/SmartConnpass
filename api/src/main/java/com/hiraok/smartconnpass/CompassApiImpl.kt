package com.hiraok.smartconnpass

import com.hiraok.smartconnpass.response.EventListResponse
import retrofit2.Retrofit
import javax.inject.Inject

class CompassApiImpl @Inject constructor(
    retrofit: Retrofit
) : CompassApi {
    private val client = retrofit.create(CompassApi::class.java)
    override suspend fun getEventAll(count: Int): EventListResponse = client.getEventAll()
}
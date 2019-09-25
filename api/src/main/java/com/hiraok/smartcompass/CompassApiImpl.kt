package com.hiraok.smartcompass

import com.hiraok.smartcompass.response.EventResponse
import retrofit2.Retrofit
import javax.inject.Inject

class CompassApiImpl @Inject constructor(
    private val retrofit: Retrofit
) : CompassApi {
    override suspend fun getEventAll(
    ): EventResponse {
        val retrofit = retrofit.create(CompassApi::class.java)
        return retrofit.getEventAll()
    }

}